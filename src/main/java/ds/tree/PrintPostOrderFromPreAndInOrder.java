package ds.tree;

/** Created by HARISH on 04- 04- 2019 */
public class PrintPostOrderFromPreAndInOrder {

  static int preIndex = 0;

  // Driver code
  public static void main(String ars[]) {
    int in[] = {4, 2, 5, 1, 3, 6};
    int pre[] = {1, 2, 4, 5, 3, 6};
    int len = in.length;
    PrintPostOrderFromPreAndInOrder tree = new PrintPostOrderFromPreAndInOrder();
    tree.printPost(in, pre, 0, len - 1);
  }

  void printPost(int[] in, int[] pre, int inStrt, int inEnd) {
    if (inStrt > inEnd) return;

    // Find index of next item in preorder traversal in
    // inorder.
    int inIndex = search(in, inStrt, inEnd, pre[preIndex++]);

    // traverse left tree
    printPost(in, pre, inStrt, inIndex - 1);

    // traverse right tree
    printPost(in, pre, inIndex + 1, inEnd);

    // print root node at the end of traversal
    System.out.print(in[inIndex] + " ");
  }

  int search(int[] in, int startIn, int endIn, int data) {
    int i = 0;
    for (i = startIn; i < endIn; i++) if (in[i] == data) return i;
    return i;
  }
}
