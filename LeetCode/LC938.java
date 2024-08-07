import java.util.*;
import java.util.LinkedList;

public class LC938{
    static Node root;
    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        String s = sc.nextLine();
        root = buildTree(s.split(" "));
        System.out.print(rangesumBST(root, low, high));
    }
    public static Node buildTree(String[] values){
        if(values[0].equals("null") || values.length == 0){
            return null;
        }
        Node root = new Node(Integer.parseInt(values[0]));
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while(!q.isEmpty() && i < values.length){
            Node curr = q.poll();
            if(!values[i].equals("null")){
                curr.left = new Node(Integer.parseInt(values[i]));
                q.add(curr.left);
            }
            i++;
            if(i >= values.length){
                break;
            }
            if(!values[i].equals("null")){
                curr.right = new Node(Integer.parseInt(values[i]));
                q.add(curr.right);
            }
            i++;
        }
        return root;
    }

    public static int rangesumBST(Node root, int low, int high){
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = low; i <= high; i++){
            set.add(i);
        }
        ArrayList<ArrayList<Integer>> v = new ArrayList<>();
        fetchData(root, v, 0);
        System.out.print(v);
        ArrayList<Integer> values = new ArrayList<>();
        for(int j = 0; j < v.size(); j++){
            for(int k = 0; k < v.get(j).size(); k++){
                values.add(v.get(j).get(k));
            }
        }
        for(int k = 0; k < values.size(); k++){
            if(set.contains(values.get(k))){
                sum += values.get(k);
            }
        }
        return sum;
    }

    public static void fetchData(Node root, ArrayList<ArrayList<Integer>> v, int level){
        if(root == null){
            return;
        }
        if(level == v.size()){
            ArrayList<Integer> li = new ArrayList<>();
            li.add(root.data);
            v.add(li);
        }
        else{
            v.get(level).add(root.data);
        }
        fetchData(root.left, v, level + 1);
        fetchData(root.right, v, level + 1);
    }
}