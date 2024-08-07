// ZigZag LevelOrder Traversal

import java.util.*;
import java.util.LinkedList;

public class LC103{
    
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
        levelOrder(root, ans, 0);
        zigzag(ans);
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
        if(level == ans.size()){
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

    public static void zigzag(ArrayList<ArrayList<Integer>> ans){
        ArrayList<ArrayList<Integer>> ogans = new ArrayList<>();
        for(int i = 0; i < ans.size(); i++){
            if(i % 2 == 0){
                ogans.add(ans.get(i));
            }
            else{
                ArrayList<Integer> temp = new ArrayList<>();
                for(int j = ans.get(i).size() - 1; j >= 0; j--){
                    temp.add(ans.get(i).get(j));
                }
                ogans.add(temp);
            }
        }
        System.out.println(ogans);
    }

}