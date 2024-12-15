import java.util.Scanner;
public class BinarySearch {
 // Binary search method
 public static int binarySearch(int[] arr, int l, int r, int x) {
 if (r >= l) {
 int mid = l + (r - l) / 2;
 // Check if x is present at mid
 if (arr[mid] == x) {
 return mid;
 }
 // If x is smaller than mid, search in the left half
 if (arr[mid] > x) {
 return binarySearch(arr, l, mid - 1, x);
 }
 // If x is larger than mid, search in the right half
 return binarySearch(arr, mid + 1, r, x);
 }
 // Return -1 if the element is not present in the array
 return -1;
 }
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
System.out.println("Roll no.15");
 // Initialize the array
 int[] arr = new int[5];
 // Taking user input for array elements
 for (int i = 0; i < 5; i++) {
 System.out.print("Enter element " + (i + 1) + ": ");
 arr[i] = scanner.nextInt();
 }
 // Displaying the elements
 System.out.println("Elements are:");
 for (int i = 0; i < 5; i++) {
 System.out.println(arr[i]);
 }
 System.out.print("Enter the element to search: ");
 int x = scanner.nextInt();
 // Calling binary search and displaying the result
 int n = arr.length;
 int result = binarySearch(arr, 0, n - 1, x);
 if (result == -1) {
 System.out.println("Element is not present in the array");
 } else {
 System.out.println("Element is present at index " + result);
 }
 scanner.close();
 }
}