package ds.tree;

/**
 * Created by HARISH on 22- 05- 2018
 */
public class LargestBST {


    public static int largestBST(BST.Node root) {
        MinMax m = largest(root);
        return m.size;
    }

    private static MinMax largest(BST.Node root) {
        if (root == null) return new MinMax();

        MinMax left = largest(root.left);
        MinMax right = largest(root.right);

        MinMax m = new MinMax();
        if (left.isBST == false || right.isBST == false || (left.max > root.data || right.min <= root.data)) {
            m.isBST = false;
            m.size = Math.max(left.size, right.size);
            return m;
        }
        m.isBST = true;
        m.size = left.size + right.size + 1;
        m.min = root.left != null ? left.min : root.data;
        m.max = root.right != null ? right.max : root.data;
        return m;
    }


    public final static class MinMax {
        int min;
        int max;
        boolean isBST;
        int size;

        MinMax() {
            this.min = Integer.MAX_VALUE;
            this.max = Integer.MIN_VALUE;
            isBST = true;
            size = 0;
        }

    }
}
