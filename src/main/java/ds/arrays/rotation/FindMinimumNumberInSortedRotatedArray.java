package ds.arrays.rotation;

/**
 * Created by HARISH on 25- 09- 2019
 */
public class FindMinimumNumberInSortedRotatedArray {

    public static void main(String[] args) {
        int[] A = {6, 1, 2, 3, 4, 5};
        int n = A.length;
        int s = 0;
        int e = n - 1;
        int smallest = -1;
        while (s < e) {
            int mid = (s + e) / 2;
            if (A[mid] > A[e] && A[mid] > A[mid + 1]) {
                smallest = A[mid + 1];
                break;
            } else if (A[mid] > A[e]) {
                s = mid + 1;
            } else if (A[mid] < A[e] && A[mid] < A[mid - 1]) {
                smallest = A[mid];
                break;
            } else {
                e = mid - 1;
            }
        }
        System.out.println(smallest);
    }
}
