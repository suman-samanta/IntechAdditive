


import java.util.Stack;

class ImpStack {
    private Stack<Integer> mainStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();
    public void push(int x) {
        mainStack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (!mainStack.isEmpty()) {
            int poppedElement = mainStack.pop();
            if (poppedElement == minStack.peek()) {
                minStack.pop();
            }
        }
    }

    public int min() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        } else {
            throw new IllegalStateException("Stack is empty");
        }
    }
}

public class C_MinStack {
    public static void main(String[] args) {
        ImpStack stack = new ImpStack();

        stack.push(4);
        stack.push(5);
        System.out.println("Current Min: " + stack.min()); // Output: 3

        stack.push(1);
        System.out.println("Current Min: " + stack.min()); // Output: 2

        stack.pop();
        System.out.println("Current Min: " + stack.min()); // Output: 3
    }
}
