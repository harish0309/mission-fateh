package ds.string;

import java.util.ArrayDeque;
import java.util.Deque;

/** Created by HARISH on 14- 04- 2019 */
public class RemoveAllDuplicatesInString {

  public static void main(String[] args) {
    String s = "geeksforgeek";
    int n = s.length();
    boolean containsDuplicate = false;
    Deque<Character> deque = new ArrayDeque<>();
    deque.push(s.charAt(0));

    for(int i=1;i<n; i++){
        if (deque.peekFirst() == s.charAt(i)){
            containsDuplicate = true;
        }else {
            if (containsDuplicate){
                deque.pollFirst();
            }
            deque.push(s.charAt(i));
            containsDuplicate =false;
        }
    }
    if (containsDuplicate){
        deque.pollFirst();
    }

    while (!deque.isEmpty()){
        System.out.print(deque.pollLast());
    }

  }
}
