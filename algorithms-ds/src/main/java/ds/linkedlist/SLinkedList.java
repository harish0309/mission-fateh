package ds.linkedlist;

/**
 * Created by HARISH on 13- 04- 2018
 */
public class SLinkedList<T> {
    private Node head = null;
    private Node end = head;

    public void add(T val) {
        if (head == null) {
            head = createNewNode(val);
            end = head;
        } else {
            Node node = createNewNode(val);
            end.next = node;
            end = node;
        }
    }

    public void add(T val, int index) {
        Node<T> node = new Node<>(val);
        if (index == 0) {
            node.next = head;
            head = node;
        } else {
            Node prev = head;
            for (int i = 1; i <= index; i++) {
                if (i == index) {
                    node.next = prev.next;
                    prev.next = node;
                }
                prev = prev.next;
            }
        }
    }

    public void removeElement(T val) {
        if (head.value.equals(val)) {
            head = head.next;
        } else {
            Node c = head;
            Node p = null;
            while (!c.value.equals(val)) {
                p = c;
                c = c.next;
            }
            p.next = c.next;
        }
    }

    public void removeElementAt(int pos) {
        if (pos == 0) {
            head = head.next;
        } else {
            Node prev = head;
            Node curr = null;
            for (int i = 1; i <= pos; i++) {
                curr = prev.next;
                if (i == pos) {
                    prev.next = curr.next;
                }
                prev = prev.next;
            }
        }
    }

    public Node reverseSLinkedList() {
        Node current = head;
        Node previous = null;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
        return head;
    }

    public void reverseUsingRecursion(){
           reverse(head, null);
    }
    private void reverse(Node curr, Node prev){
        if(curr.next == null ){
            curr.next = prev;
            head = curr;
            return;
        }
        Node next = curr.next;
        curr.next = prev;
        reverse(next, curr);
    }

    private Node createNewNode(T val) {
        Node<T> node = new Node<>(val);
        return node;
    }

    private static class Node<T> {
        T value;
        Node next;

        Node(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }
}
