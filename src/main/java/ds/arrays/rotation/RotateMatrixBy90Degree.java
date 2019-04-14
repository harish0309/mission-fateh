package ds.arrays.rotation;

/**
 * Created by HARISH on 19- 09- 2018
 *
 * <p>rotate counter clock wise
 */
// input
// 1 2 3 4
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16

// output
// 4 8 12 16
// 3 7 11 15
// 2 6 10 14
// 1 5 9 13
public class RotateMatrixBy90Degree {

  public static void main(String[] args) {

    int a[][] = {{1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}};
    RotateMatrixBy90Degree matrix = new RotateMatrixBy90Degree();
    int[][] ans = matrix.rotate(a, 4, 4);
    for (int r = 0; r < 4; r++) {
      for (int c = 0; c < 4; c++) {
        System.out.print(ans[r][c] + " ");
      }
      System.out.println();
    }
  }

  // copy top row of the auxiliary array with right most column
  // copy 2nd row of the auxiliary array with 2nd right most column... and so on
  public int[][] rotate(int[][] S, int m, int n) {
    int[][] A = new int[m][n];
    for (int r = 0; r < m; r++) {
      for (int c = 0; c < n; c++) {
        A[r][c] = S[c][m - r - 1];
      }
    }
    return A;
  }
}
