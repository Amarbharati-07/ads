import java.util.Scanner;
public class BubbleSort {
 public static void main(String[] args) {
 System.out.println("roll no. 15.");
 Scanner scanner = new Scanner(System.in);
 System.out.println("How many numbers you want to enter?");
 int n = scanner.nextInt();
 int[] a = new int[n];
 System.out.println("Enter Elements:");
 for (int i = 0; i < n; i++) {
 a[i] = scanner.nextInt();
 }
 // Bubble sort algorithm
 for (int i = 0; i < n - 1; i++) {
 for (int j = 0; j < n - i - 1; j++) {
 if (a[j] > a[j + 1]) {
 // Swap elements
 int temp = a[j];
 a[j] = a[j + 1];
 a[j + 1] = temp;
 }
 }
 }
 // Print sorted array with spaces
 System.out.println("Sorted array is:");
 for (int i = 0; i < n; i++) {
 System.out.print(a[i]);
 if (i != n - 1) {
 System.out.print(" "); // Print space after every number except the last one
 }
 }
 System.out.println(); // Add a newline after the sorted array
 scanner.close();
 }
}