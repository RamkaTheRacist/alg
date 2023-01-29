package Algorithm.s4.HW;

public class TreeTraversal {
    public void printNLR(Node node, String space) {
        if (node != null) {
            System.out.printf("%s%d\n", space, node.value);
            printNLR(node.left, space + "\t");
            printNLR(node.right, space + "\t");
        }
    }

    public void printNRL(Node node, String space) {
        if (node != null) {
            System.out.printf("%s%d\n", space, node.value);
            if (node.right != null || node.left != null) {
                printNRL(node.right, space + "\t");
                printNRL(node.left, space + "\t");
            }
        }
    }

    public void printLNR(Node node, String space) {
        if (node != null) {
            if (node.left != null) {
                printLNR(node.left, space + "\t");
                System.out.printf("%s%d\n", space, node.value);
                printLNR(node.right, space + "\t");
            } else {
                System.out.printf("%s%d\n", space, node.value);
            }
        }

    }

    public void printRNL(Node node, String space) {
        if (node != null) {
            if (node.right != null) {
                printRNL(node.right, space + "\t");
                System.out.printf("%s%d\n", space, node.value);
                printRNL(node.left, space + "\t");
            } else {
                System.out.printf("%s%d\n", space, node.value);
            }
        }

    }
}
