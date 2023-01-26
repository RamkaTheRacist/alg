package Algorithm.s3.HW;

public class MyList {
    Node head;

    public void reverseList(){
        if(head != null && head.next != null){
            reverseList(head, head.next);
        }
    }
    private void reverseList(Node currentNode, Node next){
        if(next.next != null){
            reverseList(next, next.next);
        }else{
            head = next;
        }
        next.next = currentNode;
        currentNode.next = null;
    }

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
