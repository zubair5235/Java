public class MergeLists{
    public static void main(String args[]){
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        list1.insertNode(0);
        list1.insertNode(2);
        list1.insertNode(4);
        list1.insertNode(6);
        list1.insertNode(8);
        list2.insertNode(1);
        list2.insertNode(3);
        list2.insertNode(5);
        list2.insertNode(7);
        list2.insertNode(9);
        merge(list1.head, list2.head);
        list1.print();
    }

    public static void merge(LinkedList.Node head1, LinkedList.Node head2){
        LinkedList.Node temp1 = head1;
        LinkedList.Node temp2 = head2;
        while(head1 != null && head2 != null){
            temp1.next = temp2;
            head1 = head1.next;
            temp1 = head1;
            /* head2 = head2.next;
            temp2 = head2; */
            head2 = head2.next;
            temp2 = head2;
            temp1.next = temp2;
        }
    }
}