
 import java.util.Scanner;
class AdjacencyMatrix {
 private int[][] adj;
 private int n;
 // Constructor to initialize the adjacency matrix
 public AdjacencyMatrix(int n) {
 this.n = n;
 adj = new int[n][n];
 // Initialize all values to 0
 for (int i = 0; i < n; i++) {
 for (int j = 0; j < n; j++) {
 adj[i][j] = 0;
 }
 }
 }
 // Method to add an edge
 public void addEdge(int origin, int dest) {
 if (origin >= n || dest >= n || origin < 0 || dest < 0) {
 System.out.println("Wrong nodes");
 } else {
 adj[origin][dest] = 1;
 }
 }
 // Method to display the adjacency matrix
 public void display() {
 for (int i = 0; i < n; i++) {
 for (int j = 0; j < n; j++) {
 System.out.print(adj[i][j] + "\t");
 }
 System.out.println();
 }
 }
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 int nodes, maxEdges, origin, dest;
System.out.println("Roll no. 15");
 System.out.print("Enter Maximum number of nodes: ");
 nodes = scanner.nextInt();
 AdjacencyMatrix am = new AdjacencyMatrix(nodes);
 maxEdges = nodes * (nodes - 1);
 System.out.println("Enter -1 -1 to exit");
 for (int i = 0; i < maxEdges; i++) {
 System.out.print("\nEnter edges: ");
 origin = scanner.nextInt();
 dest = scanner.nextInt();
 if (origin == -1 && dest == -1) {
 break;
 } else {
 am.addEdge(origin, dest);
 }
 }
 am.display();
 scanner.close();
 }
}
