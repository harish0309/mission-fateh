package ds.tree;

/** Created by HARISH on 10- 07- 2018 */
public class IsBinarySearchTree {

  public static boolean isBST(BST.Node root, int min, int max) {
    if (root == null) {
      return true;
    }
    return (root.data >= min && root.data < max)
        && isBST(root.left, min, root.data)
        && isBST(root.right, root.data, max);
  }
}
