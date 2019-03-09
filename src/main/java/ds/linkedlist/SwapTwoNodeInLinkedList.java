package ds.linkedlist;

/** Created by HARISH on 09- 03- 2019 */
public class SwapTwoNodeInLinkedList {

  public static void swapNodes(HGLinkedList<Integer> ll, Integer x, Integer y) {
    Node<Integer> n1 = null;
    Node<Integer> p1 = null;
    Node<Integer> n2 = null;
    Node<Integer> p2 = null;
    Node<Integer> prev = null;
    Node<Integer> curr = ll.getHead();

    while (curr != null) {
      if (curr.getData().equals(x) || curr.getData().equals(y)) {
        if (n1 == null) {
          n1 = curr;
          p1 = prev;
          prev = curr;
          curr = curr.getNext();
          continue;
        }
        if (n2 == null) {
          n2 = curr;
          p2 = prev;
          break;
        }
      }
      prev = curr;
      curr = curr.getNext();
    }

    Node<Integer> next = null;
    next = n1.getNext();
    n1.setNext(n2.getNext());
    n2.setNext(next);

    prev = p1.getNext();
    p1.setNext(p2.getNext());
    p2.setNext(prev);

    return;
  }
}
