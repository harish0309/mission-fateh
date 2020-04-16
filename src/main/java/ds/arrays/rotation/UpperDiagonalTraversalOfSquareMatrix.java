package ds.arrays.rotation;

/**
 * Created by HARISH on 17- 04- 2020
 */
public class UpperDiagonalTraversalOfSquareMatrix {


    public static void main(String[] args) {
        int m = 4;
        for (int k = 0; k < m; k++) {
            int i = 0;
            int j = k;
            while (i < m - k && j < m) {
                System.out.printf(" [%d%d] ", i++, j++);
            }
            System.out.println();
        }
    }
}
