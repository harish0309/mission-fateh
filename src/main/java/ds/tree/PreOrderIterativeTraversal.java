package ds.tree;

import java.util.Stack;

/**
 * Created by HARISH on 24- 04- 2018
 */
public class PreOrderIterativeTraversal {

    public static void preOrder(BST.Node root) {
        Stack<BST.Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            BST.Node n = stack.pop();
            System.out.print(" "+n.data);
            if (n.right != null) stack.push(n.right);
            if (n.left != null) stack.push(n.left);
        }

    }

}
