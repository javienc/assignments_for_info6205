/**
 *
 * @author JC
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
        // Handle edge case where list is empty
        if (head == null)
            return null;

        // Create a dummy node to handle edge cases (like removing first node)
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast pointer n steps ahead
        for (int i = 0; i <= n; i++) {
            if (fast == null)
                return head; // Handle invalid n
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove the nth node from end
        slow.next = slow.next.next;

        return dummy.next;
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
        // Test Case 1: 1 -> 2 -> 3 -> 4, n = 2
        System.out.println("\nTest Case 1:");
        ListNode test1 = new ListNode(1);
        test1.next = new ListNode(2);
        test1.next.next = new ListNode(3);
        test1.next.next.next = new ListNode(4);
        System.out.print("Original List: ");
        printList(test1);

        test1 = solution(test1, 2);
        System.out.print("Updated List: ");
        printList(test1); // Expected: 1->2->4

        // Test Case 1: 1 -> 2, n = 2
        System.out.println("\nTest Case 2:");
        ListNode test2 = new ListNode(1);
        test2.next = new ListNode(2);
        System.out.print("Original List: ");
        printList(test2);

        test2 = solution(test2, 2);
        System.out.print("Updated List: ");
        printList(test2); // Expected: 2
    }

}
