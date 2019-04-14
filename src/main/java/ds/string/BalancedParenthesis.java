package ds.string;

import java.util.Stack;

/** Created by HARISH on 08- 04- 2019 */
public class BalancedParenthesis {

  public static void main(String[] args) {
    String str = "(()(())(()";
    boolean balanced = checkBalanced(str);
    System.out.println(balanced);
  }

  private static boolean checkBalanced(String str) {
    Stack<Character> stack = new Stack<>();
    int size = str.length();
    for (int i = 0; i < size; i++) {
      if (str.charAt(i) == '(') {
        stack.push(str.charAt(i));
      } else {
        stack.pop();
      }
    }
    return stack.isEmpty();
  }
}
