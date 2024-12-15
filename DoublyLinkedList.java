import java.util.Scanner;
public class DoublyLinkedList {

 static class Node {
 int data;
 Node next;
 Node prev;

 Node(int data) {
 this.data = data;
 this.next = null;
 this.prev = null;
 }
 }
 private Node start = null;
 // Create a list
 public void create(int x) {
 Node tmp = new Node(x);
 if (start == null) {
 start = tmp;
 } else {
 Node p = start;
 while (p.next != null) {
 p = p.next;
 }
 p.next = tmp;
 tmp.prev = p;
 }
 }
 // Add at the beginning
 public void addAtBegin(int x) {
 if (start == null) {
 System.out.println("List is empty.");
 } else {
 Node tmp = new Node(x);
 tmp.next = start;
 start.prev = tmp;
 start = tmp;
 }
 }
 // Add after a given position
 public void addAfter(int x, int pos) {
 if (start == null) {
 System.out.println("List is empty.");
 } else {
 Node p = start;
 for (int i = 1; i < pos; i++) {
 if (p == null) {
 System.out.println("Position does not exist.");
 return;
 }
 p = p.next;
 }
 Node tmp = new Node(x);
 tmp.next = p.next;
 if (p.next != null) {
 p.next.prev = tmp;
 }
 p.next = tmp;
 tmp.prev = p;
 }
 }
 // Delete an element
 public void delete(int x) {
 if (start == null) {
 System.out.println("List is empty.");
 return;
 }

 // Delete first element
 if (start.data == x) {
 Node tmp = start;
 start = start.next;
 if (start != null) start.prev = null;
 tmp = null;
 return;
 }
 // Delete middle or last element
 Node p = start;
 while (p != null && p.next != null) {
 if (p.next.data == x) {
 Node tmp = p.next;
 p.next = tmp.next;
 if (tmp.next != null) {
 tmp.next.prev = p;
 }
 tmp = null;
 return;
 }
 p = p.next;
 }
 // If we reach here, the element was not found
 if (p != null && p.data == x) {
 Node tmp = p;
 if (p.prev != null) p.prev.next = null;
 tmp = null;
 }
 }
 // Reverse the list
 public void reverse() {
 Node p1 = start;
 Node p2 = (p1 != null) ? p1.next : null;
 p1.next = null;
 if (p1 != null) p1.prev = p2;
 while (p2 != null) {
 p2.prev = p2.next;
 p2.next = p1;
 p1 = p2;
 p2 = p2.prev;
 }
 start = p1;
 System.out.println("List reversed.");
 }
 // Count elements in the list
 public void count() {
 Node p = start;
 int cnt = 0;
 while (p != null) {
 cnt++;
 p = p.next;
 }
 System.out.println("Number of elements are " + cnt + ".");
 }
 // Search for an element
 public void search() {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter the element to be searched: ");
 int value = sc.nextInt();
 if (start == null) {
 System.out.println("List is empty.");
 return;
 }
 Node p = start;
 int count = 0;
 while (p != null) {
 count++;
 if (p.data == value) {
 System.out.println("Element found at position " + count + ".");
 return;
 }
 p = p.next;
 }
 System.out.println("Element not found.");
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
 // Display the list
 public void display() {
 if (start == null) {
 System.out.println("List is empty.");
 return;
 }
 Node p = start;
 System.out.print("\nDoubly Linked List: ");
 while (p != null) {
 System.out.print(p.data + " <-> ");
 p = p.next;
 }
 System.out.println("null\n");
 }
 public static void main(String[] args) {
 DoublyLinkedList d = new DoublyLinkedList();
System.out.println("Roll no.15");
 Scanner sc = new Scanner(System.in);
 int x, pos, ch;
 while (true) {
 System.out.println("1. Create a list");
 System.out.println("2. Add at begin");
 System.out.println("3. Add after");
 System.out.println("4. Search");
 System.out.println("5. Reverse");
 System.out.println("6. Count");
 System.out.println("7. Sort");
 System.out.println("8. Display");
 System.out.println("9. Delete");
 System.out.println("10. Exit");
 System.out.print("Enter your choice: ");
 ch = sc.nextInt();
 switch (ch) {
 case 1:
 System.out.print("Enter the value: ");
 x = sc.nextInt();
 d.create(x);
 d.display();
 break;
 case 2:
 System.out.print("Enter the value: ");
 x = sc.nextInt();
 d.addAtBegin(x);
 d.display();
 break;
 case 3:
 System.out.print("Enter the position: ");
 pos = sc.nextInt();
 System.out.print("Enter the value: ");
 x = sc.nextInt();
 d.addAfter(x, pos);
 d.display();
 break;
 case 4:
 d.search();
 d.display();
 break;
 case 5:
 d.reverse();
 d.display();
 break;
 case 6:
 d.count();
 d.display();
 break;
 case 7:
 System.out.println("Before sorting:");
 d.display();
 d.sort();
 System.out.println("After sorting:");
 d.display();
 break;
 case 8:
 d.display();
 break;
 case 9:
 System.out.print("Enter the element to be deleted: ");
 x = sc.nextInt();
 d.delete(x);
 d.display();
 break;
 case 10:
 sc.close();
 System.exit(0);
 break;
 default:
 System.out.println("Invalid choice");
 }
 }
 }
}