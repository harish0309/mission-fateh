package ds.arrays;

/** Created by HARISH on 16- 03- 2019 */
public class PrintAllPermutationOfString {

  public static void main(String[] args) {
    String str = "HARISH";
    int n = str.length();
    PrintAllPermutationOfString permutation = new PrintAllPermutationOfString();
    permutation.permute(str, 0, n - 1);
  }

  private void permute(String str, int leftIdx, int rightIdx) {
    if (leftIdx == rightIdx) System.out.println(str);
    else {
      for (int i = leftIdx; i <= rightIdx; i++) {
        str = swap(str, leftIdx, i);
        permute(str, leftIdx + 1, rightIdx);
        str = swap(str, leftIdx, i);
      }
    }
  }

  public String swap(String a, int i, int j) {
    char temp;
    char[] charArray = a.toCharArray();
    temp = charArray[i];
    charArray[i] = charArray[j];
    charArray[j] = temp;
    return String.valueOf(charArray);
  }
}
