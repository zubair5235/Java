import java.util.*;

public class RotateList{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        list.insertNode(1);
        list.insertNode(2);
        int k = sc.nextInt();
        /* list.head = rotateList(list.head, k); */
        list.head = rotate(list.head, k);
        list.print();
    }

    public static LinkedList.Node rotateList(LinkedList.Node head, int k){
        LinkedList.Node temp = head;
        LinkedList.Node newHead = null;
        int count = 1;
        while(temp.next != null){
            if(count == k){
                LinkedList.Node lastNode = temp;
                newHead = temp.next;
                temp = temp.next;
                lastNode.next = null;
            } else{
                temp = temp.next;
            }
            count++;
        }
        temp.next = head;
        head = newHead;
        return head;
    }

    public static LinkedList.Node rotate(LinkedList.Node head, int k){
        LinkedList.Node last = head;
        LinkedList.Node temp = head;
        while(last.next != null){
            last = last.next;
        }
        while(k != 0){
            head = head.next;
            temp.next = null;
            last.next = temp;
            last = temp;
            temp = head;
            k--;
        }
        return head;
    }
}