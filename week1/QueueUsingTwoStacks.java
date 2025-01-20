package week1;

/**
 *
 * @author JC
 */

import java.util.Stack;

public class QueueUsingTwoStacks {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueueUsingTwoStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int x) {
        stack1.push(x);
    }

    public int dequeue() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();

        // SAMPLE CASE 1
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue()); // EXPECTED RESULT 1
        queue.enqueue(4);
        System.out.println(queue.dequeue()); // EXPECTED RESULT 2

        // ADD YOUR TEST CASES HERE!!!
        // Test Case 1: Empty queue
        QueueUsingTwoStacks emptyQueue = new QueueUsingTwoStacks();
        try {
            emptyQueue.dequeue();
        } catch (IllegalStateException e) {
            System.out.println("Empty queue test case passed");
        }

        // Test Case 2: Multiple operations
        queue.enqueue(5);
        System.out.println(queue.dequeue()); // Should print: 3
        System.out.println(queue.dequeue()); // Should print: 4
        System.out.println(queue.dequeue()); // Should print: 5

    }
}
