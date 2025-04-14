import java.util.Stack;

class MinStack {
    class Pair {
        int val;
        int minSoFar;

        Pair(int val, int minSoFar) {
            this.val = val;
            this.minSoFar = minSoFar;
        }
    }

    Stack<Pair> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(new Pair(val, val));
        } else {
            int currentMin = stack.peek().minSoFar;
            stack.push(new Pair(val, Math.min(val, currentMin)));
        }
    }

    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
        }
    }

    public int top() {
        return stack.peek().val;
    }

    public int getMin() {
        return stack.peek().minSoFar;
    }
}
