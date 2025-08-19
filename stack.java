class Stack {
    private int maxSize;
    private int top;
    private int[] arr;

    public Stack(int size) {
        maxSize = size;
        arr = new int[maxSize];
        top = -1;
    }

    public void push(int x) {
        if (top >= maxSize - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class Main {
    public static void main(String[] args) {
        Stack s = new Stack(100);
        s.push(10);
        s.push(20);
        System.out.println(s.peek());  // Output: 20
        s.pop();
        System.out.println(s.peek());  // Output: 10
    }
}
