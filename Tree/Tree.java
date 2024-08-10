import java.util.*;

public class Tree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] values = s.split(" ");
        Node root = buildTree(values);
        print(root);
    }

    public static Node buildTree(String[] values){
        if  (values[0].equals("N") || values.length < 1) {
            return null;
        }

        Node root = new Node(Integer.parseInt(values[0]));
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1;

        while (!q.isEmpty() && i < values.length) {
            Node curr = q.poll();
            if (!values[i].equals("N")) {
                curr.left = new Node(Integer.parseInt(values[i]));
                q.add(curr.left);
            }
            
            i++;
            if (i >= values.length) {break;}

            if (!values[i].equals("N")) {
                curr.right = new Node(Integer.parseInt(values[i]));
                q.add(curr.right);
            }

            i++;
        }

        return root;
    }

    public static void print(Node root) {
        if  (root != null) {
            System.out.print(root.data + " ");
            print(root.left);
            print(root.right);
        }
    }
}
