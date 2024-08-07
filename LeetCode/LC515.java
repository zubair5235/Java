// Find Largest Value in Each Tree Row

import java.util.*;
import java.util.LinkedList;

public class LC515{
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
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> ogAns = new ArrayList<>();
        levelOrder(root, ans, 0);
        for(int i = 0; i < ans.size(); i++){
            int max = Integer.MIN_VALUE;
            for(int j = 0; j < ans.get(i).size(); j++){
                if(max < ans.get(i).get(j)){
                    max = ans.get(i).get(j);
                }
            }
            ogAns.add(max);
        }
        System.out.print(ogAns);
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
    
    public static void levelOrder(Node root, ArrayList<ArrayList<Integer>> ans, int level){
        if(root == null){
            return;
        }
        if(ans.size() == level){
            ArrayList<Integer> li = new ArrayList<>();
            li.add(root.data);
            ans.add(li);
        }
        else{
            ans.get(level).add(root.data);
        }
        levelOrder(root.left, ans, level + 1);
        levelOrder(root.right, ans, level + 1);
    }
}