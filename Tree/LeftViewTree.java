import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class LeftViewTree{
    static Node root;

    static int maxLevel = Integer.MIN_VALUE;

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;   
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String values[] = s.split(" ");
        root = buildTree(values);
        ArrayList<Integer> ans = new ArrayList<>();
        leftView(root,0);
        for(int i : ans){
            System.out.print(i + " ");
        }
    }

    public static Node buildTree(String[] s){
        if(s[0].equals("N") || s.length == 0){
            return null;
        }
        Node root = new Node(Integer.parseInt(s[0]));
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while(!q.isEmpty() && i < s.length){
            Node curr = q.poll();
            String a = s[i];
            if(!a.equals("N")){
                curr.left = new Node(Integer.parseInt(a));
                q.add(curr.left);
            }
            i++;
            if(i >= s.length){
                break;
            }
            a = s[i];
            if(!a.equals("N")){
                curr.right = new Node(Integer.parseInt(a));
                q.add(curr.right);
            }
            i++;
        }

        return root;
    }

    public static void leftView(Node root, int level){
        if(root == null){
            return;
        }

        if(maxLevel < level){
            System.out.print(root.data + " ");
            maxLevel = level;
        }

        leftView(root.left, level + 1);
        leftView(root.right, level + 1);
    }
}