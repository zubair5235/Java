import java.util.*;

public class ReverseList{
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of inputs");
        int n = sc.nextInt();
        ReverseList list = new ReverseList();
        for(int i = 0; i < n; i++){
            int input = sc.nextInt();
            list = insertNode(list,input);
        }

        System.out.println("Enter Right value");
        int r = sc.nextInt();
        System.out.println("Enter Left value");
        int l = sc.nextInt();
        Reverse(list,r,l);
    }

    public static ReverseList insertNode(ReverseList list,int data){
        Node new_node = new Node(data);
        if(list.head == null){
            list.head = new_node;
        }
        else{
            Node curr_node = list.head;
            while(curr_node.next != null){
                curr_node = curr_node.next;
            }
            curr_node.next = new_node;
        }

        return list;
    }

    public static void Reverse(ReverseList list,int r, int l){
        int count = 0;
        while(list.head != null){
            list.head = list.head.next;
            count++;
        }
        if(r > count){
            r -= count;
        }
        
    }
}