package Algorithm.s3.task1;

public class T1 {
    public static void main(String[] args) {
        MyList l1 = new MyList();
        l1.addLast("1");
        l1.addLast("2");
        l1.addLast("3");

        l1.addLast("4");

        l1.addLast("5");

        l1.addLast("6");
        l1.print();
    }
}

// Односвязный список
class MyList {
    Node head;

    public void addFirst(String value) {
        Node tmpNode = new Node(value);
        if (head == null) {
            head = tmpNode;
        } else {
            tmpNode.next = head;
            head = tmpNode;
        }
    }

    public void addLast(String value) {
        Node tmpNode = new Node(value);
        if (head == null) {
            head = tmpNode;
        } else {
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = tmpNode;
        }
    }

    public void print() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
        }
    }

    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public void removeLast() {
        if (head == null) {
            return;
        }
        Node lastNode = head;
        if (lastNode.next == null) {
            head = null;
        } else {
            while (lastNode.next.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = null;
        }
    }

    public boolean findElement(String value) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }
}

class Node {
    String value;
    Node next;

    public Node(String value) {
        this.value = value;
    }
}
