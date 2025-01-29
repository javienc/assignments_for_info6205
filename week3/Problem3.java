/**
 *
 * @author ...
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Problem3 {

  // IMPLEMENT THE BELOW FUNCTION!!
  public static ListNode sortList(ListNode head) {
    // WRITE YOUR CODE HERE
    return new ListNode(); // UPDATE THE RETURN STATEMENT ALSO!!
  }


    // Utility function to print the linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example input: 4 -> 2 -> 1 -> 3
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);

        System.out.println("Original List:");
        printList(head);

        // Sort the linked list
        ListNode sortedHead = sortList(head);

        System.out.println("Sorted List:");
        printList(sortedHead); // Expected output: 1 2 3 4
    }
}

