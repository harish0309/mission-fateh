package ds.arrays;

/**
 * Created by HARISH on 23- 07- 2018
 */
public class SolveRatMazeAllDirection {


    public static void solve(int M[][], int nR, int nC, int r, int c, int[][] sol) {
        if (r > nR - 1 || r < 0 || c > nR - 1 || c < 0 || M[r][c] == 0) {
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
        System.out.println(sum);
    }
}
