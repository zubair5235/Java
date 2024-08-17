import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class RecoverBST{
    static Node root;
    static Node firstElement = null;
    static Node secondElement = null;
    static Node prevElement = new Node(Integer.MIN_VALUE);

    static class Node{
        int data;
        Node left, right;
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
        System.out.println("Before");
        levelOrder(root);
        recover(root);
        System.out.println("\nAfter");
        levelOrder(root);
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
                curr.left = new Node(Integer.parseInt(s[i]));
                q.add(curr.left);
            }
            i++;
            if(i >= s.length){
                break;
            }
            a = s[i];
            if(!a.equals("N")){
                curr.right = new Node(Integer.parseInt(s[i]));
                q.add(curr.right);
            }
            i++;
        }

        return root;
    }

    public static void recover(Node root){
        traverse(root);

        int temp = firstElement.data;
        firstElement.data = secondElement.data;
        secondElement.data = temp;
    }

    public static void traverse(Node root){
        if(root == null){
            return;
        }

        traverse(root.left);

        if(firstElement == null && prevElement.data >= root.data){
            firstElement = prevElement;
        }

        if(firstElement != null && prevElement.data >= root.data){
            secondElement = root;
        }

        prevElement = root;

        traverse(root.right);
    }

    public static void levelOrder(Node root){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        print(root,0,ans);
        for(int i = 0; i < ans.size(); i++){
            for(int j = 0; j < ans.get(i).size(); j++){
                System.out.print(ans.get(i).get(j) + " ");
            }
        }
    }

    public static void print(Node root, int level, ArrayList<ArrayList<Integer>> ans){
        if(root == null){
            return;
        }

        if(level == ans.size()){
            ArrayList<Integer> li = new ArrayList<>();
            li.add(root.data);
            ans.add(li);
        }
        else{
            ans.get(level).add(root.data);
        }

        print(root.left,level+1,ans);
        print(root.right,level+1,ans);
    }
}