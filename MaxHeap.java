import java.util.Scanner;
public class MaxHeap {
 // Method to perform max heapify
 public static void maxHeapify(int[] a, int i, int n) {
 int j, temp;
 temp = a[i];
 j = 2 * i;
 // Perform max-heapify by comparing the node with its children
 while (j <= n) {
 if (j < n && a[j + 1] > a[j]) {
 j = j + 1; // If right child is larger, select right child
 }
 if (temp > a[j]) {
 break; // If the node is larger than or equal to the largest child, stop
 } else if (temp <= a[j]) {
 a[j / 2] = a[j]; // Swap the node with the largest child
 j = 2 * j; // Move down the tree
 }
 }
 a[j / 2] = temp; // Place the original value at the correct position
 }
 // Method to build the max heap from an unsorted array
 public static void buildMaxHeap(int[] a, int n) {
 for (int i = n / 2; i >= 1; i--) {
 maxHeapify(a, i, n); // Call maxHeapify on all non-leaf nodes
 }
 }
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
System.out.println("Roll no: 15");
 // Input the number of elements
 System.out.println("Enter number of elements in the array:");
 int n = scanner.nextInt();
 // Initialize the array
 int[] a = new int[21]; // Size 21 to handle 1-based indexing
 // Input the elements into the array
 for (int i = 1; i <= n; i++) {
 System.out.println("Enter element " + i + ":");
 a[i] = scanner.nextInt();
 }
 // Build the max heap
 buildMaxHeap(a, n);
 // Output the max heap
 System.out.println("Max Heap:");
 for (int i = 1; i <= n; i++) {
 System.out.println(a[i]);
 }
 scanner.close();
 }
}