package ds.tree;

import ds.tree.BST.Node;

/**
 * Created by HARISH on 13- 04- 2020
 */


/*
 * A Binary tree is complete binary tree when:
 *
 * 1. All the levels are completely filled except the last level
 *
 * 2. Even in the last level, it should have filled from Left to Right
 *
 * Approach:
 *
 * 1. Count the number of node in the given binary tree (size of tree)
 *
 * 2. Now since using formula 2i+1 and 2i+2 we can create a complete binary tree.
 *
 *
 *
 * *
 * */
public class CompleteBinaryTreeCheck {

    static int size = 0;

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

        size = sizeOfTree(bst.getRoot());
        if (checkForComplete(bst.getRoot(), 0)) {
            System.out.println("It is Complete Binary Tree");
        } else {
            System.out.println("It is NOT Complete Binary Tree");
        }
    }

    private static boolean checkForComplete(Node root, int idx) {

        if (root == null) {
            return true;
        }

        if (idx >= size) {
            return false;
        }

        return checkForComplete(root.left, 2 * idx + 1) &&
                checkForComplete(root.right, 2 * idx + 2);


    }


    private static int sizeOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + sizeOfTree(root.left) + sizeOfTree(root.right);
    }


}
