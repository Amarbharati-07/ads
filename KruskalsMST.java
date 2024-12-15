import java.util.*;
public class KruskalsMST {
 static int[] father; // Array to store the parent of each node
 static edge[] tree; // Array to store the edges in the MST
 static int wt_tree = 0; // To store the weight of the spanning tree
 static int cnt = 0; // To count the number of edges in the spanning tree
 static int n; // Number of nodes
 // Edge class to store edges
 static class edge {
 int u, v, weight;
 }
 // Method to find the root of a node using path compression
 public static int find(int i) {
 if (father[i] < 0) {
 return i; // If parent is negative, i is the root
 }
 father[i] = find(father[i]); // Path compression
 return father[i];
 }
 // Method to union two sets by rank
 public static void union(int root1, int root2) {
 if (father[root1] < father[root2]) { // Union by rank
 father[root1] += father[root2];
 father[root2] = root1;
 } else {
 father[root2] += father[root1];
 father[root1] = root2;
 }
 }
 // Method to insert edges into the priority queue
 public static void insert_pque(int i, int j, int wt, PriorityQueue<edge> pq) {
 edge tmp = new edge();
 tmp.u = i;
 tmp.v = j;
 tmp.weight = wt;
 pq.add(tmp); // Insert edge into the priority queue
 }
 // Method to process the priority queue and form the MST
 public static void make_tree(PriorityQueue<edge> pq) {
 edge tmp;
 int node1, node2, root_n1, root_n2;
 // While there are edges and we haven't added n-1 edges to the tree
 while (cnt < n - 1 && !pq.isEmpty()) {
 tmp = pq.poll(); // Get the minimum edge
 node1 = tmp.u;
 node2 = tmp.v;
 root_n1 = find(node1); // Find the roots of the two nodes
 root_n2 = find(node2);
 // If they belong to different sets, add the edge to the MST
 if (root_n1 != root_n2) {
 insert_tree(tmp.u, tmp.v, tmp.weight); // Insert the edge into the MST
 wt_tree += tmp.weight; // Add the weight of the edge
 union(root_n1, root_n2); // Union the sets
 }
 }
 }
 // Method to insert an edge into the MST
 public static void insert_tree(int i, int j, int wt) {
 cnt++; // Increment the edge count
 tree[cnt] = new edge();
 tree[cnt].u = i;
 tree[cnt].v = j;
 tree[cnt].weight = wt;
 }
 // Method to create the graph, input edges, and set up the priority queue
 public static void create_graph(Scanner sc, PriorityQueue<edge> pq) {
 System.out.print("Enter the number of nodes: ");
 n = sc.nextInt(); // Read the number of nodes
 father = new int[n + 1]; // Initialize the father array for Union-Find
 Arrays.fill(father, -1); // Initially, every node is its own parent
 tree = new edge[n]; // Initialize the tree array to store MST edges
 System.out.println("Enter edges (0 0 to quit) weight: ");
 int origin, destin, wt;
 while (true) {
 System.out.print("Enter origin and destination (0 0 to quit): ");
 origin = sc.nextInt();
 destin = sc.nextInt();
 if (origin == 0 && destin == 0) break; // End input if origin and destination are 0
 System.out.print("Enter weight for this edge: ");
 wt = sc.nextInt();
 if (origin > n || destin > n || origin <= 0 || destin <= 0) {
 System.out.println("Invalid edge");
 continue;
 }
 insert_pque(origin, destin, wt, pq); // Insert the edge into the priority queue
 }
 if (pq.size() < n - 1) {
 System.out.println("Spanning tree is not possible.");
 System.exit(1);
 }
 }
 // Method to display the edges in the MST and the total weight
 public static void display_mst() {
 System.out.println("\nEdges to be included in spanning tree:");
 for (int i = 1; i <= cnt; i++) {
 System.out.println(tree[i].u + " - " + tree[i].v + " (Weight: " + tree[i].weight + ")");
 }
 System.out.println("Weight of this spanning tree is: " + wt_tree);
 }
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 PriorityQueue<edge> pq = new PriorityQueue<>(Comparator.comparingInt(e -> e.weight)); //
Priority queue to store edges sorted by weight
 System.out.println("Rollno: 60");
 // Create graph and input edges
 create_graph(sc, pq);
 // Create the MST
 make_tree(pq);
 // Display the result
 display_mst();
 sc.close();
 }
}