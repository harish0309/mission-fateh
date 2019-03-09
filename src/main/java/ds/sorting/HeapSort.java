package ds.sorting;

import java.util.Arrays;

/**
 * Created by HARISH on 08- 09- 2018
 */
public class HeapSort {

    public static void main(String[] args) {
        int[] A = {5, 6, 2, 1, 9, 4};
        int s = 0;
        int e = A.length - 1;
        heapSort(A, s, e);
        System.out.println(Arrays.toString(A));
    }

    private static void heapSort(int[] A, int s, int e) {
        if (s >= e) {
            return;
        }
        if (!isMaxHeap(A, s, e)) {
            maxHeapify(A, s, e);
            int temp = A[s];
            A[s] = A[e];
            A[e] = temp;
            e--;
        } else {
            int temp = A[s];
            A[s] = A[e];
            A[e] = temp;
            e--;
        }
        heapSort(A, s, e);
    }

    private static boolean isMinHeap(int[] A, int s, int e) {
        int lev = e % 2 == 0 ? (e - 2) / 2 : (e - 1) / 2;
        for (int i = lev; i >= 0; i--) {
            if ((2 * i + 1) <= e && A[2 * i + 1] < A[i]) {
                return false;
            }
            if ((2 * i + 2) <= e && A[2 * i + 2] < A[i]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isMaxHeap(int[] A, int s, int e) {
        int lev = e % 2 == 0 ? (e - 2) / 2 : (e - 1) / 2;
        for (int i = lev; i >= 0; i--) {
            if ((2 * i + 1) <= e && A[2 * i + 1] > A[i]) {
                return false;
            }
            if ((2 * i + 2) <= e && A[2 * i + 2] > A[i]) {
                return false;
            }
        }
        return true;
    }

    private static void minHeapify(int[] A, int s, int e) {
        int lev = e % 2 == 0 ? (e - 2) / 2 : (e - 1) / 2;
        for (int i = lev; i >= 0; i--) {
            if ((2 * i + 1) <= e && A[2 * i + 1] < A[i]) {
                int temp = A[2 * i + 1];
                A[2 * i + 1] = A[i];
                A[i] = temp;
            }
            if ((2 * i + 2) <= e && A[2 * i + 2] < A[i]) {
                int temp = A[2 * i + 2];
                A[2 * i + 2] = A[i];
                A[i] = temp;
            }
        }
    }

    private static void maxHeapify(int[] A, int s, int e) {
        int lev = e % 2 == 0 ? (e - 2) / 2 : (e - 1) / 2;
        for (int i = lev; i >= 0; i--) {
            if ((2 * i + 1) <= e && A[2 * i + 1] > A[i]) {
                int temp = A[2 * i + 1];
                A[2 * i + 1] = A[i];
                A[i] = temp;
            }
            if ((2 * i + 2) <= e && A[2 * i + 2] > A[i]) {
                int temp = A[2 * i + 2];
                A[2 * i + 2] = A[i];
                A[i] = temp;
            }
        }
    }
}
