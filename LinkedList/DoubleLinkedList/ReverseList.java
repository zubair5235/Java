public class ReverseList{
    public static void main(String args[]){
        DoubleLinkedList list = new DoubleLinkedList();
        list.insertNode(1);
        list.insertNode(2);
        list.insertNode(3);
        list.insertNode(4);
        list.insertNode(5);
        list.head = reverse(list.head);
        list.printList();
    }

    public static DoubleLinkedList.Node reverse (DoubleLinkedList.Node head){
        DoubleLinkedList.Node temp = head;
        DoubleLinkedList.Node prev = null;
        DoubleLinkedList.Node curr = temp;
        DoubleLinkedList.Node next = null;
        while(curr != null){
            next = curr.next;
            curr.prev = next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}