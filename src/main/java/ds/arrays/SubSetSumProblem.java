package ds.arrays;

/**
 * Created by HARISH on 01- 08- 2018
 */
public class SubSetSumProblem {

    public static void main(String[] args) {
        SubSetSumProblem problem = new SubSetSumProblem();
        problem.solve(12, new int[]{1, 3, 5, 8, 13});
    }

    private void solve(int sum, int[] nums) {
        boolean[][] T = new boolean[nums.length][sum + 1];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= sum; j++) {
                if (j == 0) {
                    // to populate
                    T[i][j] = true;
                    continue;
                }
                if (j < nums[i]) {
                    if (i - 1 < 0) {
                        T[i][j] = false;
                    } else {
                        T[i][j] = T[i - 1][j];
                    }
                } else {
                    if (i - 1 < 0 && j - nums[i] == 0) {
                        T[i][j] = true;
                    } else if (i - 1 < 0) {
                        T[i][j] = false;
                    } else if (T[i - 1][j] == true) {
                        T[i][j] = true;
                    } else {
                        T[i][j] = T[i - 1][j - nums[i]];
                    }
                }
            }
        }

        // To find the exact numbers
        StringBuilder sb = new StringBuilder();
        int i = nums.length - 1;
        int j = sum;
        while (sum > 0) {
            if (i == 0 && sum == nums[i]) {
                sb.append(nums[i] + " ,");
                break;
            }
            if (T[i][j] != T[i - 1][j]) {
                sb.append(nums[i] + " ,");
                sum = sum - nums[i];
                j = sum;
                i--;
            } else {
                i--;
            }
        }
        System.out.println(sb.toString());
    }
}
