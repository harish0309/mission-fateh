package ds.tree;

import java.util.List;

/** Created by HARISH on 07- 07- 2018 */
public class SumRootToLeaf {

  public static boolean sumRootToLeaf(BST.Node root, int sum, List<BST.Node> results) {
    if (root == null) {
      return false;
    }
    // if root is leaf node
    if (root.left == null && root.right == null) {
      if (root.data == sum) {
        results.add(root);
        return true;
      } else return false;
    }
    // check for sum on left side of node
    if (sumRootToLeaf(root.left, sum - root.data, results)) {
      results.add(root);
      return true;
    }
    // check for sum on right side of node
    if (sumRootToLeaf(root.right, sum - root.data, results)) {
      results.add(root);
      return true;
    }
    return false;
  }
}
