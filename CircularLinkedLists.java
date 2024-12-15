import java.util.Scanner;
class SinglyCircularLinkedList {
 private Node last = null;
 private int count = 0;
 // Node class for the circular linked list
 class Node {
 int data;
 Node next;
 Node(int data) {
 this.data = data;
 this.next = null;
 }
 }
 // Create the list with a single node
 public void create(int x) {
 Node tmp = new Node(x);
 if (last == null) {
 last = tmp;
 tmp.next = last; // Points to itself, forming a circle
 } else {
 tmp.next = last.next;
 last.next = tmp;
 last = tmp; // Update the last node to the new node
 }
 }
 // Add element at the beginning
 public void addAtBegin(int x) {
 if (last == null) {
 System.out.println("List is empty.");
 return;
 }
 Node tmp = new Node(x);
 tmp.next = last.next;
 last.next = tmp;
 }
 // Add element after a given position
 public void addAfter(int x, int pos) {
 if (last == null) {
 System.out.println("List is empty.");
 return;
 }
 Node p = last.next;
 for (int i = 0; i < pos - 1; i++) {
 p = p.next;
 if (p == last.next) {
 System.out.println("Position does not exist.");
 return;
 }
 }
 Node tmp = new Node(x);
 tmp.next = p.next;
 p.next = tmp;
 if (p == last) {
 last = tmp; // Update last if added at the end
 }
 }
 // Delete a node with the given value
 public void del(int x) {
 if (last == null) {
 System.out.println("List is empty.");
 return;
 }
 Node p = last.next;
 if (last.next == last && last.data == x) {
 last = null; // Single node case
 return;
 }
 if (p.data == x) { // If first node needs to be deleted
 last.next = p.next;
 return;
 }
 while (p.next != last) {
 if (p.next.data == x) {
 p.next = p.next.next;
 if (p.next == last) {
 last = p; // Update last if last node is deleted
 }
 return;
 }
 p = p.next;
 }
 if (p.next.data == x) { // Deleting the last node
 p.next = last.next;
 last = p;
 }
 System.out.println("Element not found.");
 }
 // Search for an element and print its position
 public void search(int x) {
 int pos = 1;
 if (last == null) {
 System.out.println("List is empty.");
 return;
 }
 Node p = last.next;
 while (p != last) {
 if (p.data == x) {
 System.out.println("Element found at position " + pos + ".");
 return;
 }
 p = p.next;
 pos++;
 }
 if (last.data == x) {
 System.out.println("Element found at position " + pos + ".");
 } else {
 System.out.println("Item not found.");
 }
 }
 // Sort the list using bubble sort
 public void sort() {
 if (last == null) {
 System.out.println("List is empty.");
 return;
 }
 Node p = last.next;
 Node ptr = null;
 int temp;
 while (p != last) {
 ptr = p.next;
 while (ptr != last.next) {
 if (p.data > ptr.data) {
 temp = p.data;
 p.data = ptr.data;
 ptr.data = temp;
 }
 ptr = ptr.next;
 }
 p = p.next;
 }
 }
 // Count the number of elements in the list
 public void count() {
 if (last == null) {
 System.out.println("List is empty.");
 return;
 }
 Node p = last.next;
 int count = 0;
 do {
 count++;
 p = p.next;
 } while (p != last.next);
 System.out.println("Number of elements: " + count);
 }
 // Display the list
 public void display() {
 if (last == null) {
 System.out.println("List is empty.");
 return;
 }
 Node p = last.next;
 System.out.println("\nSingly Circular Linked List:");
 do {
 System.out.print(p.data + " -> ");
 p = p.next;
 } while (p != last.next);
 System.out.println("(head)");
 }
}
public class CircularLinkedLists {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 SinglyCircularLinkedList list = new SinglyCircularLinkedList();
 int ch, x, pos;
System.out.println("Roll no.15");
 while (true) {
 System.out.println("1. Create a list");
 System.out.println("2. Add at begin");
 System.out.println("3. Add after");
 System.out.println("4. Search");
 System.out.println("5. Sort");
 System.out.println("6. Count");
 System.out.println("7. Display");
 System.out.println("8. Delete");
 System.out.println("9. Exit");
 System.out.print("Enter the choice: ");
 ch = sc.nextInt();
 switch (ch) {
 case 1:
 System.out.print("Enter the value: ");
 x = sc.nextInt();
 list.create(x);
 list.display();
 break;
 case 2:
 System.out.print("Enter the value: ");
 x = sc.nextInt();
 list.addAtBegin(x);
 list.display();
 break;
 case 3:
 System.out.print("Enter the position: ");
 pos = sc.nextInt();
 System.out.print("Enter the value: ");
 x = sc.nextInt();
 list.addAfter(x, pos);
 list.display();
 break;
 case 4:
 System.out.print("Enter element to be searched: ");
 x = sc.nextInt();
 list.search(x);
 break;
 case 5:
 System.out.println("Before sorting:");
 list.display();
 list.sort();
 System.out.println("After sorting:");
 list.display();
 break;
 case 6:
 list.count();
 break;
 case 7:
 list.display();
 break;
 case 8:
 System.out.print("Enter the element to delete: ");
 x = sc.nextInt();
 list.del(x);
 list.display();
 break;
 case 9:
 sc.close();
 return;
 default:
 System.out.println("Wrong choice.");
 }
 }
 }
}