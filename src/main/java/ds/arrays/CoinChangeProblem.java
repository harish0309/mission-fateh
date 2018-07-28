package ds.arrays;

/** Created by HARISH on 27- 07- 2018 */
public class CoinChangeProblem {
  public static void main(String[] args) {
    CoinChangeProblem problem = new CoinChangeProblem();
    int[] coins = {1, 4, 6, 8};
    int MAX = 11;

    problem.solve(coins, MAX);
  }

  public void solve(int[] coins, int max) {
    int[] A = new int[max + 1];
    A[0] = 0;
    int[] R = new int[max + 1];
    R[0] = 0;
    for (int i = 1; i <= max; i++) {
      A[i] = Integer.MAX_VALUE - 1;
      R[i] = -1;
    }
    for (int j = 0; j < coins.length; j++) {
      for (int i = 1; i <= max; i++) {
        if (i >= coins[j]) {
          if (A[i - coins[j]] + 1 < A[i]) {
            A[i] = A[i - coins[j]] + 1;
            R[i] = j;
          }
        }
      }
    }
  }
}
