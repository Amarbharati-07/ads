import java.util.Scanner;
public class InsertionSort {
 // Method to display the array
 public static void display(int[] array, int size) {
 for (int i = 0; i < size; i++) {
 System.out.print(array[i] + " ");
 }
 System.out.println();
 }
 // Insertion sort algorithm
 public static void insertionSort(int[] array, int size) {
 int key, j;
 for (int i = 1; i < size; i++) {
 key = array[i];
 j = i;
 // Move elements of array[0..i-1] that are greater than key to one position ahead
 while (j > 0 && array[j - 1] > key) {
 array[j] = array[j - 1];
 j--;
 }
 array[j] = key;
 }
 }
 public static void main(String[] args) {
 // Print roll number at the start of the output
 System.out.println("roll no.15");
 Scanner scanner = new Scanner(System.in);
 // Read the number of elements
 System.out.print("Enter the number of elements: ");
 int n = scanner.nextInt();
 // Create the array to hold the elements
 int[] arr = new int[n];
 // Read the elements into the array
 System.out.println("Enter elements:");
 for (int i = 0; i < n; i++) {
 arr[i] = scanner.nextInt();
 }
 // Display the array before sorting
 System.out.print("Array before Sorting: ");
 display(arr, n);
 // Perform the insertion sort
 insertionSort(arr, n);
 // Display the array after sorting
 System.out.print("Array after Sorting: ");
 display(arr, n);
 scanner.close();
 }
}