// Palindrome LinkedList
import java.util.*;

public class LC234{
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    static Node head;
    static Node tail;

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int data = sc.nextInt();
            head = insertNodes(head, data);
        }
        System.out.println(isPalindrome(head));
    }

    public static Node insertNodes(Node head, int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            return head;
        }
        tail.next = newNode;
        tail = newNode;
        return head;
    }

    public static boolean isPalindrome(Node head){
        if(head == null || head.next == null){
            return true;
        }
        Node mid = findMid(head);
        mid = reverse(mid);
        Node first = head;
        Node second = mid;
        while(first != null && second != null){
            if(first.data != second.data){
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
    }

    public static Node findMid(Node head){
        Node midPrev = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            midPrev = midPrev.next;
            fast = fast.next.next;
        }
        Node mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }

    public static Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void print(Node head){
        if(head == null){
            System.out.println("null");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}