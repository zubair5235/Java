public class DeleteMiddle{
    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.insertNode(1);
        list.insertNode(2);
        list.insertNode(3);
        list.insertNode(4);
        list.insertNode(5);
        list.head = deleteMiddle(list.head);
        list.print();
    }

    public static LinkedList.Node deleteMiddle(LinkedList.Node head){
        LinkedList.Node slow = head;
        LinkedList.Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.data = slow.next.data;
        slow.next = slow.next.next;
        return head;
    }
}