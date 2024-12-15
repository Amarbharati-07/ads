import java.util.Scanner; 
class Stack {
    private static final int MAX = 10; private int[] a;
    private int top; public Stack() {
    a = new int[MAX]; top = -1;
    }
    public boolean isEmpty() { return top == -1;
    }
    public boolean isFull() { return top == MAX - 1;
    }
    public void push(int value) { if (isFull()) {
    System.out.println("Stack overflow, Cannot push " + value + "."); return;
    }
    a[++top] = value;
    System.out.println(value + " pushed onto stack");
    }
    public void pop() { if (isEmpty()) {
    System.out.println("Stack is empty. Cannot pop."); return;
    }
    System.out.println(a[top--] + " popped from stack");
    }
    public void peek() { if (isEmpty()) {
     
    System.out.println("Stack is empty."); return;
    }
    System.out.print("The elements are: "); for (int i = 0; i <= top; i++) {
    System.out.print(a[i] + " ");
    }
    System.out.println();
    }
    }
    public class Stacks {
    public static void main(String[] args) { System.out.println("Roll No.15 "); Stack stack = new Stack();
    stack.push(10); stack.push(20); stack.peek();
    stack.pop();
    stack.peek();
    stack.pop();
    stack.pop();
    }
    }
    