package ds.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by HARISH on 26- 09- 2019
 */
public class FixTwoSwappedNodesInBST {

    static List<Integer> nodes = new ArrayList<>();

    static int i = 0;

    static void solve(BST.Node root) {
        inOrderTraversal(root);
        System.out.println(nodes);
        Collections.sort(nodes);
        inOrderTraversal2(root);
        System.out.println(root);
    }

    static void inOrderTraversal(BST.Node root) {

        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        nodes.add(root.data);
        inOrderTraversal(root.right);
    }

    static void inOrderTraversal2(BST.Node root) {

        if (root == null) {
            return;
        }
        inOrderTraversal2(root.left);
        root.data = nodes.get(i);
        i++;
        inOrderTraversal2(root.right);
    }
}
