package ds.linkedlist;

/**
 * Created by HARISH on 09- 03- 2019
 */
public class SegregateEvenOddInLinkedList {

    public static void main(String[] args) {
        HGLinkedList<Integer> list1 = new HGLinkedList<>();
        list1.insert(1);
        list1.insert(2);
        list1.insert(3);
        list1.insert(4);
        list1.insert(5);
        list1.insert(6);
       // list1.insert(7);
        segEvenOdd(list1);
    }

    public static HGLinkedList<Integer> segEvenOdd(HGLinkedList<Integer> l) {
        int k = 0;
        Node<Integer> tempCurr = l.getHead();
        Node<Integer> tempPrev = null;

        while (tempCurr != null) {
            tempPrev = tempCurr;
            tempCurr = tempCurr.getNext();
            k++;
        }
        Node<Integer> tail = tempPrev;


        Node<Integer> prev = null;
        Node<Integer> curr = l.getHead();
        Node<Integer> next = null;

        int count = 1;
        while (count <= k) {

            if (count % 2 == 0) {
                next = curr.getNext();
                prev.setNext(next);
                curr.setNext(tail.getNext());
                tail.setNext(curr);
                tail = curr;
                curr = next;

            } else {
                prev = curr;
                curr = curr.getNext();
            }
            count++;
        }
        return l;
    }
}
