package ds.tree;

import ds.tree.BST.Node;

import java.util.Stack;

/** Created by HARISH on 19- 05- 2020 */
public class ConvertBinaryTreeToInorderDoublyLL {

  public static void main(String[] args) {

    BST bst = new BST();
    bst.add(10);
    bst.add(5);
    bst.add(20);
    bst.add(3);
    bst.add(8);
    bst.add(9);
    bst.add(15);
    bst.add(30);

    // Expected Output (Inorder Doubly Linked List)
    // = 3 = 5 = 8 = 10 = 15 = 20 = 30 =

    Node root = bst.getRoot();
    Node head = null;
    Node prev = null;
    Stack<Node> s = new Stack<>();

    while (true) {
      if (root != null) {
        s.push(root);
        root = root.left;
      } else {
        if (s.isEmpty()) break;
        Node n = s.pop();
        if (head == null) {
          head = n;
        }
        if (prev != null) {
          prev.right = n;
        }
        n.left = prev;
        prev = n;
        root = n.right;
      }
    }

    head.left = prev;
    prev.right = head;
  }
}
