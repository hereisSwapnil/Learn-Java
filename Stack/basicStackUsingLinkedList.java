public class basicStackUsingLinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static class Stack {
        Node head = null;

        public boolean isEmpty() {
            return head == null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            Node temp = head;
            newNode.next = temp;
            head = newNode;
        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            head = head.next;
            return head.data;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }

        public void print() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack.push(8);
        stack.print();
        System.out.println();
        stack.pop();
        stack.print();
        System.out.println();
        System.out.println(stack.peek());
    }
}
