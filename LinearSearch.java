import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int i, x, n;
        int flag = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("rollNo-15");
        System.out.println("How many numbers you want to enter in the array?");
        n = scanner.nextInt();
        // Declare array
        int[] a = new int[n];
        // Input array elements
        System.out.println("Enter Elements:");
        for (i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        // Input the number to search for
        System.out.println("Enter number which you want to search:");
        x = scanner.nextInt();
        // Linear search
        for (i = 0; i < n; i++) {
            if (a[i] == x) {
                flag = 1;
                break;
            }
        }
        // Output result
        if (flag == 1) {
            System.out.println("Element Found!");
        } else {
            System.out.println("Element not found!");
        }
        scanner.close();
    }
}