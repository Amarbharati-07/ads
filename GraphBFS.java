import java.util.*;

public class GraphBFS {
    static final int MAX = 20;
    static int[][] adj = new int[MAX][MAX];
    static boolean[] visited = new boolean[MAX];
    static int n;

    public static void createGraph() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Nodes: ");
        n = sc.nextInt();
        int maxEdges = n * (n - 1);
        for (int i = 1; i <= maxEdges; i++) {
            System.out.println("Enter edge (0 0 to quit): ");
            int origin = sc.nextInt();
            int destin = sc.nextInt();

            if (origin == 0 && destin == 0) break;

            if (origin > n || destin > n || origin <= 0 || destin <= 0) {
                System.out.println("Invalid Edge");
                i--;
            } else {
                adj[origin][destin] = 1;
            }
        }
    }

    public static void display() {
        System.out.println("Adjacency Matrix:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(adj[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        System.out.print("BFS Traversal: " + v + " ");
        visited[v] = true;
        queue.add(v);

        while (!queue.isEmpty()) {
            v = queue.poll();
            for (int i = 1; i <= n; i++) {
                if (adj[v][i] == 1 && !visited[i]) {
                    System.out.print(i + " ");
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Roll no-9");
        createGraph();
        while (true) {
            System.out.println("\n1. Breadth First Search Using Queue");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter Starting node for Breadth First Search: ");
                    int v = sc.nextInt();
                    Arrays.fill(visited, false); // Reset visited array
                    bfs(v);
                    break;
                case 2:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Choice");
                    break;
            }
        }
    }
}
