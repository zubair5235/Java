public class CustomDoubleLinkedList {
    public static class DoubleLinkedList{
        private Node head;
        private Node tail;
        private int size;

        DoubleLinkedList(){
            size = 0;
        }

        public void insertAtFirst(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                tail = newNode;
                return;
            }
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
            size++;
        }

        public void insertAtPosition(int position, int data){
            Node temp = head;
            Node newNode = new Node(data);
            for(int i = 0; i < position - 1; i++){
                temp = temp.next;
            }
            newNode.prev = temp;
            newNode.next = temp.next;
            temp.next.prev = newNode;
            temp.next = newNode;
            size++;
        }

        public void insertAtLast(int data){
            if(tail == null){
                insertAtFirst(data);
                return;
            }
            Node newNode = new Node(data);
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            size++;
        }

        public void deleteFirst(){
            if(head == null){
                return;
            }
            if(head == tail){
                head = head.next;
                tail = head;
            }
            else{
                head = head.next;
            }
            size--;
        }

        public void deleteAtPosition(int position){
            Node temp = head;
            for(int i = 0; i < position; i++){
                temp = temp.next;
            }
            temp.data = temp.next.data;
            temp.next.next.prev = temp;
            temp.next = temp.next.next;
            size--;
        }

        public void deleteNode(int data){
            int i = findPosition(data);
            deleteAtPosition(i);
            size--;
        }

        public void deleteLast(){
            if(tail == null){
                return;
            }
            if(head == tail){
                deleteFirst();
                return;
            }
            else{
                tail = tail.prev;
                tail.next = null;
            }
            size--;
        }

        public int findPosition(int data){
            int i = 0;
            Node temp = head;
            while(temp.data != data){
                i++;
                temp = temp.next;
            }
            return i;
        }

        public void print(){
            if(head == null){
                System.out.println("list is empty");
                return;
            }
            Node temp = head;
            while(temp.next != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println(tail.data);
        }

        public void printInReverse(){
            Node temp = tail;
            while(temp.prev != null){
                System.out.print(temp.data + " ");
                temp = temp.prev;
            }
            System.out.println(head.data);
        }

        public int size(){
            return size;
        }

        public class Node{
            int data;
            Node prev;
            Node next;

            Node(int data){
                this.data = data;
            }
        }
    }
}
