// Sum Root of Leaf Numbers

import java.util.*;
import java.util.LinkedList;

public class LC129{
    static Node root;
    static String num = "0";
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
        int sum = 0;
        summation(root, sum);
        System.out.print(sum);
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

    public static void summation(Node root, int sum){
        if(root == null){
            sum += Integer.parseInt(num);
            num = num.substring(0,num.length()-1);
            return;
        }
        if(root != null){
            num += String.valueOf(root.data);
            summation(root.left, sum);
            summation(root.right, sum);
        }
    }
}