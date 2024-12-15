import java.util.Scanner;
class Node {
int data;
Node next;
Node prev;
Node(int value) {
data = value;
next = null;
prev = null;
}
}
class Deque {
private Node front;
private Node rear;
public Deque() {
front = rear = null;
}
public void insertFront(int value) {
Node newNode = new Node(value);
newNode.next = front;
if (front != null) {
front.prev = newNode;
}
front = newNode;
if (rear == null) {
rear = newNode;
}
System.out.println(value + " inserted at front");
}
public void insertRear(int value) {
Node newNode = new Node(value);
newNode.next = null;
newNode.prev = rear;
if (rear != null) {
rear.next = newNode;
}
rear = newNode;
if (front == null) {
front = newNode;
}
System.out.println(value + " inserted at rear");
}
public int deleteFront() {
if (front == null) {
System.out.println("Deque is empty");
return -1;
}
int value = front.data;
front = front.next;
if (front != null) {
front.prev = null;
} else {
rear = null;
}
return value;
}
public int deleteRear() {
if (rear == null) {
System.out.println("Deque is empty");
return -1;
}
int value = rear.data;
rear = rear.prev;
if (rear != null) {
rear.next = null;
} else {
front = null;
}
return value;
}
public int getFront() {
if (front == null) {
System.out.println("Deque is empty");
return -1;
}
return front.data;
}
public int getRear() {
if (rear == null) {
System.out.println("Deque is empty");
return -1;
}
return rear.data;
}
public void display() {
if (front == null) {
System.out.println("Deque is empty");
return;
}
Node current = front;
System.out.print("Deque contents: ");
while (current != null) {
System.out.print(current.data + " ");
current = current.next;
}
System.out.println();
}
}
public class DoubleEndedQueue {
public static void main(String[] args) {
Deque dq = new Deque();
System.out.println("Roll no. 15");
Scanner scanner = new Scanner(System.in);
int ch, value;
System.out.println("\nDeque Operations Menu:");
System.out.println("1. Insert Front 2. Insert Rear 3. Delete Front");
System.out.println("4. Delete Rear 5. Display 6. Exit");
do {
System.out.print("Enter your choice: ");
ch = scanner.nextInt();
switch (ch) {
case 1:
System.out.print("Enter value to insert at front: ");
value = scanner.nextInt();
dq.insertFront(value);
break;
case 2:
System.out.print("Enter value to insert at rear: ");
value = scanner.nextInt();
dq.insertRear(value);
break;
case 3:
value = dq.deleteFront();
if (value != -1) {
System.out.println(value + " deleted from front");
}
break;
case 4:
value = dq.deleteRear();
if (value != -1) {
System.out.println(value + " deleted from rear");
}
break;
case 5:
dq.display();
break;
case 6:
System.exit(0);
default:
System.out.println("Invalid choice. Please try again.");
}
} while (ch != 6);
scanner.close();
}
}