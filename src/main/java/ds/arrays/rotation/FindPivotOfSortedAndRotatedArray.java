package ds.arrays.rotation;

/** Created by HARISH on 19- 03- 2019 */
public class FindPivotOfSortedAndRotatedArray {

  public static void main(String[] args) {
    int[] A = {11, 15, 16, 18, 19, 110};
    int n = A.length;
    int s = 0;
    int e = n - 1;
    int m = 0;

    m = findPivot(A, s, e);

    System.out.println("Pivot index :: " + m);
  }

  public static int findPivot(int[] A, int start, int end) {
    int m;
    while (true) {
      m = start + (end - start) / 2;
      if (m == start || m == end) {
        m = start;
        break;
      }
      if (A[start] < A[m]) {
        start = m; // pivot is towards right
        continue;
      }
      if (A[start] > A[m]) {
        end = m; // pivot is towards left
      }
    }
    return m;
  }
}
