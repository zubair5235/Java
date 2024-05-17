import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class ZigZagLevelOrder{
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
        traverse(root,ans,0);
        for(int i = 0; i < ans.size(); i++){
            if(i % 2 == 1){
                for(int j = ans.get(i).size() - 1; j >= 0; j--){
                    System.out.print(ans.get(i).get(j) + " ");
                }
            }
            else{
                for(int j = 0; j < ans.get(i).size(); j++){
                    System.out.print(ans.get(i).get(j) + " ");
                }
            }
        }
    }

    public static Node buildTree(String[] s){
        if(s.length == 0 || s[0].equals(null)){
            return null;
        }
        Node root = new Node(Integer.parseInt(s[0]));
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while(!q.isEmpty() && i < s.length){
            Node curr = q.poll();
            String a = s[i];
            if(!a.equals("N")){
                curr.left = new Node(Integer.parseInt(s[i]));
                q.add(curr.left);
            }
            i++;
            if(i >= s.length){
                break;
            }
            a = s[i];
            if(!a.equals("N")){
                curr.right = new Node(Integer.parseInt(s[i]));
                q.add(curr.right);
            }
            i++;
        } 

        return root;
    }

    public static void traverse(Node root, ArrayList<ArrayList<Integer>> ans, int level){
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
        traverse(root.left,ans,level+1);
        traverse(root.right,ans,level+1);
    }
}