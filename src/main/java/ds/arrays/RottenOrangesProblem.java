package ds.arrays;

import java.util.HashSet;

/** Created by HARISH on 10- 07- 2020
 *
 * https://practice.geeksforgeeks.org/problems/rotten-oranges/0
 *
 * */
public class RottenOrangesProblem {

  public static void main(String[] args) {

    int[][] M = {{2, 1, 0, 2, 1}, {1, 0, 1, 2, 1}, {1, 0, 0, 2, 1}};
    int nR = 3;
    int nC = 5;
    int timeUnit = 0;

    while (true) {
      HashSet<String> visited = new HashSet<>();
      for (int i = 0; i < nR; i++) {
        for (int j = 0; j < nC; j++) {
          if (M[i][j] == 2 && !visited.contains("" + i + "" + j)) {
            // top
            if (isValid(i - 1, nR, j, nC, M)) {
              int r = i - 1;
              int c = j;
              visited.add("" + r + "" + c);
              M[r][c] = 2;
            }

            // bottom
            if (isValid(i + 1, nR, j, nC, M)) {
              int r = i + 1;
              int c = j;
              visited.add("" + r + "" + c);
              M[r][c] = 2;
            }

            // left
            if (isValid(i, nR, j - 1, nC, M)) {
              int r = i;
              int c = j - 1;
              visited.add("" + r + "" + c);
              M[r][c] = 2;
            }

            // right
            if (isValid(i, nR, j + 1, nC, M)) {
              int r = i;
              int c = j + 1;
              visited.add("" + r + "" + c);
              M[r][c] = 2;
            }
          }
        }
      }
      if (!visited.isEmpty()) {
        timeUnit++;
      } else {
        break;
      }
    }

    System.out.println(timeUnit);

    //
  }

  private static boolean isValid(int i, int nR, int j, int nC, int[][] m) {
    if (i < 0 || i >= nR || j < 0 || j >= nC || m[i][j] != 1) {
      return false;
    }
    return true;
  }
}
