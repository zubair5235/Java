/* package SingleLinkedList;
 */

public class LinkedList {

    public Node head;

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insertNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void print(){
        if(head == null){
            System.out.println("null");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void deleteDups(){
        Node curr = head;
        Node temp = head;
        while(temp.next != null){
            if(temp.next.data == temp.data){
                Node dup = temp.next;
                deleteNode(dup);
                temp = temp.next;
            }
            else{
                temp = temp.next;
            }
        }
    }

    public void deleteNode(Node dup){
        Node curr = head;
        while(curr.next != null){
            if(curr == dup){
                break;
            }
        }
        curr.data = curr.next.data;
        curr.next = curr.next.next;
    }
}
