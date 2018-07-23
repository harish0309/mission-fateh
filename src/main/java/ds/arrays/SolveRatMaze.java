package ds.arrays;

/** Created by HARISH on 23- 07- 2018 */
public class SolveRatMaze {

  public static void solve(int M[][], int n, int x, int y, int[][] sol) {
    if (x == n - 1 && y == n - 1) { // check for end point
      sol[x][y] = 1;
      printMaze(sol, n);
      return;
    }
    if (x > n - 1 || x < 0 || y > n - 1 || y < 0 || M[x][y] == 0) {
      return; // check if position is out of range or check for valid path
    }
    sol[x][y] = 1; // mark current position as 1
    solve(M, n, x, y + 1, sol); // move right from the current position
    solve(M, n, x + 1, y, sol); // move down from the current position

    return;
  }

  private static void printMaze(int[][] sol, int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(" " + sol[i][j]);
      }
      System.out.println("");
    }
  }
}
