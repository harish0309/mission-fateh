package ds.arrays.rotation;

/**
 * Created by HARISH on 05- 09- 2018
 */
public class FindSumPairOnRotatedArrayProblem {

    public static void main(String[] args) {
        int[] A = {11, 15, 6, 8, 9, 10};
        solve(A, 18);
    }

    public static void solve(int[] A, int sum) {
        // find the pivot element index in the given array
        int pivot = new FindPivotOfSortedAndRotatedArray().findPivot(A, 0, A.length - 1);

        // pivot element is the maximum number in the given array
        // element adjacent to pivot element is minimum is the given array

        int left = pivot;
        int right = pivot + 1;

        while (left != right) {

            if (A[left] + A[right] == sum) {
                System.out.println("Sum is " + sum + " for pair at idx " + left + "," + right);
                break;
            }

            if (A[left] + A[right] > sum) {
                left = left - 1;
                if (left < 0) {
                    left = A.length - 1;
                }
                continue;
            }
            if (A[left] + A[right] < sum) {
                right = right + 1;
                if (right > A.length - 1) {
                    right = 0;
                }
            }
        }
    }
}
