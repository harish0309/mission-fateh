package ds.linkedlist;

/** Created by HARISH on 14- 03- 2019 */
public class SwapEveryKthNodeInSLL {

  public static void main(String[] args) {
    HGLinkedList<Integer> list1 = new HGLinkedList<>();
    list1.insert(1);
    list1.insert(2);
    list1.insert(3);
    list1.insert(4);
    list1.insert(5);
    list1.insert(6);
    list1.insert(7);
    list1.insert(8);
    list1.insert(9);
    list1.insert(10);
    list1.insert(11);

    Node<Integer> head = reverse(list1.getHead(), 4);
  }

  private static Node<Integer> reverse(Node<Integer> head, int k) {
    Node<Integer> prev = null;
    Node<Integer> next = null;
    Node<Integer> curr = head;
    int count = 0;

    while (curr != null
        && count < k) { // check if it is the last element or count is less than k elements
      next = curr.getNext();
      curr.setNext(prev);
      prev = curr;
      curr = next;
      count++;
    }

    if (next != null) {
      head.setNext(reverse(next, k));
    }

    return prev;
  }
}
