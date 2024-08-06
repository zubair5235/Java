import java.util.*;

public class ReverseInGroups{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        list.insertNode(1);
        list.insertNode(2);
        list.insertNode(3);
        list.insertNode(4);
        list.insertNode(5);
        list.insertNode(6); 
        int k = sc.nextInt();
        list.head = rot(list.head, k);
        list.print();
    }

    public static LinkedList.Node rot(LinkedList.Node head, int k){
        int len = 1;
        LinkedList.Node start = head;
        LinkedList.Node temp = head;
        LinkedList.Node newHead = head;
        while(temp.next != null){
            len++;
            temp = temp.next;
        }
        int limit = len / k;
        while(limit > 0){
            int t = 0;
            start = newHead;
            while(t < k){
                temp = temp.next;
                t++;
            }
            newHead = temp.next;
            temp.next = null;
            head = reverse(start);
            LinkedList.Node last = head;
            while(last.next != null){
                last = last.next;
            }
            last.next = newHead;
            limit--;
        }
        return head;
    }

    public static LinkedList.Node reverse(LinkedList.Node head){
        LinkedList.Node prev = null;
        LinkedList.Node curr = head;
        LinkedList.Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return next;
    }
}