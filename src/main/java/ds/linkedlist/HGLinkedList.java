package ds.linkedlist;

/** Created by HARISH on 07- 03- 2019 */
public class HGLinkedList<T> {
  private Node<T> head;

  public Node<T> getHead() {
    return head;
  }

  public void setHead(Node<T> head) {
    this.head = head;
  }

  public Node<T> insert(T data) {
    Node<T> n = new Node<>(data);
    if (head == null) {
      head = n;
      return head;
    }
    Node<T> curr = head;
    while (curr.getNext() != null) {
      curr = curr.getNext();
    }
    curr.setNext(n);
    return head;
  }

  public boolean delete(T data) {
    boolean isDeleted = false;
    Node<T> prev = null;
    Node<T> curr = this.head;
    while (curr != null && !curr.getData().equals(data)) {
      prev = curr;
      curr = curr.getNext();
    }
    if (curr != null && curr.getData().equals(data)) {
      prev.setNext(curr.getNext());
      isDeleted = true;
    }
    return isDeleted;
  }

  public T findMiddleElement() {
    Node<T> sp = head;
    Node<T> fp = head.getNext().getNext();
    while (fp.getNext() != null && fp.getNext().getNext() != null) {
      sp = sp.getNext();
      fp = fp.getNext().getNext();
    }
    return sp.getNext().getData();
  }
}
