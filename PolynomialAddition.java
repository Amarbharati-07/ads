public class PolynomialAddition {

    // Method to find the maximum of two integers
    public static int max(int m, int n) {
    return (m > n) ? m : n;
    }
    // Method to add two polynomials
    public static int[] add(int[] A, int[] B, int m, int n) {
    int size = max(m, n);
    int[] sum = new int[size];
   
    // Copying elements from A[] to sum[]
    for (int i = 0; i < m; i++) {
    sum[i] = A[i];
    }
   
    // Adding elements from B[] to sum[]
    for (int i = 0; i < n; i++) {
    sum[i] += B[i];
    }
   
    return sum;
    }
    // Method to print the polynomial
    public static void printPoly(int[] poly, int n) {
    for (int i = 0; i < n; i++) {
    System.out.print(poly[i]);
    if (i != 0) {
    System.out.print("x^" + i);
    }
    if (i != n - 1) {
    System.out.print(" + ");
    }
    }
    System.out.println();
    }
    public static void main(String[] args) {
    // Student details
    System.out.println("Roll No:15");
   
    System.out.println("\nPOLYNOMIAL ADDITION\n");
   
    // First polynomial A = 1 + 0x + 2x^2 + 4x^3
    int[] A = {1, 0, 2, 4};
   
    // Second polynomial B = 3 + 5x + 7x^2
    int[] B = {3, 5, 7};
   
    // Sizes of A[] and B[]
    int m = A.length;
    int n = B.length;
    // Printing the first polynomial
    System.out.println("First polynomial is ");
    printPoly(A, m);
    // Printing the second polynomial
    System.out.println("Second polynomial is ");
    printPoly(B, n);
    // Adding polynomials A[] and B[] and getting the sum polynomial
    int[] sum = add(A, B, m, n);
    int size = max(m, n);
   
    // Printing the sum of polynomials
    System.out.println("\nsum polynomial is ");
    printPoly(sum, size);
    }
   }