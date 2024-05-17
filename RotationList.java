import java.util.*;

public class RotationList{
    Node head;

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
        System.out.println("Enter the number of inputs");
        RotationList list = new RotationList();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int input = sc.nextInt();   
            list = list.insertNode(list,input);
        }
        System.out.println("Enter the rotation value");
        int r = sc.nextInt();
        list.rotate(list,r);
        list.printList(list);
    }

    public RotationList insertNode(RotationList list, int data){
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

    public void rotate(RotationList list, int r){
        int count = 0;
        if(r > 2){
            count = 1;
        }
        while(count <= r){
            Node temp = new Node(list.head.data);
            Node t = list.head.next;
            Node curr_node = t;
            while(curr_node.next != null){
                curr_node = curr_node.next;
            }
            curr_node.next = temp;
            list.head = t;
            count++;
        }
    }

    public void printList(RotationList list){
        Node curr_node = list.head;
        while(curr_node != null){
            System.out.print(curr_node.data + " ");
            curr_node = curr_node.next;
        }
    }
}