package ds.searching;

/**
 * Created by HARISH on 18- 03- 2019
 */
public class BinarySearchInArray {
    public static void main(String[] args) {
        int[] A = new int[]{2, 4, 8, 10, 15, 17, 19};
        int s = 0;
        int e = A.length;
        int idx = -1;
        int num = 18;

        while (s < e) {
            int mid = (s + e) / 2;
            if (num == A[mid]) {
                idx = mid;
                break;
            }
            if (num < A[mid]) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        idx = idx != -1 ? idx : s;

        System.out.println("Given number " + num + " should be at index {" + idx + "}");

    }
}
