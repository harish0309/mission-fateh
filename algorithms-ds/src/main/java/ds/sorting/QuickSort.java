package ds.sorting;

/**
 * Created by HARISH on 09- 04- 2018
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] A = {7, 6, 8, 5, 2, 4, 3, 1};
        int n = A.length;
        quickSort(A, 0, n - 1);
        printArray(A, n);
    }

    private static void quickSort(int[] a, int start, int end) {
        if (start < end) {
            int partitionIdx = partition(a, start, end);
            quickSort(a, start, partitionIdx - 1);
            quickSort(a, partitionIdx + 1, end);
        }
    }

    private static int partition(int[] a, int start, int end) {
        int pivot = a[end];
        int partitionIdx = start;
        for (int i = start; i < end; i++) {
            if (a[i] <= pivot) {
                int temp = a[partitionIdx];
                a[partitionIdx] = a[i];
                a[i] = temp;
                partitionIdx++;
            }
        }
        int temp = a[partitionIdx];
        a[partitionIdx] = a[end];
        a[end] = temp;
        return partitionIdx;
    }

    private static void printArray(int[] a, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(" " + a[i]);
        }
    }
}
