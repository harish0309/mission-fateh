package ds.arrays;

/** Created by HARISH on 08- 07- 2020 */
/*
 * https://practice.geeksforgeeks.org/problems/max-length-chain/1
 * */
public class MaxLengthChainProblem {

  public static void main(String[] args) {
    int[][] A = {{5, 24}, {15, 28}, {27, 40}, {34, 60}, {50, 90}};
    int[] output = {1, 1, 1, 1, 1};
    for (int i = 1; i < 5; i++) {
      for (int j = 0; j < i; j++) {
        if (A[j][1] < A[i][0] && output[i] < output[j] + 1) {
          output[i] = output[j] + 1;
        }
      }
    }
  }
}
