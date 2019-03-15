package ds.linkedlist;

/** Created by HARISH on 15- 03- 2019 */
public class SwapEveryTwoNodesInSLL {

  public static Node<Integer> swap(HGLinkedList<Integer> ll) {
    Node node = ll.getHead();
    // If linked list is empty on contains only one element
    if (node == null || node.getNext() == null) {
      return node;
    }
    Node prev = node;
    Node curr = node.getNext();
    node = curr;

    while (true) {
      Node next = curr.getNext();
      curr.setNext(prev);

      if (next == null || next.getNext() == null) {
        prev.setNext(next);
        break;
      }
      prev.setNext(next.getNext());

      prev = next;
      curr = next.getNext();
    }
    ll.setHead(node);
    return node;
  }
}
