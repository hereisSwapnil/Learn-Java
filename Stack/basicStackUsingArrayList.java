import java.util.ArrayList;

public class basicStackUsingArrayList {
    public static class Stack {
        ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty() {
            return list.size() == 0;
        }

        public void push(int data) {
            list.add(data);
        }

        public int pop() {
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public int peek() {
            return list.get(list.size() - 1);
        }

        public void print() {
            for (int i = list.size() - 1; i >= 0; i--) {
                System.out.println(list.get(i));
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
