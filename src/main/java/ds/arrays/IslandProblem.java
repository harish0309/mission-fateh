package ds.arrays;

/**
 * Created by HARISH on 25- 09- 2019
 */
public class IslandProblem {

    public static void main(String[] args) {

        int nR = 5;
        int nC = 5;
        int[][] M = new int[][]{{1, 1, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}};
        boolean[][] visited = new boolean[nR][nC];

        int islandCount = 0;
        for (int i = 0; i < nR; i++) {
            for (int j = 0; j < nC; j++) {
                if (M[i][j] == 1 && !visited[i][j]) {
                    findIsland(M, i, j, nR, nC, visited);
                    islandCount++;
                }
            }
        }

        System.out.println(islandCount);


    }

    private static void findIsland(int[][] m, int i, int j, int nR, int nC, boolean[][] visited) {

        if (i < 0 || i > nR - 1 || j < 0 || j > nC - 1 || m[i][j] == 0 || visited[i][j]) {
            return;
        }

        visited[i][j] = true;
        for (int r = i - 1; r <= i + 1 && r < nR; r++) {
            for (int c = j - 1; c <= j + 1 && c < nC; c++) {
                findIsland(m, r, c, nR, nC, visited);
            }
        }
    }


}
