import java.util.Scanner;

// Node class representing each element in the stack
class Node {
    int data;
    Node next;

    // Constructor for Node
    Node(int value) {
        data = value;
        next = null;
    }
}

// Stack class implementing stack operations using a linked list
class Stack {
    private Node top;

    // Constructor for Stack
    public Stack() {
        top = null;
    }

    // Push operation - adds an element to the top of the stack
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println(value + " pushed to stack");
    }

    // Pop operation - removes the top element from the stack
    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        int value = top.data;
        top = top.next; // Move the top pointer to the next node
        return value;
    }

    // Peek operation - returns the top element without removing it
    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    // Display operation - displays the contents of the stack
    public void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        Node current = top;
        System.out.print("Stack contents: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

// Main class to interact with the stack
public class StackOperations {
    public static void main(String[] args) {
        System.out.println("Roll No. 15");
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);
        int choice, value;

        do {
            // Display menu options
            System.out.println("\nStack Operations Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: // Push operation
                    System.out.print("Enter value to push: ");
                    value = scanner.nextInt();
                    stack.push(value);
                    break;

                case 2: // Pop operation
                    value = stack.pop();
                    if (value != -1) {
                        System.out.println(value + " popped from stack");
                    }
                    break;

                case 3: // Peek operation
                    value = stack.peek();
                    if (value != -1) {
                        System.out.println("Top element is: " + value);
                    }
                    break;

                case 4: // Display operation
                    stack.display();
                    break;

                case 5: // Exit
                    System.out.println("Exiting...");
                    break;

                default: // Invalid choice
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
