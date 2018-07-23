package ds.arrays;

/**
 * Created by HARISH on 23- 07- 2018 input 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 *
 * <p>output 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
 */
class ArraySpiralPrint {

  static void spiralPrint(int[][] A, int row, int col) {
    int t = 0;
    int b = row - 1;
    int l = 0;
    int r = col - 1;
    int dir = 0;
    // l --> r  = 0
    // t --> b  = 1
    // r --> l  = 2
    // b --> t  = 3

    while (t <= b && l <= r) {
      if (dir == 0) { // print top row (l->r)
        for (int i = l; i <= r; i++) {
          System.out.print(A[t][i] + " ");
        }
        t++;

      } else if (dir == 1) { // print right column ( t ->b)
        for (int i = t; i <= b; i++) {
          System.out.print(A[i][r] + " ");
        }
        r--;
      } else if (dir == 2) { // print bottom row (r -> l)
        for (int i = r; i >= l; i--) {
          System.out.print(A[b][i] + " ");
        }
        b--;
      } else if (dir == 3) { // print left column (b -> t)
        for (int i = b; i >= t; i--) {
          System.out.print(A[i][l] + " ");
        }
        l++;
      }
      dir = ++dir % 4;
    }
  }
}
