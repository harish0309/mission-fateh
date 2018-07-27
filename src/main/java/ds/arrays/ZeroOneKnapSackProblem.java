package ds.arrays;

import java.util.ArrayList;
import java.util.List;

/** Created by HARISH on 25- 07- 2018 */
public class ZeroOneKnapSackProblem {

  public static void main(String[] args) {
    ZeroOneKnapSackProblem prb = new ZeroOneKnapSackProblem();
    prb.solve();
  }
  //        0 0 0 0 0 0 0 0
  //        0 1 1 1 1 1 1 1
  //        0 1 1 4 5 5 5 5
  //        0 1 1 4 5 6 6 9
  //        0 1 1 4 5 7 8 9
  private void solve() {
    int MAX = 7; // total maximum weight allowed
    int[] WT = {1, 3, 4, 5}; // all given weights
    int[] VAL = {1, 4, 5, 7}; // all given values to their respective weights
    int[][] SOL = new int[WT.length + 1][MAX + 1]; // solution matrix

    for (int i = 0; i <= VAL.length; i++) { //
      for (int j = 0; j <= MAX; j++) {
        if (i == 0 || j == 0) {
          SOL[i][j] = 0;
          // keeping the first row and column of the solution matrix as 0, to depict the
          // scenario when maximum allowed weight is 0
          continue;
        }
        if (j - WT[i - 1] >= 0) {
          SOL[i][j] = Math.max(SOL[i - 1][j], SOL[i - 1][j - WT[i - 1]] + VAL[i - 1]);
          // Taking maximum of
          // Case 1 when the current weight is included then take the value of current weight and
          // subtract this weight from the MAX, and now take the maximum value of the left over
          // weight from the previous row on solution matrix. ----> SOL[i - 1][j - WT[i - 1]] +
          // VAL[i - 1]
          // Case 2 When the current weight is excluded then take the maximum value for this MAX
          // from the solution matrix. ----> SOL[i - 1][j]

        } else {
          SOL[i][j] = SOL[i - 1][j];
        }
      }
    }
    for (int i = 0; i <= VAL.length; i++) {
      for (int j = 0; j <= MAX; j++) {
        System.out.print(SOL[i][j] + " ");
      }
      System.out.println(" ");
    }

    int r = VAL.length;
    int c = MAX;
    int TW = MAX;
    List<Integer> finalList = new ArrayList<>();

    while (TW > 0) {
      if (SOL[r][c] == SOL[r - 1][c]) {
        r--;
        continue;
      } else {
        finalList.add(WT[r - 1]);
        TW = TW - WT[r - 1];
        c = c - (TW + 1);
      }
    }
    finalList.forEach(System.out::println);
  }
}
