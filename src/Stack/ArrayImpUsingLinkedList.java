package Stack;

public class ArrayImpUsingLinkedList {

    // Node class representing each element in the stack
    public static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    // Stack class with all stack operations
    public static class Stack {
        private Node head = null;  // Top of the stack
        private int size = 0;      // Stack size

        // Push an element to the stack
        void push(int x) {
            Node newNode = new Node(x);
            newNode.next = head;
            head = newNode;
            size++;
        }

        // Pop the top element from the stack
        int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            int topValue = head.value;
            head = head.next;
            size--;
            return topValue;
        }

        // Peek at the top element without removing
        int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return head.value;
        }

        // Display stack from bottom to top using recursion
        void displayRev() {
            System.out.print("Stack (bottom to top): ");
            displayHelper(head);
            System.out.println();
        }

        // Helper method for reverse display
        private void displayHelper(Node node) {
            if (node == null) return;
            displayHelper(node.next);
            System.out.print(node.value + " ");
        }

        // Return current size of the stack
        int size() {
            return size;
        }

        // Check if stack is empty
        boolean isEmpty() {
            return size == 0;
        }
    }

    // Main method to test the Stack
    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(5);
        st.displayRev();   // Output: 5

        st.push(4);
        st.push(3);
        st.displayRev();   // Output: 5 4 3

        System.out.println("Current Size: " + st.size()); // 3

        st.pop();
        System.out.println("After Pop, Size: " + st.size()); // 2

        st.push(2);
        System.out.println("Top Element: " + st.peek()); // 2

        st.push(1);
        st.displayRev();   // Output: 5 4 2 1
    }
}
