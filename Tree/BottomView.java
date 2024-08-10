import java.util.*;

public class BottomView {

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
        ans = verticalView(root);
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

    public static ArrayList<ArrayList<Integer>> verticalView(Node root) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        if (root == null) {return ans;}
        
        int col = 0;
        int min = 0;
        int max = 0;

        Queue<Map.Entry<Node, Integer>> q = new ArrayDeque<>();
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        q.offer(new AbstractMap.SimpleEntry<>(root, col));

        while (!q.isEmpty()) {
            Map.Entry<Node, Integer> removed = q.poll();
            root = removed.getKey();
            col = removed.getValue();

            if (root != null) {
                if (!map.containsKey(col)) {
                    map.put(col, new ArrayList<>());
                }
                if (map.get(col).isEmpty()) {
                    map.get(col).add(root.data);
                } else {
                    map.get(col).clear();
                    map.get(col).add(root.data);
                }

                min = Math.min(min, col);
                max = Math.max(max, col);

                q.offer(new AbstractMap.SimpleEntry<>(root.left, col - 1));
                q.offer(new AbstractMap.SimpleEntry<>(root.right, col + 1));
            }
        }

        for (int i = min; i <= max; i++) {
            ans.add(map.get(i));
        }

        return ans;
    }
}
