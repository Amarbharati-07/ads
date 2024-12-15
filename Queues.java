import java.util.Scanner; 
class Queue {
    private int front, rear; private int[] q;
    private static final int max = 10;
    
    public Queue() { front = rear = -1; q = new int[max];
    }
    
    public void enqueue(int x) { if (rear == max - 1) {
    System.out.println("Queue is Full!");
    } else {
    if (front == -1 && rear == -1) { front = rear = 0;
    } else {
    rear++;
    }
    q[rear] = x;
    System.out.println(x + " enqueued to queue");
    }
    }
    
    public int dequeue() { int x = -1;
    if (front == -1) { System.out.println("Queue is Empty!");
    } else {
    if (front == rear) { x = q[front]; front = rear = -1;
    } else {
    x = q[front]; front++;
     
    }
    }
    return x;
    }
    
    public void peek() { if (front == -1) {
    System.out.println("Queue is Empty!");
    } else {
    System.out.print("Queue Elements are: "); for (int i = front; i <= rear; i++) {
    System.out.print(q[i] + " ");
    }
    System.out.println();
    }
    }
    }
    
    public class Queues {

    public static void main(String[] args) { System.out.print(" Roll No.15 \n"); Queue q = new Queue();
    Scanner scanner = new Scanner(System.in); int ch, x;
    do {
    System.out.print("1. Enqueue	2. Dequeue	3. Display Queue	4. Exit: "); ch = scanner.nextInt();
    switch (ch) { case 1:
    System.out.print("Enter the value to be inserted: "); x = scanner.nextInt();
    q.enqueue(x); break;
    case 2:
    x = q.dequeue(); if (x != -1) {
    System.out.println(x + " dequeued!");
    }
    break; case 3:
     
    q.peek(); break;
    case 4:
    return; default:
    System.out.println("Invalid choice. Exiting."); return;
    }
    } while (ch != 4); scanner.close();
    }
    }
    