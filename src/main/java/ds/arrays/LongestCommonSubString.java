package ds.arrays;

/**
 * Created by HARISH on 10- 04- 2020
 */
public class LongestCommonSubString {

    public static void main(String[] args) {
        String[] S1 = {"a", "b", "c", "d", "a", "f"};
        String[] S2 = {"a", "c", "b", "c", "f"};
        int nS1 = S1.length;
        int nS2 = S2.length;


        int[][] M = new int[nS2 + 1][nS1 + 1];

        for (int i = 0; i <= nS1; i++) {
            M[0][i] = 0;
        }
        for (int i = 0; i <= nS2; i++) {
            M[i][0] = 0;
        }

        for (int i = 1; i <= nS2; i++) {
            for (int j = 1; j <= nS1; j++) {
                if (S2[i - 1].equals(S1[j - 1])) {
                    if (i - 2 < 0 || j - 2 < 0) {
                        M[i][j] = M[i - 1][j - 1] + 1;
                        continue;
                    }
                    if (S2[i - 2].equals(S1[j - 2])) {
                        M[i][j] = M[i - 1][j - 1] + 1;
                    }else{
                        M[i][j] = Math.max(M[i - 1][j], M[i][j - 1]);
                    }

                } else {
                    M[i][j] = Math.max(M[i - 1][j], M[i][j - 1]);
                }
            }
        }

        System.out.println(M);


    }
}
