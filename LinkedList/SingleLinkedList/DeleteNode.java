public class DeleteNode{
    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.insertNode(1);
        list.insertNode(2);
        list.insertNode(3);
        list.insertNode(4);
        list.insertNode(5);
        list.head = delete(list.head, 3);
        list.print();
    }

    public static LinkedList.Node delete(LinkedList.Node head, int data){
        LinkedList.Node temp = head;
        while(temp.next != null){
            if(temp.next.data == data){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        return head;

    }
}