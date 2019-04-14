package ds.string;

import java.util.Stack;

/** Created by HARISH on 13- 04- 2019 */
public class ReverseWordsInString {

  public static void main(String[] args) {
    String input = "i.love.this.program.very.much"; //
    String output = reverse(input);
    System.out.println("Original String ::  " + input);
    System.out.println("Reversed String ::  " + output);
  }

  private static String reverse(String str) {

    StringBuilder sb = new StringBuilder();
    int n = str.length();
    Stack<Character> st = new Stack<>();

    for (int i = n - 1; i >= 0; i--) {
      if (str.charAt(i) != '.') {
        st.push(str.charAt(i));
        if (i != 0) {
          continue;
        }
      }
      while (!st.isEmpty()) {
        sb.append(st.pop());
      }
      if (i != 0) {
        sb.append('.');
      }
    }

    return sb.toString();
  }
}
