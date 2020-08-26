package ds.tree;

import ds.tree.BST.Node;

/** Created by HARISH on 27- 08- 2020 */
public class DeleteNodeFromBST {

  public static void main(String[] args) {
    BST bst = new BST();
    bst.add(10);
    bst.add(5);
    bst.add(8);
    bst.add(3);
    bst.add(4);
    bst.add(15);
    bst.add(12);
    bst.add(30);
    bst.add(14);
    bst.add(20);

    Node root = delete(bst.getRoot(), 4);
    System.out.println(root);
  }

  private static Node delete(Node root, int data) {
    if (root == null) {
      return root;
    }

    if (data < root.data) {
      root.left = delete(root.left, data);
    } else if (data > root.data) {
      root.right = delete(root.right, data);
    } else {
      // if root has one child or no child
      if (root.left == null) {
        return root.right;
      } else if (root.right == null) {
        return root.left;
      }

      // if root has two child
      // go to minimum value node from the right child of the root

      root.data = minValue(root.right);

      root.right = delete(root.right, root.data);
    }

    return root;
  }

  private static int minValue(Node min) {
    while (min.left != null) {
      min = min.left;
    }
    return min.data;
  }
}
