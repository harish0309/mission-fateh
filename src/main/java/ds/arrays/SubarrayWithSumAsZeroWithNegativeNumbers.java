package ds.arrays;

import java.util.HashMap;

/** Created by HARISH on 19- 05- 2020 */
public class SubarrayWithSumAsZeroWithNegativeNumbers {

  public static void main(String[] args) {

    int[] A = {6, 7, -1, 3, 1, -3, -2, 0, 2, 4};
    int maxLength = -1;
    int s = 0;
    int e = 0;
    int currSum = 0;
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < A.length; i++) {

      currSum += A[i];

      if (currSum == 0) {
        s = 0;
        e = i;
      } else if (map.containsKey(currSum)) {
        s = map.get(currSum) + 1;
        e = i;
      }
      if (maxLength < e - s) {
        maxLength = e - s + 1;
      }

      map.put(currSum, i);
    }

    System.out.println(maxLength);
  }
}
