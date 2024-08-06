public class CircularLinkedList {
    static Node head = null;
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        for(int i = 1; i < 11; i++){
            insertNode(i);
        }
        printlist();
    }

    public static void insertNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            newNode.next = head;
            return;
        }
        Node curr = head;
        while(curr.next != head){
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.next = head;
    }

    public static void printlist(){
        if(head == null) return;
        Node temp = head.next;
        System.out.print(head.data + " ");
        while(temp != head){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
