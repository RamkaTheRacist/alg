package Algorithm.l3.task1;

public class t1 {
    Node head;
    Node tail;

    public void add(int value) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    public void add(int value, Node node) {
        Node next = node.next;
        Node newNode = new Node();
        newNode.value = value;
        node.next = newNode;
        newNode.prev = node;
        if (next == null) {
            tail = newNode;
        } else {
            next.prev = newNode;
            newNode.next = next;
        }
    }

    public void delete(Node node) {
        Node prev = node.prev;
        Node next = node.next;
        if (prev == null) {
            next.prev = null;
            head = next;
        } else {
            if (next == null) {
                prev.next = null;
                tail = prev;
            } else {
                prev.next = next;
                next.prev = prev;
            }
        }
    }

    public void reverse() {
        Node currentNode = head;
        while (currentNode != null) {
            Node next = currentNode.next;
            Node prev = currentNode.prev;
            currentNode.next = next;
            currentNode.prev = prev;
            if (prev == null) {
                tail = currentNode;
            }
            if (next == null) {
                head = currentNode;
            }
            currentNode = next;

        }

    }

    public Node find(int value) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value) {
                return currentNode;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    public class Node {
        int value;
        Node next;
        Node prev;
    }
}
