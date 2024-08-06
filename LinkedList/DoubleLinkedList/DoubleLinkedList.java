public class DoubleLinkedList {

    static Node head;

    public static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public static void insertNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    public static void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void printListInReverse(){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }
}

