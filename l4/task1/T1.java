package Algorithm.l4.task1;

import java.util.ArrayList;
import java.util.List;



public class T1 {
    Node root;

    // Обход в глубину
    public boolean ifExists(int value) {
        if (root != null) {
            if (find(value, root) != null) {
                return true;
            }
        }
        return false;
    }

    private Node find(int value, Node node) {
        if (node.value == value) {
            return node;
        } else {
            for (Node child : node.children) {
                Node res = find(value, child);
                if (res != null) {
                    return res;
                }
            }
        }
        return null;
    }

    //Обход в ширину

    private Node findThis(int value){
        List<Node> line = new ArrayList<>();
        line.add(root);
        while(line.size() > 0){
            List<Node> nextLine = new ArrayList<>();
            for (Node node : line) {
                if(node.value == value){
                    return node;
                }
                nextLine.addAll(node.children);
            }
            line = nextLine;
        }
        return null;
    }

    public class Node {
        int value;
        List<Node> children;
    }
}
