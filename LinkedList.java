import java.util.*;

public class LinkedList{
    static Node head;
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
        LinkedList list = new LinkedList();
        for(int i = 0; i < n; i++){
            int input = sc.nextInt();
            list = insertNode(input, list);
        }
        printList(list);
    }

    public static LinkedList insertNode(int data, LinkedList list){
        if(list.head == null){
            list.head = new Node(data);
        }
        else{
            Node curr = list.head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = new Node(data);
        }

        return list;
    }

    public static void printList(LinkedList list){
        Node curr_node = list.head;
        while(curr_node != null){
            System.out.print(curr_node.data + " ");
            curr_node = curr_node.next;
        }
    }
}

/* class LinkedList{

    static Node head;

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
            head = insertNodes(head,input);
        }
        print(head);
    }

    public static Node insertNodes(Node head, int data){
        if(head == null){
            head = new Node(data);
        }
        else{
            Node curr_node = head;
            while(curr_node.next != null){
                curr_node = curr_node.next;
            }
            curr_node.next = new Node(data);
        }
        return head;
    }

    public static void print(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
