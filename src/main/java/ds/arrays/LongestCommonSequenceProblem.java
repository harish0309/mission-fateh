package ds.arrays;

import java.util.Stack;

/**
 * Created by HARISH on 28- 07- 2018
 */
public class LongestCommonSequenceProblem {

    public static void main(String[] args) {
        String[] A = {"a", "b", "c", "d", "a", "f"};
        String[] B = {"a", "c", "b", "c", "f"};
        LongestCommonSequenceProblem problem = new LongestCommonSequenceProblem();
        Stack<String> answer = problem.solve(A, B);
        while (!answer.isEmpty()) {
            System.out.print(answer.pop() + " ");
        }
    }

    //             a  b  c  d  a  f
//          0  0  0  0  0  0  0
//      a   0  1  1  1  1  1  1
//      c   0  1  1  2  2  2  2
//      b   0  1  2  2  2  2  2
//      c   0  1  2  3  3  3  3
//      f   0  1  2  3  3  3  4
//    answer :: a b c f
    private Stack<String> solve(String[] A, String[] B) {
        int[][] T = new int[B.length + 1][A.length + 1];
        for (int i = 0; i <= B.length; i++) {
            for (int j = 0; j <= A.length; j++) {
                if (i == 0 || j == 0) {
                    T[i][j] = 0;
                    continue;
                }
                if (B[i - 1].equals(A[j - 1])) {
                    T[i][j] = 1 + T[i - 1][j - 1];
                    // if the items match then (1 + max value of items, excluding thi item)
                } else {
                    T[i][j] = Math.max(T[i - 1][j], T[i][j - 1]);
                    // if the items does not match then (max value of items, by excluding this item or by including this item)
                }
            }
        }
        for (int i = 0; i <= B.length; i++) {
            for (int j = 0; j <= A.length; j++) {
                System.out.print(T[i][j] + "  ");
            }
            System.out.println();
        }
        int r = B.length;
        int c = A.length;
        Stack<String> answer = new Stack<>();
        while (r > 0) {
            if (c == 0) {
                c = r;
                r--;
            }
            if (T[r][c] == T[r - 1][c] || T[r][c] == T[r][c - 1]) {
                c--;
                continue;
            } else {
                answer.push(A[c - 1]);
                r--;
                c--;
            }
        }
        return answer;
    }
}
