package ds.linkedlist;

import java.util.Stack;

/**
 * Created by HARISH on 09- 03- 2019
 */
public class CheckForPalindromeInLinkedList {

    public static boolean isPalindrome(HGLinkedList<Integer> ll) {
        boolean isPalindrome = true;
        Node<Integer> sp = ll.getHead();
        Node<Integer> fp = ll.getHead();
        Stack<Node<Integer>> stack = new Stack<>();
        while (fp != null && fp.getNext() != null) {
            stack.push(sp);
            sp = sp.getNext();
            fp = fp.getNext().getNext();
        }

        if (fp != null && fp.getNext() == null) {
            sp = sp.getNext();
        }

        while (sp != null) {
            if (!sp.getData().equals(stack.pop().getData())) {
                isPalindrome = false;
                break;
            }
            sp = sp.getNext();
        }

        return isPalindrome;
    }
}
