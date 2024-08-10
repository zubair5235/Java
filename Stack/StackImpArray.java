import java.util.*;

public class StackImpArray {
    
    static int top = -1;
    static int[] arr;
    static int size = 0;

    StackImpArray (int s) {
        this.arr = new int[s];
        size = s;
    }

    public void push(int data) {
        if(isFull()) {
            System.out.println("Stack is Full");
            return;
        }
        this.arr[++top] = data;
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is Empty");
            return 0;
        }
        return this.arr[top--];
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack is Empty");
            return 0;
        }
        return this.arr[top];
    }

    public static boolean isFull() {
        return top == size;
    }

    public static boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public void print() {
        for(int i = top; i >= 0; i--) {
            System.out.print(this.arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        StackImpArray stack = new StackImpArray(5);
        stack.push(5);
        stack.push(3);
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        stack.print();
    }
}