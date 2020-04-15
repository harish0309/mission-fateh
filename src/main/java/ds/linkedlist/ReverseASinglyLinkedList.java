package ds.linkedlist;

/**
 * Created by HARISH on 15- 04- 2020
 */
public class ReverseASinglyLinkedList {

    public static Node<Integer> reverse(HGLinkedList<Integer> ll) {
        Node<Integer> head = ll.getHead();
        Node<Integer> curr = head;

        Node<Integer> prev = null;
        Node<Integer> next = null;


        while (curr != null) {
            next = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = next;
        }

        return prev;

    }
}
