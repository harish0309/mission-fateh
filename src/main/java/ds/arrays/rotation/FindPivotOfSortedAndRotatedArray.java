package ds.arrays.rotation;

/**
 * Created by HARISH on 19- 03- 2019
 */
public class FindPivotOfSortedAndRotatedArray {

    public static void main(String[] args) {
        int[] A = {3, 4, 5, 6, 7, 8, 9, 10, 1, 2};
        int n = A.length;
        int s = 0;
        int e = n - 1;
        int m = 0;

        m = new FindPivotOfSortedAndRotatedArray().findPivot(A, s, e);

        System.out.println("Pivot index :: " + m);
    }

    public int findPivot(int[] A, int s, int e) {
        int mid = -1;

        while (s <= e) {
            mid = (s + e) / 2;

            if (A[mid + 1] > A[mid] && mid > 0 && A[mid - 1] > A[mid]) {
                break;
            }
            if (A[mid + 1] < A[mid]) {
                mid = mid + 1;
                break;
            }
            if (A[e] > A[mid]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return mid;
    }
}
