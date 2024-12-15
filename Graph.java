import java.util.*;
class Graph {

 // Adjacency list representation of the graph
 private final Map<Integer, List<Integer>> adj;

 // Constructor to initialize the graph
 public Graph() {
 adj = new HashMap<>();
 }

 // Function to add an edge to the graph
 public void addEdge(int v, int w) {
 adj.putIfAbsent(v, new ArrayList<>());
 adj.get(v).add(w);
 }

 // Recursive DFS function
 public void DFS(int v, Set<Integer> visited) {
 // Mark the current node as visited and print it
 visited.add(v);
 System.out.print(v + " ");

 // Recur for all the vertices adjacent to this vertex
 for (int neighbor : adj.getOrDefault(v, new ArrayList<>())) {
 if (!visited.contains(neighbor)) {
 DFS(neighbor, visited);
 }
 }
 }

 public static void main(String[] args) {
    System.out.println("Roll no. 15");
 // Create a new graph
 Graph g = new Graph();

 // Add edges to the graph
 g.addEdge(0, 1);
 g.addEdge(0, 2);
 g.addEdge(1, 2);
 g.addEdge(2, 0);
 g.addEdge(2, 3);
 g.addEdge(3, 3);

 // Create a set to track visited nodes
 Set<Integer> visited = new HashSet<>();

 // Print DFS traversal starting from vertex 2
 System.out.println("Following is Depth First Traversal (starting from vertex 2):");
 g.DFS(2, visited);
 }
}