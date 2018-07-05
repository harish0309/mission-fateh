package ds.linkedlist;

/**
 * Created by HARISH on 14- 04- 2018
 */
public class LinkedListApp {

    public static void main(String[] args) {
        SLinkedList<Integer> sLinkedList = new SLinkedList<>();
        sLinkedList.add(3);
        sLinkedList.add(4);
        sLinkedList.add(5);
        sLinkedList.add(6);
        //sLinkedList.add(7, 3);
        //sLinkedList.removeElement(5);
        //sLinkedList.removeElementAt(2);
        //sLinkedList.reverseSLinkedList();
        sLinkedList.reverseUsingRecursion();
        System.out.println(sLinkedList);
    }
}
