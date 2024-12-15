import java.util.Scanner;
class Node {
int data;
int priority;
Node next;
Node(int data, int priority) {
this.data = data;
this.priority = priority;
this.next = null;
}
}
class PriorityQueue {
private Node front;
public PriorityQueue() {
front = null;
}
public void enqueue(int value, int priority) {
Node newNode = new Node(value, priority);
if (front == null || priority < front.priority) {
newNode.next = front;
front = newNode;
} else {
Node current = front;
while (current.next != null && current.next.priority <= priority) {
current = current.next;
}
newNode.next = current.next;
current.next = newNode;
}
System.out.println(value + " enqueued to queue with priority " + priority);
}
public int dequeue() {
if (front == null) {
System.out.println("Queue is empty");
return -1;
}
Node temp = front;
int value = front.data;
front = front.next;
temp = null; // Help with garbage collection
return value;
}
public int peek() {
if (front == null) {
System.out.println("Queue is empty");
return -1;
}
return front.data;
}
public void display() {
if (front == null) {
System.out.println("Queue is empty");
return;
}
Node current = front;
System.out.print("Priority Queue contents (data: priority): ");
while (current != null) {
System.out.print("(" + current.data + ": " + current.priority + ") ");
current = current.next;
}
System.out.println();
}
}
public class PriorityQueues {
public static void main(String[] args) {
PriorityQueue pq = new PriorityQueue();
System.out.println("Roll no. 15");
Scanner scanner = new Scanner(System.in);
int ch, value, priority;
do {
System.out.println("\nPriority Queue Operations Menu:");
System.out.println("1. Enqueue 2. Dequeue 3. Display 4. Exit");
System.out.print("Enter your choice: ");
ch = scanner.nextInt();
switch (ch) {
case 1:
System.out.print("Enter value to enqueue: ");
value = scanner.nextInt();
System.out.print("Enter priority (lower number = higher priority): ");
priority = scanner.nextInt();
pq.enqueue(value, priority);
break;
case 2:
value = pq.dequeue();
if (value != -1) {
System.out.println(value + " dequeued from queue");
}
break;
case 3:
pq.display();
break;
case 4:
System.exit(0);
default:
System.out.println("Invalid choice. Please try again.");
}
} while (ch != 4);
scanner.close();
}
}

