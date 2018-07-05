package ds.tree;

/**
 * Created by HARISH on 11- 04- 2018
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Binary Search Tree
 */
public class BST {
    private Node root = null;

    public Node getRoot() {
        return root;
    }

    private int size = 0;
    private BlockingQueue<Node> queue = null;

    public Node add(int val) {
        if (root == null) {
            root = createNewNode(val);
            return root;
        } else {
            return insert(root, val);
        }
    }

    /**
     * @param node
     * @param val
     * @return
     */
    private Node insert(Node node, int val) {
        if (node == null) {
            return createNewNode(val);
        }

        if (val < node.data) {
            node.left = insert(node.left, val);
        } else if (val > node.data) {
            node.right = insert(node.right, val);
        }
        return node;
    }

    private Node createNewNode(int val) {
        Node node = new Node();
        node.data = val;
        node.left = null;
        node.right = null;
        size++;
        return node;
    }

    public void levelOrderTraversal() {
        queue = new ArrayBlockingQueue<Node>(size);
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.print(node.data + " ");
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
    }

    public void printLeftSideViewOfTree() {

        queue = new ArrayBlockingQueue<Node>(size);
        Node node = new Node();
        node.data = 99;
        queue.add(node);
        queue.add(root);
        while (!queue.isEmpty()) {
            Node n = queue.peek();

            if (n.data == 99) {
                queue.poll();
                n = queue.poll();
                if (n == null) {
                    break;
                }
                System.out.print(" " + n.data);
                Node dmltr = new Node();
                dmltr.data = 99;
                queue.add(dmltr);
            } else {
                n = queue.poll();
            }
            if (n.left != null) queue.add(n.left);
            if (n.right != null) queue.add(n.right);
            // if (n.left != null) queue.add(n.left);
        }

    }


    public void preOrderTraversal() {
        preOrder(root);
    }

    public void preOrderTraversalWithOutRecursion() {
        Node current = root;
        Stack<Node> stack = new Stack<>();
        while (current != null) {
            System.out.print(" " + current.data);
            stack.push(current);
            current = current.left;
        }

        while (stack.size() > 0) {
            Node n = stack.pop();
            if (n.right != null) {
                System.out.print(" " + n.right.data);
                stack.push(n.right);
                current = n.right.left;
                while (current != null) {
                    System.out.print(" " + current.data);
                    stack.push(current);
                    current = current.left;
                }
            }
        }
    }

    public void inOrderTraversalWithRecursion() {
        inOrder(root);
    }

    public void inOrderTraversalWithoutRecursion() {
        Node current = root;
        Stack<Node> stack = new Stack<>();

        while (current != null) {
            stack.push(current);
            current = current.left;
        }

        while (stack.size() > 0) {
            Node node = stack.pop();
            System.out.print(node.data + " ");
            if (node.right != null) {
                current = node.right;
                while (current != null) {
                    stack.push(current);
                    current = current.left;
                }
            }
        }
    }

    public void postOrderTraversal() {
        postOrder(root);
    }

    public void postOrderTraversalWithoutRecursion() {
        Node current = root;
        Stack<Node> stack = new Stack<>();
        List<Node> list = new ArrayList<>();
        while (current != null) {
            stack.push(current);
            current = current.left;
        }

        while (stack.size() > 0) {
            Node n = stack.peek();
            if(list.contains(n)){
                System.out.print(" "+n.data);
                stack.pop();
                continue;
            }
            if (n.right != null) {
                list.add(n);
                stack.push(n.right);
                current = n.right.left;
                while (current != null) {
                    stack.push(current);
                    current = current.left;
                }
            }else{
                System.out.print(" "+n.data);
                stack.pop();
            }
        }

    }

    /**
     * @param node
     */
    private void preOrder(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    private void inOrder(Node node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    private void postOrder(Node node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }


    public final static class Node {
        int data;
        Node left;
        Node right;

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
}
