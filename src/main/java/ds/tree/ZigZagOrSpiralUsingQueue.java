package ds.tree;

import java.util.ArrayDeque;
import java.util.Deque;

/** Created by HARISH on 12- 05- 2018 */
public class ZigZagOrSpiralUsingQueue {

  public static void printSpiral(BST.Node root) {
    if (root == null) return;
    BST.Node node = new BST.Node();
    node.data = 99999;
    Deque<BST.Node> deque = new ArrayDeque();
    deque.addFirst(root);
    deque.offer(node);

    while (deque.size() > 1) {

      root = deque.peekFirst();
      while (root.data != 99999) {
        root = deque.pollFirst();
        System.out.println(root.data);
        if (root.left != null) {
          deque.offerLast(root.left);
        }
        if (root.right != null) {
          deque.offerLast(root.right);
        }
        root = deque.peekFirst();
      }

      root = deque.peekLast();
      while (root.data != 99999) {
        root = deque.pollLast();
        System.out.println(root.data);
        if (root.right != null) {
          deque.offerFirst(root.right);
        }
        if (root.left != null) {
          deque.offerFirst(root.left);
        }
        root = deque.peekLast();
      }
    }
  }
}
