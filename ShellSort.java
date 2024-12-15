import java.util.Scanner;
public class ShellSort {
 public static void main(String[] args) {
 System.out.println("roll no.15");
 Scanner scanner = new Scanner(System.in);
 // Read the size of the array
 System.out.print("Enter the size of the array: ");
 int n = scanner.nextInt();
 // Create the array and read its elements
 int[] a = new int[n];
 System.out.print("Enter the elements of the array: ");
 for (int i = 0; i < n; i++) {
 a[i] = scanner.nextInt();
 }
 // Print array before sorting
 System.out.print("Array elements before sorting: ");
 for (int i = 0; i < n; i++) {
 System.out.print(a[i] + " ");
 }
 System.out.println();
 // Shell Sort Logic
 for (int gap = n / 2; gap > 0; gap /= 2) {
 for (int i = gap; i < n; i++) {
 int temp = a[i];
 int j = i;
 // Move elements of the array that are greater than temp to the gap distance ahead
 while (j >= gap && a[j - gap] > temp) {
 a[j] = a[j - gap];
 j -= gap;
 }
 a[j] = temp;
 }
 }
 // Print array after sorting
 System.out.print("Array after sorting: ");
 for (int i = 0; i < n; i++) {
 System.out.print(a[i] + " ");
 }
 // Close the scanner
 scanner.close();
 } }