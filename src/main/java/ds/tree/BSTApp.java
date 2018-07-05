package ds.tree;

/**
 * Created by HARISH on 12- 04- 2018
 */
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
        //bst.printLeftSideViewOfTree();
        //System.out.println(SizeOfTree.size(bst.getRoot()));
        //ZigZagTree.printZigZag(bst.getRoot());
        //InOrderIterativeTraversal.inOrder(bst.getRoot());
       // ReverseLevelOrderTraversal.reverseLevel(bst.getRoot());
        System.out.println(LargestBST.largestBST(bst.getRoot()));
    }
}
