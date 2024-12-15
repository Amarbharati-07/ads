import java.util.Scanner;

// Node class representing each element in the queue
class Node {
    int data;
    Node next;

    // Constructor for Node
    Node(int value) {
        data = value;
        next = null;
    }
}

// Queue class implementing queue operations using a linked list
class Queue {
    private Node front; // Points to the front of the queue
    private Node rear;  // Points to the rear of the queue

    // Constructor for Queue
    public Queue() {
        front = rear = null;
    }

    // Enqueue operation - adds an element to the end of the queue
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) { // If the queue is empty
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(value + " enqueued to queue");
    }

    // Dequeue operation - removes an element from the front of the queue
    public int dequeue() {
        if (front == null) { // If the queue is empty
            System.out.println("Queue is empty");
            return -1;
        }
        int value = front.data;
        front = front.next; // Move the front pointer to the next node
        if (front == null) { // If the queue becomes empty
            rear = null;
        }
        return value;
    }

    // Peek operation - returns the front element without removing it
    public int peek() {
        if (front == null) { // If the queue is empty
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    // Display operation - shows all elements in the queue
    public void display() {
        if (front == null) { // If the queue is empty
            System.out.println("Queue is empty");
            return;
        }
        Node current = front;
        System.out.print("Queue contents: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

// Main class to test the queue implementation
public class OrdinaryQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println("Roll No. 15");
        Scanner scanner = new Scanner(System.in);
        int choice, value;

        do {
            // Display menu options
            System.out.println("\nQueue Operations Menu:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: // Enqueue operation
                    System.out.print("Enter value to enqueue: ");
                    value = scanner.nextInt();
                    queue.enqueue(value);
                    break;

                case 2: // Dequeue operation
                    value = queue.dequeue();
                    if (value != -1) {
                        System.out.println(value + " dequeued from queue");
                    }
                    break;

                case 3: // Display operation
                    queue.display();
                    break;

                case 4: // Exit
                    System.out.println("Exiting...");
                    break;

                default: // Invalid choice
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
