package ds.tree;

/**
 * Created by HARISH on 13- 04- 2020
 */
public class LeafToLeafMaximumSumInBinaryTree {


    public static void main(String[] args) {
        BST bst = new BST();
        bst.add(10);
        bst.add(-5);
        bst.add(110);
        bst.add(20);
        bst.add(-2);
        bst.add(-10);
        bst.add(30);
        bst.add(40);
        bst.add(25);

        BST.Node result = new BST.Node(Integer.MIN_VALUE);

        findSum(bst.getRoot(), result);
        System.out.println(result.data);


    }

    private static int findSum(BST.Node root, BST.Node max) {
        if (root == null) {
            return 0;
        }

        int left = findSum(root.left, max);
        int right = findSum(root.right, max);

        if (max.data < root.data + left + right) {
            max.data = root.data + left + right;
        }

        return Math.max(left, right) + root.data;


    }


}
