package ds.arrays;

/**
 * Created by HARISH on 02- 01- 2020
 */
public class LongestPalindromicSubsequence {

    public static void main(String[] args) {

        String s = "ccd";

        int n = s.length();

        int[][] M = new int[n][n];

        for (int k = 0; k < n; k++) {

            int r = 0;
            int c = k;

            while (r < n - k) {

                if (r == c) {
                    M[r++][c++] = 1;
                    continue;
                }

                if (s.charAt(r) == s.charAt(c)) {
                    M[r][c] = 2 + M[r + 1][c - 1];
                } else {
                    M[r][c] = Math.max(M[r][c - 1], M[r + 1][c]);
                }
                r++;
                c++;
            }
        }

        char[] cArr = new char[M[0][n - 1]];
        int f = 0;
        int e = M[0][n - 1] - 1;

        int i = 0;
        int j = n - 1;
        while (f <= e) {

            if (M[i][j] == M[i][j - 1]) {
                j = j - 1;
            } else if (M[i][j] == M[i + 1][j]) {
                i = i + 1;
            } else {
                cArr[f++] = s.charAt(i);
                cArr[e--] = s.charAt(i);
                i = i + 1;
                j = j - 1;
            }
        }

        System.out.println(String.valueOf(cArr));
    }


}
