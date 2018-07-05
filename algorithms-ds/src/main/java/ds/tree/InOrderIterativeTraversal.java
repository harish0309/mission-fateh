package ds.tree;

import java.util.Stack;

/**
 * Created by HARISH on 25- 04- 2018
 */
public class InOrderIterativeTraversal {

    public static void inOrder(BST.Node root) {
        Stack<BST.Node> stack = new Stack<>();
        while (true) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                if (stack.isEmpty()) break;
                BST.Node n = stack.pop();
                System.out.print(" " + n.data);
                root = n.right;
            }
        }
    }
}
