package Algorithm.l3.task2;

public class t2 {
    Node head;
    public void reverse(){
        if(head != null && head.next != null){
            reverse(head.next, head);
        }
    }
    private void reverse(Node currentNode, Node prevNode){
        if(currentNode.next == null){
            head = currentNode;
        }else{
            reverse(currentNode.next, currentNode);
        }
        currentNode.next = prevNode;
        prevNode.next = null;
    }
    public class Node {
        int value;
        Node next;

    }
}
