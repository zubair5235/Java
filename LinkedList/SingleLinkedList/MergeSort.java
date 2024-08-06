package SingleLinkedList;

public class MergeSort {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    static Node head;
    static Node tail;

    public static void insertNodes(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static Node ansInsertNodes(Node ansHead,int data){
        Node newNode = new Node(data);
        if(ansHead == null){
            ansHead = newNode;
        }
        else{
            Node temp = ansHead;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return ansHead;
    }

   public static void printList(Node head){
        if(head == null){
            System.out.println("null");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
       System.out.println();
   }

    public static void main(String args[]){
        insertNodes(4);
        insertNodes(2);
        insertNodes(1);
        insertNodes(3);
        printList(head);
        Node ans = mergesort(head);
        printList(ans);
    }

    public static Node findMid(Node node){
        Node midPrev = node;
        node = node.next.next;
        while(node != null && node.next != null){
            midPrev = midPrev.next;
            node = node.next.next;
        }
        Node mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }

    public static Node merge(Node list1, Node list2){
        Node ans = null;
        while(list1 != null && list2 != null){
            if(list1.data < list2.data){
                ans = ansInsertNodes(ans,list1.data);
                list1 = list1.next;
            } else{
                ans = ansInsertNodes(ans,list2.data);
                list2 = list2.next;
            }
        }
        while(list1 != null){
            ans = ansInsertNodes(ans,list1.data);
            list1 = list1.next;
        }
        while(list2 != null){
            ans = ansInsertNodes(ans,list2.data);
            list2 = list2.next;
        }
        return ans;
    }

    public static Node mergesort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node mid = findMid(head);
        Node left = mergesort(head);
        Node right = mergesort(mid);
        return merge(left, right);
    }
}
