package ds.tree;

import ds.linkedlist.HGLinkedList;
import ds.linkedlist.Node;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/** Created by HARISH on 14- 05- 2020 */
public class CreateBinaryTreeFromLinkedList {

  private static HGLinkedList<Integer> list1 = new HGLinkedList<>();

  public static void main(String[] args) {
    list1.insert(1);
    list1.insert(2);
    list1.insert(3);
    list1.insert(4);
    list1.insert(5);
    list1.insert(6);
    list1.insert(7);

    Queue<BST.Node> q = new LinkedBlockingQueue<>();
    Node<Integer> curr = list1.getHead();
    BST.Node rootNode = new BST.Node(curr.getData());
    q.offer(rootNode);

    while (!q.isEmpty()) {
      BST.Node root = q.poll();
      Node<Integer> next = curr.getNext();
      if (next != null) {
        root.left = new BST.Node(next.getData());
        q.offer(root.left);
      }
      if (next != null && next.getNext() != null) {
        root.right = new BST.Node(next.getNext().getData());
        q.offer(root.right);
      }
      if (next == null || next.getNext() == null) {
        break;
      }
      curr = next.getNext();
    }

    System.out.println(rootNode.data);
  }
}
