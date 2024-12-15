import java.util.*;

public class GraphBFS {
    static final int NODE = 6; // Number of nodes in the graph
    static int[][] graph = {
        {0, 1, 1, 1, 0, 0},
        {1, 0, 0, 1, 1, 0},
        {1, 0, 0, 1, 0, 1},
        {1, 1, 1, 0, 1, 1},
        {0, 1, 0, 1, 0, 1},
        {0, 0, 1, 1, 1, 0}
    };

    // Node class to represent a vertex
    static class Node {
        int val;     // Vertex index
        boolean visited; // Visited state

        public Node(int val) {
            this.val = val;
            this.visited = false;
        }
    }

    // BFS function
    public static void bfs(Node[] vertices, Node start) {
        Queue<Node> queue = new LinkedList<>();

        // Mark the start node as visited and enqueue it
        start.visited = true;
        queue.add(start);

        System.out.print("BFS Traversal: ");
        
        // Perform BFS
        while (!queue.isEmpty()) {
            Node current = queue.poll(); // Dequeue the node
            System.out.print((char) (current.val + 'A') + " "); // Print the node

            // Visit all neighbors
            for (int i = 0; i < NODE; i++) {
                if (graph[current.val][i] == 1 && !vertices[i].visited) { // Edge exists and not visited
                    vertices[i].visited = true; // Mark as visited
                    queue.add(vertices[i]); // Enqueue the neighbor
                }
            }
        }
        System.out.println(); // New line after traversal
    }

    public static void main(String[] args) {
        System.out.println("Roll no. 60");
        System.out.println("Graph Traversal using BFS.\n");

        Node[] vertices = new Node[NODE];

        // Initialize all vertices
        for (int i = 0; i < NODE; i++) {
            vertices[i] = new Node(i);
        }

        // Starting node: B (index 1)
        char startChar = 'B';
        Node startNode = vertices[startChar - 'A'];

        // Perform BFS starting from the given node
        bfs(vertices, startNode);
    }
}


