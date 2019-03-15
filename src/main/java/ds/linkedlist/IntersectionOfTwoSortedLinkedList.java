package ds.linkedlist;

/** Created by HARISH on 09- 03- 2019 */
public class IntersectionOfTwoSortedLinkedList {

  public static HGLinkedList<Integer> create(
      HGLinkedList<Integer> list1, HGLinkedList<Integer> list2) {
    HGLinkedList<Integer> list3 = new HGLinkedList<>();
    Node<Integer> l1 = list1.getHead();
    Node<Integer> l2 = list2.getHead();

    while (l1 != null) {
      if (l1.getData() < l2.getData()) {
        l1 = l1.getNext();
      } else if (l2.getData() < l1.getData()) {
        l2 = l2.getNext();
      } else {
        list3.insert(l1.getData());
        l1 = l1.getNext();
        l2 = l2.getNext();
      }
    }

    return list3;
  }
}
