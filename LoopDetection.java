import java.util.*;

class LoopDetection{
    
    static Node head;
    
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int input = sc.nextInt();
            head = insertNodes(head,input);
        }
        int src = sc.nextInt();
        createCycle(head,1,src);
        System.out.print(detectCycle(head) ? "Cycle Detected" : "No Cycle");
    }

    public static Node insertNodes(Node head, int data){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
        }
        else{
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = new_node;
        }
        return head;
    }

    public static void createCycle(Node head, int a, int b){
        int cnta = 0;
        int cntb = 0;
        Node p1 = head;
        Node p2 = head;
        while(cnta != a || cntb != b){
            if(cnta != a){
                p1 = p1.next;
                ++cnta;
            }
            if(cntb != b){
                p2 = p2.next;
                ++cntb;
            }
        }
        p2.next = p1;
    }

    public static boolean detectCycle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
} 

/* import java.util.*;

public class LoopDetection{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        int i = 0;
        int flag = 0;
        while(i < n){
            if(set.contains(arr[i])){
                flag = 1;
            }
            set.add(arr[i]);
            i++;
        }
        System.out.print(flag == 0 ? "NO" : "YES");
    }
} */