import java.util.*;

public class LC143{
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    static Node head;

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int data = sc.nextInt();
            head = insertNodes(head, data);
        }
        print(head);
        head = reorder(head);
        print(head);
    }

    public static Node insertNodes(Node head, int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return head;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public static void print(Node head){
        if(head == null){
            System.out.print("null");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
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


    public static Node reorder(Node head){
        if(head.next == null){
            return head;
        }
        Node mid = findMid(head);
        mid = reverse(mid);
        return merge(head, mid);
    }

    public static Node merge(Node head, Node mid){
        Node ans = null;
        Node list1 = head;
        Node list2 = mid;
        while(list1 != null && list2 != null){
            ans = insertNodes(ans, list1.data);
            ans = insertNodes(ans, list2.data);
            list1 = list1.next;
            list2 = list2.next;
        }
        while(list1 != null){
            ans = insertNodes(ans, list1.data);
            list1 = list1.next;
        }
        while(list2 != null){
            ans = insertNodes(ans, list2.data);
            list2 = list2.next;
        }
        return ans;
    }
}