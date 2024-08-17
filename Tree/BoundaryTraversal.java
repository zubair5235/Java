import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class BoundaryTraversal{
    static Node root;
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.left = null;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String values[] = s.split(" ");
        root = buildTree(values);
        printBoundary(root);
    }

    public static Node buildTree(String[] s){
        if(s[0].equals(null) || s.length == 0){
            return null;
        }
        Node root = new Node(Integer.parseInt(s[0]));
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while(!q.isEmpty() && i < s.length){
            Node curr = q.poll();
            String a = s[i];
            if(!a.equals("-1")){
                curr.left = new Node(Integer.parseInt(a));
                q.add(curr.left);
            }
            i++;
            if(i >= s.length){
                break;
            }
            a = s[i];
            if(!a.equals("-1")){
                curr.right = new Node(Integer.parseInt(a));
                q.add(curr.right);
            }
            i++;
        }

        return root;
    }

    public static void printBoundary(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        printBoundaryLeft(root.left);
        printLeaves(root.left);
        printLeaves(root.right);
        printBoundaryRight(root.right);
    }

    public static void printBoundaryLeft(Node root){
        if(root == null){
            return;
        }
        if(root.left != null){
            System.out.print(root.data + " ");
            printBoundaryLeft(root.left);
        }
        else if(root.right != null){
            System.out.print(root.data + " ");
            printBoundaryLeft(root.right);
        }
    }

    public static void printLeaves(Node root){
        if(root == null){
            return;
        }
        printLeaves(root.left);
        if(root.left == null && root.right == null){
            System.out.print(root.data + " ");
        }
        printLeaves(root.right);
    }

    public static void printBoundaryRight(Node root){
        if(root == null){
            return;
        }
        if(root.right != null){
            printBoundaryRight(root.right);
            System.out.print(root.data + " ");
        }
        else if(root.left != null){
            printBoundaryRight(root.left);
            System.out.print(root.data + " ");
        }
    }
}