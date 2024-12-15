import java.util.Scanner;
class BinarySearchTree {
 // Node structure for the tree
 class Node {
 int data;
 Node left, right;
 public Node(int item) {
 data = item;
 left = right = null;
 }
 }
 private Node tree;
 public BinarySearchTree() {
 tree = null;
 }
 // Method to create a tree (insert node)
 public Node createTree(Node node, int item) {
 if (node == null) {
 node = new Node(item);
 } else {
 if (node.data > item) {
 node.left = createTree(node.left, item);
 } else {
 node.right = createTree(node.right, item);
 }
 }
 return node;
 }
 // Preorder traversal
 public void preorder(Node node) {
 if (node != null) {
 System.out.print(" " + node.data);
 preorder(node.left);
 preorder(node.right);
 }
 }
 // Inorder traversal
 public void inorder(Node node) {
 if (node != null) {
 inorder(node.left);
 System.out.print(" " + node.data);
 inorder(node.right);
 }
 }
 // Postorder traversal
 public void postorder(Node node) {
 if (node != null) {
 postorder(node.left);
 postorder(node.right);
 System.out.print(" " + node.data);
 }
 }
 // Count total nodes in the tree
 public int totalNodes(Node node) {
 if (node == null)
 return 0;
 return totalNodes(node.left) + totalNodes(node.right) + 1;
 }
 // Find the smallest node
 public void findSmallestNode(Node node) {
 if (node == null || node.left == null)
 System.out.println(node.data);
 else
 findSmallestNode(node.left);
 }
 // Find the largest node
 public void findLargestNode(Node node) {
 if (node == null || node.right == null)
 System.out.println(node.data);
 else
 findLargestNode(node.right);
 }
 // Main method to handle user input
 public static void main(String[] args) {
 BinarySearchTree obj = new BinarySearchTree();
 Scanner scanner = new Scanner(System.in);
 int choice, n, item;
System.out.println("Roll no.15");
 while (true) {
 System.out.println("\nBinary search tree common operation");
 System.out.println("1) Create Tree");
 System.out.println("2) Traversal");
 System.out.println("3) Total Nodes");
 System.out.println("4) Insert Nodes");
 System.out.println("5) Find Smallest Node");
 System.out.println("6) Find Largest Node");
 System.out.println("7) Exit");
 System.out.print("Enter your choice: ");
 choice = scanner.nextInt();
 switch (choice) {
 case 1:
 System.out.print("\nCreating Tree----");
 System.out.print("\nHow many nodes do you want to enter: ");
 n = scanner.nextInt();
 for (int i = 0; i < n; i++) {
 System.out.print("Enter value: ");
 item = scanner.nextInt();
 obj.tree = obj.createTree(obj.tree, item);
 }
 break;
 case 2:
 System.out.println("\nInorder Traversal:");
 obj.inorder(obj.tree);
 System.out.println("\nPreorder Traversal:");
 obj.preorder(obj.tree);
 System.out.println("\nPostorder Traversal:");
 obj.postorder(obj.tree);
 break;
 case 3:
 int total = obj.totalNodes(obj.tree);
 System.out.println("Total nodes: " + total);
 break;
 case 4:
 System.out.print("\nInsert node in a tree \nEnter value: ");
 item = scanner.nextInt();
 obj.tree = obj.createTree(obj.tree, item);
 System.out.println("\nItem is inserted.");
 break;
 case 5:
 System.out.println("\nSmallest node is:");
 obj.findSmallestNode(obj.tree);
 break;
 case 6:
 System.out.println("\nLargest node is:");
 obj.findLargestNode(obj.tree);
 break;
 case 7:
 System.out.println("Exiting program.");
 scanner.close();
 System.exit(0);
 default:
 System.out.println("Invalid choice, try again.");
 }
 }
 }
}