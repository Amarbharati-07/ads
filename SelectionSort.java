import java.util.Scanner;
public class SelectionSort {
 // Method to display the array
 public static void display(int[] array, int size) {
 for (int i = 0; i < size; i++) {
 System.out.print(array[i] + " ");
 }
 System.out.println();
 }
 // Method to perform selection sort
 public static void selectionSort(int[] array, int size) {
 int imin, temp;
 for (int i = 0; i < size - 1; i++) {
 imin = i;
 for (int j = i + 1; j < size; j++) {
 if (array[j] < array[imin]) {
 imin = j;
 }
 }
 // Swap the elements
 temp = array[i];
 array[i] = array[imin];
 array[imin] = temp;
 }
 }
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

 // This line ensures your roll number is printed at the start
 System.out.println("roll no.15");

 System.out.println("Enter the number of elements: ");
 int n = sc.nextInt();

 int[] arr = new int[n];
 System.out.println("Enter elements:");

 // Accepting array elements from the user
 for (int i = 0; i < n; i++) {
 arr[i] = sc.nextInt();
 }
 // Display the array before sorting
 System.out.print("Array before Sorting: ");
 display(arr, n);
 // Performing selection sort
 selectionSort(arr, n);
 // Display the array after sorting
 System.out.print("Array after Sorting: ");
 display(arr, n);
 }
}