package ds.tree;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by HARISH on 12- 05- 2018
 */
public class ZigZagOrSpiralUsingQueue {

    public static void printSpiral(BST.Node root) {
        if (root == null) return;
        BST.Node node = new BST.Node();
        node.data = 99999;
        Deque<BST.Node> deque = new ArrayDeque();
        deque.offer(null);
        deque.addFirst(root);

        BST.Node curr = null;
        while (deque.size() > 1) {

        }

    }

}
