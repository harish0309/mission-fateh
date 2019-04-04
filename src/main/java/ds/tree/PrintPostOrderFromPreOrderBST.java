package ds.tree;

import java.util.Arrays;

/** Created by HARISH on 04- 04- 2019 */
public class PrintPostOrderFromPreOrderBST {

  public static void main(String ars[]) {

    int pre[] = {40, 30, 32, 35, 80, 90, 100, 120};
    int len = pre.length;
    PrintPostOrderFromPreOrderBST tree = new PrintPostOrderFromPreOrderBST();
    tree.printPost(pre, 0, len - 1);
  }

  private void printPost(int[] pre, int start, int end) {
    if (start > end) return;

    // Find index of next item in preorder traversal in
    // inorder.
    int maxIdx = findFirstMaxIndex(pre, start, end, pre[0]);

    if (maxIdx > 0) {
      // traverse left tree
      int[] left = Arrays.copyOfRange(pre, start + 1, maxIdx);
      printPost(left, 0, left.length - 1);

      // traverse right tree
      int[] right = Arrays.copyOfRange(pre, maxIdx, end + 1);
      printPost(right, 0, right.length - 1);
    }

    // print root node at the end of traversal
    System.out.print(pre[0] + " ");
  }

  int findFirstMaxIndex(int[] pre, int start, int end, int data) {
    int i = 0;
    for (i = start; i < end; i++) if (pre[i] > data) return i;
    return i;
  }
}
