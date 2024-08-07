// Sum of Left Leaves

import java.util.*;
import java.util.LinkedList;

public class LC404{
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
        ArrayList<Integer> leaves = new ArrayList<>();
        fetchLeaves(root.left, leaves);
        fetchLeaves(root.right, leaves);
        System.out.print(leaves);
    }

    public static Node buildTree(String[] s){
        if(s.equals("null") || s.length == 0){
            return null;
        }
        Node root = new Node(Integer.parseInt(s[0]));
        Queue<Node> q = new LinkedList<>();
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

    public static void fetchLeaves(Node root, ArrayList<Integer> leaves){
        if(root == null){
            return;
        }
        fetchLeaves(root.left, leaves);
        if(root.left == null && root.right == null){
            leaves.add(root.data);
        }
    }
}