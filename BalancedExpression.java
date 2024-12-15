import java.util.Scanner;
import java.util.Stack;
public class BalancedExpression {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("\nRoll no. 15 \nEnter expression :");
String expression = scanner.nextLine();
if (isBalanced(expression)) {
System.out.println("Balanced");
} else {
System.out.println("Unbalanced");
}
scanner.close();
}
private static boolean isBalanced(String expression) {
Stack<Character> stack = new Stack<>();
for (char ch : expression.toCharArray()) {
if (ch == '{' || ch == '[' || ch == '(') {
stack.push(ch);
} else {
switch (ch) {
case ')':
if (stack.isEmpty() || stack.pop() != '(') {
return false;
}
break;
case ']':
if (stack.isEmpty() || stack.pop() != '[') {
return false;
}
break;
case '}':
if (stack.isEmpty() || stack.pop() != '{') {
return false;
}
break;
default:
System.out.println("Enter the correct choice");
return false;
}
}
}
return stack.isEmpty();
}
}