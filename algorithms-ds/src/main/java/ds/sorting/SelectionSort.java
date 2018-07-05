package ds.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] a = {4, 5, 3, 2, 1, 6};
        int size = 6;
        sort(a, size);
        Arrays.stream(a).forEach(System.out::println);
    }

    private static void sort(int[] input, int size) {

        int minIdx;
        int temp;
        for (int i = 0; i < size - 1; i++) {
            minIdx = i;
            for (int j = i + 1; j < size - 1; j++) {
                if (input[j] < input[minIdx]) {
                    minIdx = j;
                }
            }
            temp = input[minIdx];
            input[minIdx] = input[i];
            input[i] = temp;
        }
    }
}
