/* package SingleLinkedList; */

public class DeleteDuplicates {

    public static Node head;

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void insertNode(int data){
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

    public static void print(){
        Node temp = head;
        while(temp != null ) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void deleteDups(){
        Node curr = head;
        while(curr != null && curr.next != null){
            if(curr.data == curr.next.data){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }
    }

    public static void main(String[] args) {
        insertNode(1);
        insertNode(1);
        insertNode(1);
        insertNode(2);
        insertNode(3);
        insertNode(3);
        insertNode(4);
        insertNode(5);
        print();
        deleteDups();
        print();
    }
}
