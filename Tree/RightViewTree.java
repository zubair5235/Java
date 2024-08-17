import java.util.Queue;
import java.util.LinkedList;
import java.util.*;

public class RightViewTree{
    static Node root;
    static class Node{
        int data;
        Node left,right;
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
        ArrayList<Integer> ans = new ArrayList<Integer>();
        RightView(root,0,ans);
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

    public static void RightView(Node root,int c, ArrayList<Integer> ans){
        if(root == null){
            return;
        }
        if(c == ans.size()){
            ans.add(root.data);
        }
        RightView(root.right, c+1, ans);
        RightView(root.left, c+1, ans);
    }
}