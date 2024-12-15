import java.util.Scanner;
class SinglyLinkedList {
 // Node class for the linked list
 class Node {
 int data;
 Node next;

 public Node(int data) {
 this.data = data;
 this.next = null;
 }
 }
 private Node start = null;

 // Insert at the beginning
 public void insertAtBeg(int x) {
 Node newNode = new Node(x);
 if (start == null) {
 start = newNode;
 } else {
 newNode.next = start;
 start = newNode;
 }
 }
 // Insert at the end
 public void insertAtEnd(int x) {
 Node newNode = new Node(x);
 if (start == null) {
 start = newNode;
 } else {
 Node p = start;
 while (p.next != null) {
 p = p.next;
 }
 p.next = newNode;
 }
 }
 // Insert at specific position
 public void insertAtPos(int x, int pos) {
 Node newNode = new Node(x);
 if (start == null) {
 System.out.println("List is empty.");
 return;
 }

 Node p = start;
 int count = 1;

 // Traverse to position
 while (p != null && count < pos - 1) {
 p = p.next;
 count++;
 }
 if (p == null || count < pos - 1) {
 System.out.println("Invalid position.");
 } else {
 newNode.next = p.next;
 p.next = newNode;
 }
 }
 // Search for a value
 public void searchPos(int value) {
 if (start == null) {
 System.out.println("List is empty.");
 return;
 }
 Node p = start;
 int count = 1;
 while (p != null) {
 if (p.data == value) {
 System.out.println("Value found at position " + count + ".");
 return;
 }
 p = p.next;
 count++;
 }
 System.out.println("Value not found.");
 }
 // Delete a node at a specific position
 public void del(int pos) {
 if (start == null) {
 System.out.println("List is empty.");
 return;
 }
 if (pos == 1) {
 start = start.next;
 return;
 }
 Node p = start;
 int count = 1;
 while (p != null && count < pos - 1) {
 p = p.next;
 count++;
 }
 if (p == null || p.next == null) {
 System.out.println("Invalid position.");
 } else {
 p.next = p.next.next;
 }
 }
 // Sort the list
 public void sort() {
 if (start == null) {
 System.out.println("List is empty.");
 return;
 }
 Node ptr = start;
 while (ptr != null) {
 Node p = ptr.next;
 while (p != null) {
 if (ptr.data > p.data) {
 int temp = ptr.data;
 ptr.data = p.data;
 p.data = temp;
 }
 p = p.next;
 }
 ptr = ptr.next;
 }
 }
 // Reverse the list
 public void reverse() {
 if (start == null) {
 System.out.println("List is empty.");
 return;
 }

 if (start.next == null) {
 System.out.println("Only one element in the list.");
 return;
 }
 Node prev = null;
 Node current = start;
 Node next = null;

 while (current != null) {
 next = current.next;
 current.next = prev;
 prev = current;
 current = next;
 }

 start = prev;
 System.out.println("List reversed.");
 }
 // Display the list
 public void display() {
 if (start == null) {
 System.out.println("List is empty.");
 return;
 }
 Node p = start;
 System.out.println("\nSingly Linked List:");
 while (p != null) {
 System.out.print(p.data + " -> ");
 p = p.next;
 }
 System.out.println();
 }
}
public class SinglyLinkedLists {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 SinglyLinkedList list = new SinglyLinkedList();
System.out.println("Roll no.15");

 int ch, x, pos;
 while (true) {
 System.out.println("\n1. Insert at beginning");
 System.out.println("2. Insert at end");
 System.out.println("3. Insert at position");
 System.out.println("4. Delete");
 System.out.println("5. Search");
 System.out.println("6. Display");
 System.out.println("7. Sort");
 System.out.println("8. Reverse");
 System.out.println("9. Exit");
 System.out.print("Enter your choice: ");
 ch = sc.nextInt();
 switch (ch) {
 case 1:
 System.out.print("Enter the value: ");
 x = sc.nextInt();
 list.insertAtBeg(x);
 list.display();
 break;
 case 2:
 System.out.print("Enter the value: ");
 x = sc.nextInt();
 list.insertAtEnd(x);
 list.display();
 break;
 case 3:
 System.out.print("Enter the value: ");
 x = sc.nextInt();
 System.out.print("Enter the position: ");
 pos = sc.nextInt();
 list.insertAtPos(x, pos);
 list.display();
 break;
 case 4:
 System.out.print("Enter the position to delete: ");
 pos = sc.nextInt();
 list.del(pos);
 list.display();
 break;
 case 5:
 System.out.print("Enter the value to search: ");
 x = sc.nextInt();
 list.searchPos(x);
 break;
 case 6:
 list.display();
 break;
 case 7:
 list.sort();
 list.display();
 break;
 case 8:
 list.reverse();
 list.display();
 break;
 case 9:
 sc.close();
 System.out.println("Exiting program.");
 return;
 default:
 System.out.println("Invalid choice.");
 }
 }
 }
}