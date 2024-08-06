public class NthNode{
    public static void main(String args[]){
        LinkedList list1 = new LinkedList();
        list1.insertNode(1);
        list1.insertNode(2);
        list1.insertNode(3);
        list1.insertNode(4);
        list1.insertNode(5);
        System.out.print(NthNode(list1.head, 2));
    }

    public static int NthNode(LinkedList.Node head, int n){
        LinkedList.Node prev = null;
        LinkedList.Node curr = head;
        LinkedList.Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        LinkedList.Node temp = prev;
        int count = 1;
        while(count != n){
            temp = temp.next;
            count++;
        }
        return temp.data;
    }
}