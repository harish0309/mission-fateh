package ds.linkedlist;

/** Created by HARISH on 09- 03- 2019 */
public class CheckIfLoopExistsInLinkedList {

  public static boolean isLoopPresent(HGLinkedList<Integer> ll) {
    boolean isLoopPresent = false;
    Node<Integer> sp = ll.getHead(); // The slow pointer moves one step every time.
    Node<Integer> fp =
        ll.getHead().getNext().getNext(); // The fast pointer moves two steps every time.

    while (sp != null && fp != null) {
      if (sp == fp) {
        isLoopPresent = true;
        break;
      }
      sp = sp.getNext();
      fp = fp.getNext().getNext();
    }
    return isLoopPresent;
  }
}
