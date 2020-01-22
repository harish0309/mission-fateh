package ds.arrays;

/**
 * Created by HARISH on 23- 07- 2018
 */
public class SolveRatMazeAllDirection {

    static int finalSum = -1;

    public static void main(String[] args) {
        int[][] A = {{1, 1, 1, 1}, {0, 0, 0, 0}, {0, 1, 0, 1}, {1, 1, 9, 1}, {0, 0, 1, 1}};
        int[][] sol = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        solve(A, 5, 4, 0, 0, sol);
        System.out.println(finalSum);

    }

    public static void solve(int M[][], int nR, int nC, int r, int c, int[][] sol) {
        if (r > nR - 1 || r < 0 || c > nC - 1 || c < 0 || M[r][c] == 0) {
            return; // check if position is out of range or check for valid path
        }

        if (sol[r][c] == 1) {
            return;   // Already visited cell
        }

        if (M[r][c] == 9) {
            findSum(sol, nR, nC);
            return;
        }


        sol[r][c] = 1; // mark current position as 1
        solve(M, nR, nC, r, c + 1, sol); // move right from the current position
        solve(M, nR, nC, r + 1, c, sol); // move down from the current position
        solve(M, nR, nC, r, c - 1, sol); // move left from the current position
        solve(M, nR, nC, r - 1, c, sol); // move up from the current position
        sol[r][c] = 0;
        return;
    }

    private static void findSum(int[][] sol, int nR, int nC) {
        int sum = 0;
        for (int i = 0; i < nR; i++) {
            for (int j = 0; j < nC; j++) {
                sum += sol[i][j];
            }
        }
        if (finalSum == -1) {
            finalSum = sum;
        }
        if (sum < finalSum) {
            finalSum = sum;
        }
    }
}
