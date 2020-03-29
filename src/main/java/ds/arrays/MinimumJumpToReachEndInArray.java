package ds.arrays;

import static java.lang.Integer.MAX_VALUE;

/**
 * Created by HARISH on 29- 03- 2020
 */
/*
 * A[]= {2, 1, 3, 2, 3, 4, 5, 1, 2, 8}
 *
 * i-> index to reach
 * j-> index from where to reach to index i
 *
 * 0 <= j < i
 *
 * Maintain 2 Array
 *
 * First Array Min_Jump_Arr -> to store min jump to reach the given index
 *
 * Second Array Last_stop_Arr -> to store the index of last stop to reach the given index
 *
 * */
public class MinimumJumpToReachEndInArray {

    public static void main(String[] args) {
        int[] A = new int[]{2, 1, 3, 2, 3, 4, 5, 1, 2, 8};
        int n = A.length;

        int[] min_jump_arr = new int[]{0, MAX_VALUE, MAX_VALUE, MAX_VALUE, MAX_VALUE, MAX_VALUE, MAX_VALUE, MAX_VALUE, MAX_VALUE, MAX_VALUE};
        int[] last_stop_arr = new int[n];

        //for every index
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                //check for the given index 'j', can we reach index 'i' directly
                if (i <= j + A[j]) {

                    if (min_jump_arr[j] + 1 < min_jump_arr[i]) {
                        min_jump_arr[i] = min_jump_arr[j] + 1;
                        last_stop_arr[i] = j;
                    }
                }
            }
        }


        for (int i : min_jump_arr) {
            System.out.print(i + ", ");
        }

        for (int i : last_stop_arr) {
            System.out.print(i + ", ");
        }


    }


}

