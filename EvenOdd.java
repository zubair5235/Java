import java.util.*;

class EvenOdd{
    
    static Node head;
    static Node result;

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
        result = segregate(head,result);
        System.out.println();
        print(result);
    }

    public static Node insertNodes(Node head, int data){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
        }
        else{
            Node curr_node = head;
            while(curr_node.next != null){
                curr_node = curr_node.next;
            }
            curr_node.next = new_node;
        }

        return head;
    }

    public static Node segregate(Node head, Node result){
        Node temp = head;
        while(temp != null){
            if(temp.data % 2 == 0){
                result = insertNodes(result, temp.data);
            }
            temp = temp.next;
        }
        while(head != null){
            if(head.data % 2 != 0){
                result = insertNodes(result, head.data);
            }
            head = head.next;
        }

        return result;
    } 

    public static void print(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }  
}