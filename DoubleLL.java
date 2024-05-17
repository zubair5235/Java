import java.util.*;

public class DoubleLL{

    static Node head;

    static class Node{
        int data;
        Node prev,next;
        Node(int data){
            this.data = data;
            this.prev = this.next = null;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DoubleLL list = new DoubleLL();
        for(int i = 0; i < n; i++){
            int input = sc.nextInt();
            list = insertNodes(list, input);
        }
        printList(list);
        System.out.println();
        printListinReverse(list);
    }

    public static DoubleLL insertNodes(DoubleLL list, int data){
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
            new_node.prev = curr_node;
        }
        
        return list;
    }

    public static void printList(DoubleLL list){
        Node curr_node = list.head;
        while(curr_node != null){
            System.out.print(curr_node.data + " ");
            curr_node = curr_node.next;
        }
    }

    public static void printListinReverse(DoubleLL list){
        Node curr_node = list.head;
        while(curr_node.next != null){
            curr_node = curr_node.next;
        }
        while(curr_node != null){
            System.out.print(curr_node.data + " ");
            curr_node = curr_node.prev;
        }
    }
}