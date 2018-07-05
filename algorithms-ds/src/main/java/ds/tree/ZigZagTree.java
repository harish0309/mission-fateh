package ds.tree;

import java.util.Stack;

/**
 * Created by HARISH on 19- 04- 2018
 */
public class ZigZagTree {

    public static void printZigZag(BST.Node root) {
        Stack<BST.Node> currentLevel = new Stack<>();
        Stack<BST.Node> nextLevel = new Stack<>();
        currentLevel.push(root);
        boolean leftToRight = true;

        while (!currentLevel.isEmpty()) {
            BST.Node node = currentLevel.pop();
            System.out.print(" " + node.data);

            if (leftToRight ) {
                if (node.right != null)
                nextLevel.push(node.right);

                if (node.left != null)
                nextLevel.push(node.left);
            } else {

                if (node.left != null)
                nextLevel.push(node.left);

                if (node.right != null)
                nextLevel.push(node.right);
            }

            if (currentLevel.isEmpty()) {
                System.out.println();
                leftToRight = !leftToRight;
                Stack<BST.Node> temp = currentLevel;
                currentLevel = nextLevel;
                nextLevel = temp;
            }
        }


    }

}
