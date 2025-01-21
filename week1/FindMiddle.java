package week1;

/**
 *
 * @author JC
 */
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class FindMiddle {

    public static Node findMiddle(Node head) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {

        // SAMPLE CASE 1 || 1->2->3->4->5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        Node middle = findMiddle(head);
        System.out.println("Middle Node: " + (middle != null ? middle.data : "Empty List")); // EXPECTED RESULT: 3

        // ADD YOUR TEST CASES HERE!!!
        // Test Case 2: Even length list
        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);
        head2.next.next.next = new Node(4);
        System.out.println("Middle (Even): " + findMiddle(head2).data); // Expected: 3

        // Test Case 3: Single node
        Node head3 = new Node(1);
        System.out.println("Middle (Single): " + findMiddle(head3).data); // Expected: 1

        // Test Case 4: Empty list
        System.out.println("Middle (Empty): " + (findMiddle(null) == null ? "null" : "not null")); // Expected: null
    }
}
