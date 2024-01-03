public class circularQueue {
    public static class Queue {
        int arr[];
        int size;
        int rear;
        int front;

        Queue(int n) {
            arr = new int[n];
            size = arr.length;
            rear = -1;
            front = -1;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full!");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
            size++;
        }

        public void remove() {
            if (rear == -1) {
                System.out.println("Queue is Empty!");
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            size--;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty!");
                return -1;
            }
            return arr[0];
        }

        public void print() {
            for (int i = 0; i < rear + 1; i++) {
                System.out.println(arr[i]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.print();
        q.remove();
        q.print();
    }
}
