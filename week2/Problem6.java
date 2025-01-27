/**
 *
 * @author ...
 */
public class Problem6 {
    // Definition for singly-linked list node
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode solution(ListNode head, int n) {
        // WRITE YOUR CODE HERE
        return new ListNode(-1); // UPDATE THIS LINE OF CODE ALSO!!!
    }

    // HELPER FUNCTION TO PRINT THE LINKEDLIST
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        // Example: 1 -> 2 -> 3 -> 4 -> 5, n = 2
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original List: ");
        printList(head);

        int n = 2;
        
        head = solution(head, n);

        System.out.print("Updated List: ");
        printList(head); // EXPECTED RESULT 1->2->3->5
        
        
        // ADD YOUR TEST CASES HERE!!!!
    }

    
}
