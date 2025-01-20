package week1;

/**
 *
 * @author JC
 */
import java.util.Stack;

public class BalancedParentheses {
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty())
                    return false;

                char top = stack.pop();
                if (c == ')' && top != '(')
                    return false;
                if (c == '}' && top != '{')
                    return false;
                if (c == ']' && top != '[')
                    return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // SAMPLE CASE 1
        String input1 = "({[()]})";
        System.out.println(isBalanced(input1) ? "Balanced" : "Not Balanced"); // EXPECTED RESULT: Balanced
        // SAMPLE CASE 2
        String input2 = "({){})))";
        System.out.println(isBalanced(input2) ? "Balanced" : "Not Balanced"); // EXPECTED RESULT : Not Balanced
        // ADD YOUR TEST CASES HERE!!!
    }
}
