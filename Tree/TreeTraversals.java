import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class TreeTraversals{
    static Node root;
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String values[] = s.split(" ");
        root = build(values);
        System.out.print("Preorder : ");
        preorder(root);
        System.out.println();
        System.out.print("Postorder : ");
        postorder(root);
        System.out.println();
        System.out.print("Inorder : ");
        inorder(root);

    }

    public static void preorder(Node root){
        if(root != null){
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void postorder(Node root){
        if(root != null){
            preorder(root.left);
            preorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void inorder(Node root){
        if(root != null){
            preorder(root.left);
            System.out.print(root.data + " ");
            preorder(root.right);
        }
    }

    public static Node build(String s[]){
        if(s[0] == "null" || s.length == 0){
            return null;
        }
        Node root = new Node(Integer.parseInt(s[0]));
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while(!q.isEmpty() && i < s.length){
            Node curr = q.poll();
            String a = s[i];
            if(!a.equals("null")){
                int h = Integer.parseInt(a);
                curr.left = new Node(h);
                q.add(curr.left);
            }
            i++;
            if(i >= s.length){
                break;
            }
            a = s[i];
            if(!a.equals("null")){
                int h = Integer.parseInt(a);
                curr.right = new Node(h);
                q.add(curr.right);
            }
            i++;
        }

        return root;
    }
}