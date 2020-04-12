package ds.tree;

/**
 * Created by HARISH on 12- 04- 2020
 */
public class DiameterOfBinaryTree {

    public static void main(String[] args) {
        BST bst = new BST();
        bst.add(10);
        bst.add(5);
        bst.add(20);
        bst.add(2);
        bst.add(8);
        bst.add(9);
        bst.add(30);
        bst.add(40);
        bst.add(25);

        int diameter = diameter(bst.getRoot());
        System.out.println(diameter);
    }

    private static int diameter(BST.Node root) {

        if (root == null) {
            return 0;
        }
        int hl = height(root.left);
        int hr = height(root.right);
        int dl = diameter(root.left);
        int dr = diameter(root.right);

        int diameter = Math.max(1 + hr + hl, Math.max(dl, dr));
        return diameter;
    }

    private static int height(BST.Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }
}
