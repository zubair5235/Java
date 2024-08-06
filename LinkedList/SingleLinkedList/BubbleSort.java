public class BubbleSort {
    public static Node head;
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        head = insertNode(head,4);
        head = insertNode(head,2);
        head = insertNode(head,1);
        head = insertNode(head,3);
        printList(head);
        sort(head);
        printList(head);
    }

    public static Node insertNode(Node node, int data){
        Node newNode = new Node(data);
        if(node == null){
            node = newNode;
            return node;
        }
        Node temp = node;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return node;
    }

    public static void printList(Node node){
        Node curr = node;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void sort(Node node){
        int len = 1;
        Node temp = node;
        while(temp.next != null){
            len++;
            temp = temp.next;
        }
        Node last = temp;
        temp = node;
        int i = 0;
        int newData = 0;
        while(i < len){
            Node first = temp;
            while(first.next != null){
                newData = first.data;
                if(newData > first.next.data){
                    first.data = first.next.data;
                }
                first = first.next;
            }
            temp = temp.next;
            i++;
        }
    }
}
