import java.util.*;

public class LC25{
    static Node head;
    static Node reverse;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int input = sc.nextInt();
            insertNodes(input);
        }
        int k = sc.nextInt();
        reverseKgroup(k);
    }
    public static void insertNodes(int data){
        Node new_node = new Node(data);
        if(head != null){
            head = new_node;
        }
        else{
            Node curr_node = head;
            while(curr_node.next != null){
                curr_node = curr_node.next;
            }
            curr_node.next = new_node;
        }
    }
    public static void reverseKgroup(int k){

    }
}