import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class TopViewTree{
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
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ans = verticalorder(root);
        for(int i = 0; i < ans.size(); i++){
            for(int j = 0; j < ans.get(i).size(); j++){
                System.out.print(ans.get(i).get(j) + " ");
            }
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
            if(!s[i].equals("N")){
                curr.left = new Node(Integer.parseInt(s[i]));
                q.add(curr.left);
            }
            i++;
            if(i >= s.length){
                break;
            }
            if(!s[i].equals("N")){
                curr.right = new Node(Integer.parseInt(s[i]));
                q.add(curr.right);
            }
            i++;
        } 

        return root;
    }

    public static ArrayList<ArrayList<Integer>> verticalorder(Node root){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }

        int col = 0;

        Queue<Map.Entry<Node, Integer>> q = new ArrayDeque<>();
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        q.offer(new AbstractMap.SimpleEntry<>(root, col));

        int min = 0;
        int max = 0;

        while(!q.isEmpty()){
            Map.Entry<Node, Integer> removed = q.poll();
            root = removed.getKey();
            col =  removed.getValue();

            if(root != null){
                if(!map.containsKey(col)){
                    map.put(col, new ArrayList<Integer>());
                }

                if(map.get(col).isEmpty()){
                    map.get(col).add(root.data);
                }

                min = Math.min(min, col);
                max = Math.max(max, col);

                q.offer(new AbstractMap.SimpleEntry<>(root.left, col-1));
                q.offer(new AbstractMap.SimpleEntry<>(root.right, col+1));
            }
        }

        for(int i = min; i <= max; i++){
            ans.add(map.get(i));
        }

        return ans;
    }
}