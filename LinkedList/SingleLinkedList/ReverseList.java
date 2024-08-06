public class ReverseList{
    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.insertNode(1);
        list.insertNode(2);
        list.insertNode(3);
        list.insertNode(4);
        list.insertNode(5);
        list.head = reverse(list.head);
        list.print();
    }

    /* public static void reverse(LinkedList.Node head){
        if(head.next == null){
            System.out.print(head.data + " ");
            return;
        }
        reverse(head.next);
        System.out.print(head.data + " ");
    } */

    public static LinkedList.Node reverse(LinkedList.Node head){  // 1 2 3 4 5
        LinkedList.Node prev = null;
        LinkedList.Node current = head;
        LinkedList.Node next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}