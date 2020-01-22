package ds.arrays;

import ds.sorting.BubbleSort;

/** Created by HARISH on 16- 03- 2019 */
public class FindWordRankInDictionary {

  boolean isFound = false;
  int rank = 0;
  String word = "STANDUPCOM";

  public static void main(String[] args) {
    String str = "CORN";
    int n = str.length();
    FindWordRankInDictionary permutation = new FindWordRankInDictionary();
    String sortedStr = permutation.sort(str);
    permutation.permute(sortedStr, 0, n - 1);
    System.out.println(
        "Rank of word {" + permutation.word + "} in dictionary is {" + permutation.rank + "}");
  }

  private void permute(String str, int l, int r) {
    if (l == r) {
      rank++;
      if (str.equals(word)) {
        isFound = true;
      }
      System.out.println(str);
    } else {
      for (int i = l; i <= r; i++) {
        if (isFound) {
          break;
        }
        str = swap(str, l, i);
        permute(str, l + 1, r);
        str = swap(str, l, i);
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

  public String sort(String a) {
    char[] charArray = a.toCharArray();
    int[] intArray = new int[charArray.length];
    for (int i = 0; i < charArray.length; i++) {
      intArray[i] = charArray[i];
    }
    intArray = BubbleSort.sort(intArray, charArray.length);
    for (int i = 0; i < intArray.length; i++) {
      charArray[i] = (char) intArray[i];
    }
    return String.valueOf(charArray);
  }
}
