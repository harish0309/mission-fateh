package ds.tree;

/**
 * Created by HARISH on 19- 04- 2018
 */
public class SizeOfTree {

    public static int size(BST.Node node) {
        if (node == null) {
            return 0;
        }

        int leftSize = size(node.left);
        int rightSize = size(node.right);
        return 1 + leftSize + rightSize;

    }

}
