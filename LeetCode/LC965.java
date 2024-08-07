// Unicvalued Binary Tree

import java.util.*;
import java.util.LinkedList;

public class LC965{
    
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
        fetchValues(root, values);
        System.out.print(isUnivalued(values)); 
    }

    public static Node buildTree(String[] s){
        if(s[0].equals("null") || s.length == 0){
            return null;
        }
        Queue<Node> q = new LinkedList<>();
        Node root = new Node(Integer.parseInt(s[0]));
        q.add(root);
        int i = 1;
        while(!q.isEmpty() && i < s.length){
            Node curr = q.poll();
            if(!s[i].equals("null")){
                curr.left = new Node(Integer.parseInt(s[i]));
                q.add(curr.left);
            }
            i++;
            if(i >= s.length){
                break;
            }
            if(!s[i].equals("null")){
                curr.right = new Node(Integer.parseInt(s[i]));
                q.add(curr.right);
            }
            i++;
        }
        return root;
    }

    public static void fetchValues(Node root, ArrayList<Integer> values){
        if(root != null){
            fetchValues(root.left, values);
            values.add(root.data);
            fetchValues(root.right, values);
        }
    }

    public static boolean isUnivalued(ArrayList<Integer> values){
        int val = values.get(0);
        for(int i = 1; i < values.size(); i++){
            if(values.get(i) != val){
                return false;
            }
        }
        return true;
    }
}