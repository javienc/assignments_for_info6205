/**
 *
 * @author ...
 */
import java.util.*;

public class Problem3 {
    
    // IMPLEMENT THE BELOW FUNCTION!!!
    public int nthUglyNumber(int n) {
        return -1; // Return the nth ugly number
    }

    public static void main(String[] args) {
        Problem3 solution = new Problem3();
        
        // Test case 1: Find the 10th ugly number
        int n = 10;
        System.out.println("The " + n + "th ugly number is: " + solution.nthUglyNumber(n)); // Expected output: 12
        
        // Test case 2: Find the 1st ugly number
        n = 1;
        System.out.println("The " + n + "st ugly number is: " + solution.nthUglyNumber(n)); // Expected output: 1
        
        // Test case 3: Find the 15th ugly number
        n = 15;
        System.out.println("The " + n + "th ugly number is: " + solution.nthUglyNumber(n)); // Expected output: 24
    }
}

