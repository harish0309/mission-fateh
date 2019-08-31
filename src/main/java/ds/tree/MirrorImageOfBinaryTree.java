package ds.tree;

/**
 * Created by HARISH on 31- 08- 2019
 */
public class MirrorImageOfBinaryTree {

    public static void main(String[] args) {
        BST bst = new BST();
        bst.add(20);
        bst.add(10);
        bst.add(30);
        bst.add(25);
        bst.add(40);
        bst.add(15);
        bst.add(5);
        bst.add(18);
        bst.add(19);
        bst.add(17);
        BST.Node mirrorRoot = createMirror(bst.getRoot());
        System.out.println(mirrorRoot);
    }

    public static BST.Node createMirror(BST.Node root) {

        if (root == null) {
            return null;
        }
        BST.Node root2 = new BST.Node(root.data);

        root2.right = createMirror(root.left);
        root2.left = createMirror(root.right);
        return root2;
    }
}
