/* package SingleLinkedList; */

// LC - 2181 completed

public class MergeNodes {
    static Node head;

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }

    }

    public static void main(String[] args) {
        insertNode(0);
        insertNode(3);
        insertNode(2);
        insertNode(0);
        insertNode(4);
        insertNode(5);
        insertNode(2);
        insertNode(0);
        merge();
        printList();
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
        }
    }

    public static void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void merge(){
        Node temp = head;
        while(temp.next != null){
            if(temp.data != 0){
                Node temp2 = temp.next;
                while(temp2.data != 0){
                    temp.data += temp2.data;
                    temp2 = temp2.next;
                }
                temp.next = temp2;
            }
            temp = temp.next;
        }
        head = head.next;
        temp = head;
        while(temp.next.next != null){
            if(temp.next.data == 0){
                temp.next = temp.next.next;
                temp = temp.next;
            }
        }
        temp.next = null;
    }

    public static void insertInBetween(int data, Node prev){
        Node newNode = new Node(data);
        Node temp = head;
        while(temp != prev){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void deleteNode(int data){
        Node temp = head;
        while(temp.data != data){
            temp = temp.next;
        }
        temp.data = temp.next.data;
        temp.next = temp.next.next;
    }
}

