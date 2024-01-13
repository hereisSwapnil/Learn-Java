import java.util.LinkedList;
import java.util.Queue;

public class sumOfNodesAtKthLevel {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static int sumAtKthLevel(Node root, int k) {
        if (root == null) {
            return 0;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        int level = 1;
        int sum = 0;
        while (level <= k) {
            Node currNode = queue.remove();
            if (currNode == null) {
                System.out.println();
                if (queue.isEmpty()) {
                    break;
                } else {
                    queue.add(null);
                    level++;
                }
            } else {
                if (level == k) {
                    sum += currNode.data;
                }
                queue.add(currNode.left);
                queue.add(currNode.right);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(sumAtKthLevel(root, 2));
    }
}
