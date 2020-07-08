package ds.arrays;

/** Created by HARISH on 08- 07- 2020 */

/** https://practice.geeksforgeeks.org/problems/find-optimum-operation/0 */
public class MinimumOperationToReachANumber {

  public static void main(String[] args) {
    int N = 11;
    int A[] = new int[N + 1];
    A[0] = 0;
    A[1] = 1;
    int noOfOperations = 0;
    for (int i = 2; i <= N; i++) {
      if (i % 2 == 0) {
        noOfOperations = Math.min(A[i - 1] + 1, A[(i / 2)] + 1);
      } else {
        noOfOperations = A[i - 1] + 1;
      }
      A[i] = noOfOperations;
    }
    System.out.printf("Minimum %s operations are required to reach number %s ", noOfOperations, N);
  }
}
