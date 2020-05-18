package ds.linkedlist;

/** Created by HARISH on 09- 03- 2019 */
public class SegregateEvenOddInLinkedList {

  public static void main(String[] args) {
    HGLinkedList<Integer> list1 = new HGLinkedList<>();
    list1.insert(2);
    list1.insert(4);
    list1.insert(6);
    list1.insert(7);
    //    list1.insert(8);
    //    list1.insert(10);
    // list1.insert(7);
    segEvenOdd(list1);
  }

  public static Node<Integer> segEvenOdd(HGLinkedList<Integer> l) {
    Node<Integer> curr = l.getHead();
    Node<Integer> oddStart = null;
    Node<Integer> oddEnd = null;
    Node<Integer> evenStart = null;
    Node<Integer> evenEnd = null;

    while (curr != null) {
      Node<Integer> next = curr.getNext();
      if (curr.getData() % 2 == 0) {
        if (evenStart == null) {
          evenStart = curr;
        } else {
          evenEnd.setNext(curr);
        }
        evenEnd = curr;
      } else {
        if (oddStart == null) {
          oddStart = curr;
        } else {
          oddEnd.setNext(curr);
        }
        oddEnd = curr;
      }
      curr = next;
    }
    Node<Integer> newRoot;
    if (oddStart == null) {
      newRoot = evenStart;
    } else {
      oddEnd.setNext(evenStart);
      newRoot = oddStart;
      evenEnd.setNext(null);
    }


    return newRoot;
  }
}
