//Same Leaf trees

import java.util.*;

public class LC872{

    static Node root1, root2;
    
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
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String[] values1 = s1.split(" ");
        String[] values2 = s2.split(" ");
        root1 = buildTree(values1);
        root2 = buildTree(values2);
        ArrayList<Integer> leaves1 = new ArrayList<>();
        ArrayList<Integer> leaves2 = new ArrayList<>();
        treeLeaves(root1,leaves1);
        treeLeaves(root2,leaves2);
        System.out.println(leaves1);
        System.out.println(leaves2);
        System.out.println(isSimilar(leaves1, leaves2));
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

    public static void treeLeaves(Node root, ArrayList<Integer> ans){
        if(root == null){
            return;
        }
        treeLeaves(root.left, ans);
        if(root.left == null && root.right == null){
            ans.add(root.data);
        }
        treeLeaves(root.right, ans);
    }

    public static boolean isSimilar(ArrayList<Integer> leaves1, ArrayList<Integer> leaves2){
        /* if(leaves1.size() != leaves2.size()){
            return false;
        }
        for(int i = 0; i < leaves1.size(); i++){
            if(leaves1.get(i) != leaves2.get(i)){
                return false;
            }
        } */
        if(leaves1.equals(leaves2)){
            return true;
        }
        return false;
    }
}