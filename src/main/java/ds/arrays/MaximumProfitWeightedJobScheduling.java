package ds.arrays;

/**
 * Created by HARISH on 29- 03- 2020
 */
/*
 * time:    (1,4) (2,6) (4,7) (6,8) (5,9) (7,10)
 * profit:    3     5     2     6     4     8
 * Job Name:  A     B     C     E     D     F
 * */


public class MaximumProfitWeightedJobScheduling {

    public static void main(String[] args) {
        int[][] tf = new int[][]{{1, 4}, {2, 6}, {4, 7}, {6, 8}, {5, 9}, {7, 10}};
        int[] profit = new int[]{3, 5, 2, 6, 4, 8};
        int[] result = new int[]{3, 5, 2, 6, 4, 8};

        for (int i = 1; i < profit.length; i++) {
            for (int j = 0; j < i; j++) {
                if (tf[j][1] < tf[i][0]) {
                    result[i] = profit[i] + profit[j];
                } else {
                    result[i] = Math.max(result[i], result[j]);
                }
            }
        }

        for (int i : result) {
            System.out.print(i + ", ");
        }

    }

}
