package ds.sorting;

/**
 * Created by HARISH on 05- 04- 2018
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] A = {5, 3, 2, 4, 1};
        int n = A.length;
        sort(A, n);
        printArray(A, n);
    }

    private static void printArray(int[] a, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(" " + a[i]);
        }
    }

    public static void sort(int[] A, int n) {
        int hole;
        int val;
        for (int i = 1; i < n; i++) {
            hole = i;
            val = A[i];
            while (hole > 0 && A[hole - 1] > val) {
                A[hole] = A[hole - 1];
                hole--;
            }
            A[hole] = val;
        }
    }
}
