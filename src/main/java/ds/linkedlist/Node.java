package ds.linkedlist;

/** Created by HARISH on 07- 03- 2019 */
public class Node<T> {
  private T data;
  private Node<T> next;

  public Node(T data) {
    this.data = data;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public Node<T> getNext() {
    return next;
  }

  public void setNext(Node<T> next) {
    this.next = next;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Node<?> node = (Node<?>) o;

    if (data != null ? !data.equals(node.data) : node.data != null) return false;
    return next != null ? next.equals(node.next) : node.next == null;
  }

  @Override
  public int hashCode() {
    int result = data != null ? data.hashCode() : 0;
    result = 31 * result + (next != null ? next.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Node{" + "data=" + data + '}';
  }
}
