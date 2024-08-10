import java.util.*;

public class StackImpLL {

    static int top;

    static Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    StackImpLL() {
        this.head = null;
        this.top = 0;
    }

    public void push(int data) {
        ++this.top;
        Node newNode = new Node(data);
        if(this.head == null) {this.head = newNode;}
        else {
            Node curr = this.head;
            while(curr.next != null) {curr = curr.next;}
            curr.next = newNode; 
        }
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public int size() {return this.top;}

    public int pop() {
        this.top--;
        if(this.isEmpty()) {System.out.print("Stack is Empty"); return 0;}
        Node curr = this.head;
        while(curr.next.next != null) {
            curr = curr.next;
        }
        int ans = curr.next.data;
        curr.next = null;
        return ans;
    }

    public int peek() {
        if(this.isEmpty()) {System.out.print("Stack is Empty"); return 0;}
        Node curr = this.head;
        while(curr.next != null) {
            curr = curr.next;
        }
        return curr.data;
    }

    public void print() {
        if(top == -1 || this.head == null) {
            System.out.println("Stack is Empty");
            return;
        }
        Node curr = this.head;
        while(curr != null) {System.out.print(curr.data + " "); curr = curr.next;}
    }

    public static void main(String args[]) {
        StackImpLL stack = new StackImpLL();
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(415);
        stack.push(22);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());
    }
}