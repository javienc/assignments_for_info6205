/**
 *
 * @author ...
 */
public class Problem1 {

    // Implement this function!!!
    public void heapSort(int[] arr) {
            // write your code here!!!!
     }
    

    // Utility function to print an array
    public void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Problem1 hs = new Problem1();
        int[] arr = {12, 11, 13, 5, 6, 7};
        
        System.out.println("Unsorted array:");
        hs.printArray(arr);
        
        hs.heapSort(arr);
        
        System.out.println("Sorted array:");
        hs.printArray(arr);
    }
}

