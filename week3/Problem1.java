/**
 *
 * @author ...
 */
import java.util.Arrays;

public class Problem1 {
    
    // Function to merge two sorted arrays into nums1
    // IMPLEMENT THE BELOW FUNCTION. 
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // WRITE YOUR CODE HERE!!!
    }

    public static void main(String[] args) {
        // Test case 1
        int[] nums1_1 = new int[6];
        
        nums1_1[0] = 1;
        nums1_1[1] = 2;
        nums1_1[2] = 3;
        int m1 = 3;
        
        int[] nums2_1 = {2, 5, 6};
        int n1 = 3;
        
        merge(nums1_1, m1, nums2_1, n1);
        System.out.println("Merged array 1: " + Arrays.toString(nums1_1)); // Expected: [1, 2, 2, 3, 5, 6]

        
        // Test case 2: nums1 has larger initial elements
        int[] nums1_2 = new int[6]; 
        nums1_2[0] = 4;
        nums1_2[1] = 6;
        nums1_2[2] = 8;
        int m2 = 3;
        
        int[] nums2_2 = {1, 3, 5};
        int n2 = 3;
        
        merge(nums1_2, m2, nums2_2, n2);
        System.out.println("Merged array 2: " + Arrays.toString(nums1_2)); // Expected: [1, 3, 4, 5, 6, 8]



        // Test case 3: nums1 is empty
        int[] nums1_4 = new int[3];
        int m4 = 0;
        
        int[] nums2_4 = {1, 2, 3};
        int n4 = 3;
        
        merge(nums1_4, m4, nums2_4, n4);
        System.out.println("Merged array 4: " + Arrays.toString(nums1_4)); // Expected: [1, 2, 3]

        // Test case 5: nums1 and nums2 both have single elements
        int[] nums1_5 = new int[2];
        nums1_5[0] = 2;
        int m5 = 1;
        
        int[] nums2_5 = {1};
        int n5 = 1;
        
        merge(nums1_5, m5, nums2_5, n5);
        System.out.println("Merged array 5: " + Arrays.toString(nums1_5)); // Expected: [1, 2]
    }
}

