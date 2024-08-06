
public class CustomLinkedList {
    public static class LinkedList{
        private Node head;
        private Node tail;
        private int size;

        LinkedList(){
            size = 0;
        }

        public void insertAtFirst(int data){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            if(tail == null)
                tail = newNode;
            size++;
        }

        public void insertInBetween(int data1, int newData,int data2){
            Node temp = head;
            Node data1Node = null;
            while(temp.next != null){
                if(temp.data == data1){
                    data1Node = temp;
                }
                else if(temp.data == data2){
                    break;
                }
                temp = temp.next;
            }
            Node data2Node = temp;
            Node newNode = new Node(newData, data2Node);
            data1Node.next = newNode;
            size++;
        }

        public void insertAtPosition(int position, int data){
            if(position == 0){
                insertAtFirst(data);
                return;
            }
            if(position >= size){
                insertAtLast(data);
                return;
            }
            Node temp = head;
            for(int i = 0; i < position - 1; i++){
                temp = temp.next;
            }
            Node newNode = new Node(data, temp.next);
            temp.next = newNode;
            size++;
        }

        public void insertAtLast(int data){
            Node newNode = new Node(data);
            if(tail == null){
                insertAtFirst(data);
                return;
            }
            tail.next = newNode;
            tail = newNode;
            size++;
        }

        public void print(){
            if(head == null){
                System.out.println("list is currently empty");
                return;
            }
            Node temp = head;
            while(temp.next != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println(tail.data);
        }

        public Node getHead(){
            return head;
        }

        public Node getTail(){
            return tail;
        }

        public int getDataAtPosition(int position){
            Node temp = head;
            for(int i = 0; i < position; i++){
                temp = temp.next;
            }
            return temp.data;
        }

        public void deleteHead(){
            head = head.next;
            size--;
        }

        public void deleteTail(){
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            tail = temp;
            tail.next = null;
            size--;
        }

        public void deleteNode(int data){
            Node temp = head;
            while(temp.data != data){
                temp = temp.next;
            }
            temp.data = temp.next.data;
            temp.next = temp.next.next;
            size--;
        }

        private class Node{
            int data;
            Node next;

            Node(int data){
                this.data = data;
            }

            Node(int data, Node nextNode){
                this.data = data;
                this.next = nextNode;
            }
        }
    }
}
