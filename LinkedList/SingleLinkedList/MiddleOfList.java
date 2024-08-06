public class MiddleOfList{
    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.insertNode(1);
        list.insertNode(2);
        list.insertNode(3);
        list.insertNode(4);
        list.insertNode(5);
        System.out.println(findMid(list.head).data);
    }

    public static LinkedList.Node findMid(LinkedList.Node head){
        LinkedList.Node slow = head;
        LinkedList.Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}