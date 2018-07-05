package ds.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {6, 4, 5, 3, 2, 1};
        int size = 6;
        sort(a, size);
        Arrays.stream(a).forEach(System.out::println);
    }

    private static void sort(int[] input, int size) {
        int temp;
        for (int i = 0; i < size - 1; i++) {
            int flag = 0;
            for (int j = 0; j < size - 1 - i; j++) {
                if (input[j] > input[j + 1]) {
                    temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }
    }
}
