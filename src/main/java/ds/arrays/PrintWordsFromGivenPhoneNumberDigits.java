package ds.arrays;

/** Created by HARISH on 23- 10- 2020
 * https://www.geeksforgeeks.org/find-possible-words-phone-digits/
 * Amazon
 * */
public class PrintWordsFromGivenPhoneNumberDigits {

  public static void main(String[] args) {
    //
    int[] num = {2, 3, 4};
    String[] phone = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    char[] cr = new char[num.length];
    printNumber(num, 0, phone, cr);
  }

  private static void printNumber(int[] num, int nidx, String[] phone, char[] cr) {

    if (nidx == num.length) {
      System.out.println(String.valueOf(cr));
      return;
    }

    String str = phone[num[nidx]];
    for (int i = 0; i < str.length(); i++) {
      cr[nidx] = str.charAt(i);
      printNumber(num, nidx + 1, phone, cr);
    }
  }
}
