// Minimum Absolute Difference in BST

import java.util.*;
import java.util.LinkedList;

public class LC530{
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
        ArrayList<Integer> ans = new ArrayList<>();
        fetchValues(root, ans);
        Collections.sort(ans);
        int diff = Integer.MAX_VALUE;
        for(int i = ans.size() - 1; i >= 0; i--){
            for(int j = i - 1; j >= 0; j--){
                if(ans.get(i) - ans.get(j) < diff){
                    diff = ans.get(i) - ans.get(j);
                }
            }
        }
        System.out.print(diff);
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

    public static void fetchValues(Node root, ArrayList<Integer> ans){
        if(root != null){
            ans.add(root.data);
            fetchValues(root.left, ans);
            fetchValues(root.right, ans);
        }
    }
}