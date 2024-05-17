import java.util.Scanner;

class Node {
    int value;
    int priority;
    Node next;

    Node(int value, int priority) {
        this.value = value;
        this.priority = priority;
        this.next = null;
    }
}

class PriorityQueue {
    Node front;

    PriorityQueue() {
        front = null;
    }

    void insert(int value, int priority) {
        Node newNode = new Node(value, priority);
        if (front == null || priority < front.priority) {
            newNode.next = front;
            front = newNode;
        } else {
            Node temp = front;
            while (temp.next != null && temp.next.priority <= priority) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    void delete() {
        if (front == null) {
            System.out.println("Error List Empty");
            return;
        }
        front = front.next;
    }

    void display() {
        if (front == null) {
            System.out.println("Empty");
            return;
        }
        Node temp = front;
        while (temp != null) {
            System.out.print(+ temp.value + " " + temp.priority + " ");
            temp = temp.next;
        }
    }
}

public class PQDLL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue priorityQueue = new PriorityQueue();

        int choice;
        do {
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int value = scanner.nextInt();
                    int priority = scanner.nextInt();
                    priorityQueue.insert(value, priority);
                    break;
                case 2:
                    priorityQueue.delete();
                    break;
                case 3:
                    priorityQueue.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Wrong Choice");
                    break;
            }
        } while (choice != 4);
    }
}
