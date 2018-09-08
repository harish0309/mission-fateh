package ds.arrays;

/**
 * Created by HARISH on 31- 07- 2018
 */
public class EggDropProblem {
    public static void main(String[] args) {
        EggDropProblem problem = new EggDropProblem();
        problem.solve(100, 4);
    }

    private void solve(int nF, int nE) {
        int[][] T = new int[nE + 1][nF + 1];
        for (int i = 1; i <= nE; i++) {
            for (int j = 1; j <= nF; j++) {
                if (i == 1) {
                    T[i][j] = j;
                    continue;
                }
                if (i > j) {
                    T[i][j] = T[i - 1][j];
                    continue;
                }
                int k = 1;
                while (k <= j) {
                    if (T[i][j] == 0) {
                        T[i][j] = 1 + Math.max(T[i - 1][k - 1], T[i - 1][j - k]);
                    } else {
                        T[i][j] = Math.min(T[i][j], 1 + Math.max(T[i - 1][k - 1], T[i - 1][j - k]));
                    }
                    k++;
                }
            }
        }

        System.out.println(T);

    }
}
