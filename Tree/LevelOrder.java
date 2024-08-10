import java.util.*;

public class LevelOrder {

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
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        levelOrder(root, 0, ans);
        System.out.println(ans);
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

    public static void levelOrder (Node root, int level, ArrayList<ArrayList<Integer>> ans) {
        if (root == null) {
            return;
        } 

        if (ans.size() == level) {
            ArrayList<Integer> li = new ArrayList<>();
            li.add(root.data);
            ans.add(li);
        } else {
            ans.get(level).add(root.data);
        }

        levelOrder(root.left, level + 1, ans);
        levelOrder(root.right, level + 1, ans);
    }
}
