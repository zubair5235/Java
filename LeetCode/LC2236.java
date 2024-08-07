// Root Equals sum of Childrens

import java.util.*;
import java.util.LinkedList;

public class LC2236{

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
        String s = sc.nextLine();
        root = buildTree(s.split(" "));
        ArrayList<Integer> values = new ArrayList<>();
        fetchData(root, values);
        values.remove(0);
        System.out.println(rootEqualsSum(values, root.data));
    }

    public static Node buildTree(String[] values){
        if(values[0].equals("null") && values.length == 0){
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

    public static void fetchData(Node root, ArrayList<Integer> values){
        if(root != null){
            values.add(root.data);
            fetchData(root.left,values);
            fetchData(root.right, values);
        }
    }

    public static boolean rootEqualsSum(ArrayList<Integer> values, int rootValue){
        int sum = 0;
        for(int i : values){
            sum += i;
        }
        return sum == rootValue ? true : false;
    }
}
