package ds.tree;

/** Created by HARISH on 12- 04- 2018 */
public class BSTApp {
  public static void main(String[] args) throws Exception {
    BST bst = new BST();
    //        bst.add(18);
    //        bst.add(15);
    //        bst.add(17);
    //        bst.add(9);
    //        bst.add(10);
    //        bst.add(20);
    //  bst.levelOrderTraversal();
    //  System.out.println();
    //  bst.preOrderTraversal();
    // System.out.println();
    //  bst.inOrderTraversal();
    // System.out.println();
    // bst.postOrderTraversal();
    bst.add(20);
    bst.add(10);
    bst.add(30);
    bst.add(25);
    bst.add(40);
    bst.add(15);
    bst.add(5);
    bst.add(18);
    bst.add(19);
    bst.add(17);

    System.out.println("Check for BST ? " + IsBinarySearchTree.isBST(bst.getRoot(), -99999, 99999));
  }
}
