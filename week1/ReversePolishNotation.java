package week1;

/**
 *
 * @author JC
 */

import java.util.Stack;

public class ReversePolishNotation {

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a - b);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    int divisor = stack.pop();
                    int dividend = stack.pop();
                    stack.push(dividend / divisor);
                    break;
                default:
                    stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {

        // SAMPLE CASE 1
        String[] tokens1 = { "2", "1", "+", "3", "*" };
        System.out.println("Result: " + evalRPN(tokens1)); // Output: 9

        // SAMPLE CASE 2
        String[] tokens2 = { "4", "13", "5", "/", "+" };
        System.out.println("Result: " + evalRPN(tokens2)); // Output: 6

    }
}
