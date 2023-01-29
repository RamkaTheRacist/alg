package Algorithm.s4.HW;

public class prog {
    public static void main(String[] args) {
        BinaryTree tmp = new BinaryTree();
        tmp.root = tmp.buildTree(14);
        TreeTraversal tmp1 = new TreeTraversal();
        tmp1.printNLR(tmp.root, "");
        tmp1.printNRL(tmp.root, "");
        tmp1.printRNL(tmp.root, "");
        tmp1.printLNR(tmp.root, "");

    }
}
