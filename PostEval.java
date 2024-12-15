import java.util.Stack;
public class PostEval {
 // Method to evaluate postfix expression
 public static int evaluatePostfix(String expr) {
 Stack<Integer> stack = new Stack<>();

 // Loop through each character in the postfix expression
 for (int i = 0; i < expr.length(); i++) {
 char ch = expr.charAt(i);

 // If the character is a digit, push it onto the stack
 if (Character.isDigit(ch)) {
 stack.push(ch - '0'); // Convert char to int
 } else {
 // Pop two elements from the stack and apply the operator
 int b = stack.pop();
 int a = stack.pop();

 // Perform the operation based on the operator
 switch (ch) {
 case '+':
 stack.push(a + b);
 break;
 case '-':
 stack.push(a - b);
 break;
 case '*':
 stack.push(a * b);
 break;
 case '/':
 if (b != 0) {
 stack.push(a / b); // Avoid division by zero
 } else {
 System.out.println("Division by zero error");
 return -1; // Exit on division by zero error
 }
 break;
 default:
 System.out.println("Invalid operator: " + ch);
 return -1; // Exit on invalid operator
 }
 }
 }
 // The final result will be at the top of the stack
 return stack.pop();
 }
 public static void main(String[] args) {
System.out.println("Roll no. 15");
 java.util.Scanner scanner = new java.util.Scanner(System.in);
 System.out.print("Enter Postfix Expression: ");
 String expr = scanner.next();
 int result = evaluatePostfix(expr);
 if (result != -1) {
 System.out.println("Result: " + result);
 }
 scanner.close();
 }
}