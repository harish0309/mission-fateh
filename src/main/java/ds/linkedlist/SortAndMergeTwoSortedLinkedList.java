package ds.linkedlist;

/** Created by HARISH on 09- 03- 2019 */
public class SortAndMergeTwoSortedLinkedList {

  public static Node mergeSort(HGLinkedList<Integer> leftList, HGLinkedList<Integer> rightList) {
    Node<Integer> head =
        leftList.getHead().getData() < rightList.getHead().getData()
            ? leftList.getHead()
            : rightList.getHead();
    Node<Integer> l = leftList.getHead();
    Node<Integer> r = rightList.getHead();
    while (l != null && r != null) {
      if (r.getData() < l.getData()
          && (r.getNext() == null || r.getNext().getData() > l.getData())) {
        Node<Integer> next = r.getNext();
        r.setNext(l);
        r = next;
      } else if (r.getData() < l.getData()) {
        r = r.getNext();
      } else if (l.getData() < r.getData()
          && (l.getData() == null || l.getNext().getData() > r.getData())) {
        Node<Integer> next = l.getNext();
        l.setNext(r);
        l = next;
      } else if (l.getData() < r.getData()) {
        l = l.getNext();
      }
    }

    return head;
  }
}
