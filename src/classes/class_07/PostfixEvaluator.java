package classes.class_07;

public class PostfixEvaluator {

    private static class Stack {
        private static class Node {
            int value; // Changed to int to store numbers and results
            Node next;

            Node(int value) {
                this.value = value;
                this.next = null;
            }

            Node(int value, Node next) {
                this.value = value;
                this.next = next;
            }
        }

        private Node top;

        public Stack() {
            this.top = null;
        }

        public void push(int value) {
            Node nodeToPush = new Node(value);
            nodeToPush.next = this.top;
            this.top = nodeToPush;
        }

        public int pop() {
            if (isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }
            int value = top.value;
            top = top.next;
            return value;
        }

        public boolean isEmpty() {
            return top == null;
        }
    }

    public int evaluatePostfix(String expression) {
        Stack evalStack = new Stack(); // Main stack for evaluation
        Stack digitStack = new Stack(); // Auxiliary stack to build multi-digit numbers

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            // If the character is a digit, accumulate it in digitStack
            if (Character.isDigit(c)) {
                digitStack.push(c - '0'); // Convert char to int (e.g., '2' -> 2)
            }
            // If the character is an operator or we've reached the end, process the accumulated number
            if ((c == '+' || c == '*' || c == '/' || i == expression.length() - 1) && !digitStack.isEmpty()) {
                // Build the number from digitStack
                int number = 0;
                int place = 1; // For units, tens, hundreds, etc.
                while (!digitStack.isEmpty()) {
                    number += digitStack.pop() * place;
                    place *= 10;
                }
                evalStack.push(number);

                // If the character is an operator, evaluate it
                if (c == '+' || c == '*' || c == '/') {
                    if (evalStack.isEmpty()) {
                        throw new IllegalArgumentException("Invalid postfix expression: not enough operands");
                    }
                    int b = evalStack.pop(); // Second operand
                    if (evalStack.isEmpty()) {
                        throw new IllegalArgumentException("Invalid postfix expression: not enough operands");
                    }
                    int a = evalStack.pop(); // First operand
                    int result;

                    switch (c) {
                        case '+':
                            result = a + b;
                            break;
                        case '*':
                            result = a * b;
                            break;
                        case '/':
                            if (b == 0) {
                                throw new ArithmeticException("Division by zero");
                            }
                            result = a / b;
                            break;
                        default:
                            throw new IllegalArgumentException("Unsupported operator: " + c);
                    }
                    evalStack.push(result);
                }
            }
        }

        // The final result should be the only item on the stack
        if (evalStack.isEmpty()) {
            throw new IllegalArgumentException("Invalid postfix expression: stack is empty");
        }
        int result = evalStack.pop();
        if (!evalStack.isEmpty()) {
            throw new IllegalArgumentException("Invalid postfix expression: too many operands");
        }
        return result;
    }

    public static void main(String[] args) {
        PostfixEvaluator evaluator = new PostfixEvaluator();

        String expr1 = "23+33+*";
        System.out.println("Input: " + expr1);
        System.out.println("Output: " + evaluator.evaluatePostfix(expr1)); // 30

        String expr2 = "99*";
        System.out.println("Input: " + expr2);
        System.out.println("Output: " + evaluator.evaluatePostfix(expr2)); // 81

        String expr3 = "77*93/*";
        System.out.println("Input: " + expr3);
        System.out.println("Output: " + evaluator.evaluatePostfix(expr3)); // 147 (not 52)
    }
}
