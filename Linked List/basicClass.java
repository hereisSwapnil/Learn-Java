public class basicClass {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
        } else if (size == 1) {
            head = tail = null;
            size = 0;
        } else {
            head = head.next;
            size--;
        }
    }

    public void removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
        } else if (size == 1) {
            head = tail = null;
        } else {
            int i = 0;
            Node temp = head;
            while (i < size - 2) {
                temp = temp.next;
                i++;
            }
            temp.next = null;
            tail = temp;
            size--;
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.printf(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
        size++;
    }

    public void add(int data, int index) {
        Node temp = head;
        int i = 0;
        while (i < (index - 1)) {
            temp = temp.next;
            i++;
        }
        Node newNode = new Node(data);
        Node nodePlus = temp.next;
        temp.next = newNode;
        newNode.next = nodePlus;
        size++;
    }

    public int search(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recursiveSearch(int key) {
        return helper(head, key);
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void removeNthNodeFromLast(int index) {
        Node temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        if (index == size) {
            head = head.next;
            return;
        }
        int i = 1;
        Node prev = head;
        while (i < size - index) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }

    public static void main(String[] args) {
        basicClass ll = new basicClass();
        ll.addFirst(3);
        ll.addLast(4);
        ll.addFirst(1);
        ll.addLast(6);
        ll.addFirst(9);
        ll.addLast(5);
        ll.add(99, 2);
        ll.removeFirst();
        ll.print();
        ll.removeNthNodeFromLast(2);
        ll.print();
        // ll.reverse();
        // ll.print();
        // System.out.println(ll.size);
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.recursiveSearch(4));
        // System.out.println(ll.search(4));
    }
}
