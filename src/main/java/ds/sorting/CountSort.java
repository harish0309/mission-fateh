package ds.sorting;

/**
 * Created by HARISH on 29- 05- 2019
 */
public class CountSort {

    public static void main(String[] args) {
        int[] A = {1, 4, 0, 1, 0, 2, 7, 5, 2};
        int[] R = sort(A, 0, 7);
        for (int i : R) {
            System.out.print(i + ", ");
        }
    }


    public static int[] sort(int[] A, int min, int max) {
        int N = A.length;
        //Sorted Output Array
        int[] R = new int[N];
        //Create an auxiliary array to store the count(occurrence) of each number in input.
        int[] C = new int[max + 1];

        //Store the count to C[]

        for (int i = 0; i < N; i++) {
            int idx = A[i];
            C[idx] += 1;
        }

        // Modify C[] to store the starting index of each number
        // C[idx]=C[idx]+C[idx+1] 0<idx<=max
        for (int i = 1; i <= max; i++) {
            C[i] += C[i - 1];
        }

        //Shift C[] to right by one index
        for (int i = max; i > 0; i--) {
            C[i] = C[i - 1];
        }
        C[0] = 0;
        // Prepare the output array

        for (int i = 0; i < N; i++) {
            int number = A[i];
            int rIdx = C[number];
            R[rIdx] = number;
            C[number] = rIdx + 1;
        }

        return R;
    }
}
