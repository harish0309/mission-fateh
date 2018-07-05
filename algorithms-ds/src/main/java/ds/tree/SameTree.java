package ds.tree;

/**
 * Created by HARISH on 19- 04- 2018
 */
public class SameTree {

    public boolean sameTree(BST.Node node1, BST.Node node2) {
        if (node1 == null && node2 == null) {
            return true;
        }

        if (node1 == null || node2 == null) {
            return false;
        }

        return node1.data == node2.data && sameTree(node1.left, node2.left)
                && sameTree(node1.right, node2.right);
    }
}
