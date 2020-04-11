package ds.arrays;

/**
 * Created by HARISH on 11- 04- 2020
 */
public class MobileNumericKeyPadProblem {

    public static void main(String[] args) {
        char keypad[][] = {{'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}};
        int N = 3;

        System.out.println(getCount(keypad, N));
    }

    private static int getCount(char keypad[][], int N) {

        // directions
        int row[] = {0, 0, -1, 0, 1};
        int col[] = {0, -1, 0, 1, 0};

        // Current | Left | Up | Right | Down

        int[][] count = new int[10][N + 1];

        for (int i = 0; i < 10; i++) {
            count[i][0] = 0;
            count[i][1] = 1;
        }

        for (int i = 2; i <= N; i++) {

            //iterate over keypad
            for (int j = 0; j < 4; j++) {

                for (int k = 0; k < 3; k++) {

                    if (keypad[j][k] != '*' && keypad[j][k] != '#') {

                        int num = keypad[j][k] - '0';
                        count[num][i] = 0;

                        // go to all 5 directions
                        for (int move = 0; move < 5; move++) {
                            int r = j + row[move];
                            int c = k + col[move];

                            if (r >= 0 && r < 4 && c >= 0 && c < 3 && keypad[r][c] != '*' && keypad[r][c] != '#') {

                                int nextNum = keypad[r][c] - '0';
                                count[num][i] += count[nextNum][i - 1];
                            }
                        }
                    }
                }
            }
        }

        int totalCount = 0;
        for (int i = 0; i < 10; i++) {
            totalCount += count[i][N];
        }

        return totalCount;
    }
}
