public class CycleDetection {
    public static Node head;

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            insertNodes(i);
        }
        print();
    }

    public static void insertNodes(int data){
        Node newNode = new Node(data);
        Node cycleNode = null;
        if(data == 5){
            cycleNode = newNode;
        }
        if(head == null){
            head = newNode;
            return;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        newNode.next = cycleNode;
        curr.next = newNode;
    }

    public static void print(){
        Node curr = head;
        while(curr != null){
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
    }
}
