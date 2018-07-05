package ds.tree;

import java.util.Stack;

/**
 *  5 17 19 18 15 10 25 40 30 20
 * Created by HARISH on 24- 04- 2018
 */
public class PostOrderIterativeTraversal {

    public static void postOrder(BST.Node root) {
        Stack<BST.Node> stack1 = new Stack<>();
        Stack<BST.Node> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()) {
            BST.Node n = stack1.pop();
            stack2.push(n);
            if (n.left != null) stack1.push(n.left);
            if (n.right != null) stack1.push(n.right);
        }

        while (!stack2.isEmpty()){
            System.out.print(" "+stack2.pop().data);
        }

    }

}
