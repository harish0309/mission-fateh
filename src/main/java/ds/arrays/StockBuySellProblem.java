package ds.arrays;

/** Created by HARISH on 14- 05- 2020 */
public class StockBuySellProblem {

  public static void main(String[] args) {

    int[] A = {100, 180, 260, 310, 40, 535, 695};
    // {23, 13, 25, 29, 19, 34, 45, 65};
    int b = 0;

    for (int i = 1; i < A.length; i++) {
      if (A[i] < A[i - 1] || (i == A.length - 1 && A[b] < A[i])) {
        if (A[b] != A[i - 1]) {
          int s = A.length - 1 == i ? i : i - 1;
          System.out.printf("(%d, %d)", b, s);
        }
        b = i;
      }
    }
  }
}
