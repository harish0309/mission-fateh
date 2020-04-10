package ds.arrays;

import java.util.Arrays;

/**
 * Created by HARISH on 10- 04- 2020
 */

/*
 * Given Rod of Length= 5;
 * Allowed Length L    = 1, 2, 3, 4
 * Profit Respectively = 2, 5, 7, 8
 *
 * Maximize profit
 *
 *
 * */
public class CuttingRodProblem {

    public static void main(String[] args) {

        int[] L = new int[]{1, 2, 3, 4};
        int[] P = new int[]{2, 5, 7, 8};
        int rod = 5;

        int[][] M = new int[L.length + 1][rod + 1];

        for (int i = 0; i <= rod; i++) {
            M[0][i] = 0;
        }
        for (int i = 0; i <= L.length; i++) {
            M[i][0] = 0;
        }

        for (int i = 1; i <= L.length; i++) {

            for (int j = 1; j <= rod; j++) {

                if (j < L[i-1]) {
                    M[i][j] = M[i-1][j];
                } else {
                    M[i][j] = Math.max(M[i-1][j], P[i-1]+M[i][j-L[i-1]]);
                }
            }
        }
        // System.out.println(M);


    }
}
