public class diameterOfBT_On {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // TreeInfo Class

    static class TreeInfo {
        int height;
        int diameter;

        TreeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    static class BinaryTree {
        static int index = -1;

        public static Node buildTree(int nodes[]) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static TreeInfo diameter_optimised(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }
        TreeInfo left = diameter_optimised(root.left);
        TreeInfo right = diameter_optimised(root.right);

        int myHeight = Math.max(left.height, right.height) + 1;

        int d1 = left.diameter;
        int d2 = right.diameter;
        int d3 = left.height + right.height + 1;

        int myDiameter = Math.max(Math.max(d1, d2), d3);

        return new TreeInfo(myHeight, myDiameter);
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(diameter_optimised(root).diameter);
    }
}
