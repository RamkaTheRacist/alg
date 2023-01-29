package Algorithm.s4.task1;

import java.util.Random;

public class T1 {
    // Обход дерева
    public Node root;

    public static void printNLR(Node node, String space) {
        if (node != null) {
            System.out.printf("%s%d\n", space, node.value);
            printNLR(node.left, space + "|\t");
            printNLR(node.right, space + "|\t");
        }
    }

    public static class Node {
        private Node left;
        private Node right;
        private int value;

        public Node(int value) {
            this.value = value;
        }
    }

    public static Node buildTree(int numberOfHights) { // сбалансированное
        Node root;
        if (numberOfHights == 0) {
            return null;
        } else {
            root = new Node(new Random().nextInt(0, 10));
            root.left = buildTree(numberOfHights / 2);
            root.right = buildTree(numberOfHights - numberOfHights / 2 - 1);

        }
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(0);
        Node l = new Node(1);
        Node r = new Node(2);
        Node ll = new Node(3);
        Node lr = new Node(4);
        Node rl = new Node(5);
        Node rr = new Node(6);
        Node lll = new Node(7);
        Node llr = new Node(8);
        Node lrl = new Node(9);
        root.left = l;
        root.right = r;
        l.left = ll;
        l.right = lr;
        r.left = rl;
        r.right = rr;
        ll.left = lll;
        ll.right = llr;
        lr.left = lrl;
        // printNLR(root, "");
        printNLR(buildTree(20), "");

    }
}
