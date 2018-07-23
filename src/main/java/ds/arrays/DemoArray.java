package ds.arrays;

/** Created by HARISH on 23- 07- 2018 */
public class DemoArray {

  public static void main(String[] args) {
    int[][] A = {{1, 1, 1, 0}, {1, 0, 1, 0}, {1, 0, 1, 1}, {1, 1, 0, 1}};
    int[][] sol = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
    SolveRatMaze.solve(A, 4, 0, 0, sol);
  }
}
