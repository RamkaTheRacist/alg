package Algorithm.s4.HW;

public class BinaryTree {
    Node root;
    static int tmp = 0;

    public Node buildTree(int numberOfHights) { // сбалансированное
        Node root;
        if (numberOfHights == 0) {
            return null;
        } else {
            root = new Node(tmp++);
            root.left = buildTree(numberOfHights / 2);
            root.right = buildTree(numberOfHights - numberOfHights / 2 - 1);

        }
        return root;
    }
}
