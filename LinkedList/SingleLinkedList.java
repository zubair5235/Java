import java.util.*;

public class SingleLinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node head;
    static Node tail;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            insertNodes(data);
        }
        printList(head);
    }

    public static void insertNodes(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public static void printList(Node head){
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }
}
