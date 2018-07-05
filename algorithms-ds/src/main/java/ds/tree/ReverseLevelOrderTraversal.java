package ds.tree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by HARISH on 25- 04- 2018
 */
public class ReverseLevelOrderTraversal {

    public static void reverseLevel(BST.Node root) {
        Queue<BST.Node> q = new ArrayDeque<>();
        Stack<BST.Node> s = new Stack<>();
        q.add(root);
        while (!q.isEmpty()) {
            BST.Node n = q.poll();
            if (n.right != null) q.add(n.right);
            if (n.left != null) q.add(n.left);
            s.push(n);
        }

        while (!s.isEmpty()) {
            System.out.print(" " + s.pop().data);
        }
    }
}
