package ds.arrays;

/** Created by HARISH on 14- 07- 2020
 *
 *https://www.geeksforgeeks.org/policemen-catch-thieves/
 * */
public class PolicemenCatchThiefProblem {

  public static void main(String[] args) {
    //

    String[] A = {"P", "T", "T", "P", "T"};
    int[] S = new int[A.length];
    int count = 0;
    int k = 1;

    for (int i = 0; i < A.length; i++) {
      boolean isMarked = false;
      // left side
      if (A[i].equals("P")) {

        int c = i - k < 0 ? 0 : i - k;
        while (c < i) {
          if (A[c].equals("T") && S[c] != 1) {
            S[c] = 1;
            count++;
            isMarked = true;
            break;
          }
          c++;
        }

        // right side
        if (!isMarked) {
          int d = i + k >= A.length ? A.length : i + k;
          while (d > i) {
            if (A[d].equals("T") && S[d] != 1) {
              S[d] = 1;
              count++;
              break;
            }
            d--;
          }
        }
      }
    }

    System.out.println(count);
  }
}
