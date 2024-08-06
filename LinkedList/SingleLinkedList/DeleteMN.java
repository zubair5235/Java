public class DeleteMN{
    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.insertNode(1);
        list.insertNode(2);
        list.insertNode(3);
        list.insertNode(4);
        list.insertNode(5);
        list.head = deleteMN(list.head, 2, 2);
        list.print();
    }

    public static LinkedList.Node deleteMN(LinkedList.Node head, int m, int n){
        int count = 0;
        LinkedList.Node temp = head;
        while(count != m){
            temp = temp.next;
            count++;
        }
        count = 0;
        while(count != n){
            temp.data = temp.next.data;
            temp.next = temp.next.next;
            count++;
        }
        return head;
    }
}