import java.util.Scanner;
class InfixToPostfixWithoutImport { static final int MAX = 100;
public static int precedence(char c) { if (c == '^') return 3;
if (c == '*' || c == '/') return 2; if (c == '+' || c == '-') return 1; return -1;
}
public static boolean isOperand(char c) { return Character.isLetterOrDigit(c);
}
public static String infixToPostfix(String infix) { char[] stack = new char[MAX];
int top = -1;
StringBuilder postfix = new StringBuilder(); for (int i = 0; i < infix.length(); i++) {
char currentChar = infix.charAt(i); if (isOperand(currentChar)) {
postfix.append(currentChar);
}
else if (currentChar == '(') { stack[++top] = currentChar;
}
else if (currentChar == ')') {
while (top != -1 && stack[top] != '(') { postfix.append(stack[top--]);
}
top--;
}
else {
while (top != -1 && precedence(stack[top]) >= precedence(currentChar)) { postfix.append(stack[top--]);
 
}
stack[++top] = currentChar;
}
}
while (top != -1) { postfix.append(stack[top--]);
}

return postfix.toString();
}

public static void main(String[] args) { System.out.print("Roll No.15    \n");
Scanner scanner = new Scanner(System.in); System.out.print("Enter the infix expression: "); 
String infix = scanner.nextLine();
String postfix = infixToPostfix(infix); 
System.out.println("Postfix Expression: " + postfix);
}
}
