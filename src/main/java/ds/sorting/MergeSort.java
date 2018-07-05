package ds.sorting;

/**
 * Created by HARISH on 05- 04- 2018
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] A = {7, 6, 8, 5, 2, 4, 3, 1};
        int n = A.length;
        mergeSort(A);
        printArray(A, n);
    }

    private static void mergeSort(int[] a) {
        int n = a.length;
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int nL = mid;
        int nR = n - mid;
        int[] L = new int[nL];
        int[] R = new int[nR];
        for (int i = 0; i < mid; i++) {
            L[i] = a[i];
        }
        for (int i = 0; i < nR; i++) {
            R[i] = a[mid + i];
        }
        mergeSort(L);
        mergeSort(R);
        merge(L, R, a);
    }

    private static void merge(int[] l, int[] r, int[] a) {
        int n = a.length;
        int nl = l.length;
        int nr = r.length;
        int i = 0, j = 0, k = 0;
        while (i < nl && j < nr) {
            if (l[i] <= r[j]) {
                a[k] = l[i];
                i++;
            } else {
                a[k] = r[j];
                j++;
            }
            k++;
        }
        while (i < nl) {
            a[k] = l[i];
            i++;
            k++;
        }
        while (j < nr) {
            a[k] = r[j];
            j++;
            k++;
        }
    }

    private static void printArray(int[] a, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(" " + a[i]);
        }
    }
}
