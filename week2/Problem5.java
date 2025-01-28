import java.util.Stack;

 /**
  *
  * @author JC
  */
 
 public class Problem5 {
 
     public static int solution(String s) {
         // WRITE YOUR CODE HERE!!!!
         if (s == null || s.length() < 2)
             return 0;
 
         int maxLength = 0;
         Stack<Integer> stack = new Stack<>();
         stack.push(-1); // Initialize with -1 as base index
 
         for (int i = 0; i < s.length(); i++) {
             if (s.charAt(i) == '(') {
                 stack.push(i);
             } else {
                 stack.pop();
                 if (stack.empty()) {
                     stack.push(i);
                 } else {
                     maxLength = Math.max(maxLength, i - stack.peek());
                 }
             }
         }
 
         return maxLength;
     }
 
     public static void main(String[] args) {
         String s = "(()))())(";
         System.out.println("Longest Valid Parentheses : " + solution(s)); // EXPECTED RESULT 4
 
         // ADD YOU TEST CASES HERE!!!
         // Test case 1: "(())"
         String test1 = "(()";
         System.out.println("Test case 1 - Input: " + test1);
         System.out.println("Result: " + solution(test1)); // Expected: 2
 
         // Test case 2: Empty string
         String test2 = "";
         System.out.println("Test case 2 - Input: empty string");
         System.out.println("Result: " + solution(test2)); // Expected: 0
     }
 
 }
 