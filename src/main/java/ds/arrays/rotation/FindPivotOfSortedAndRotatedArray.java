package ds.arrays.rotation;

/** Created by HARISH on 19- 03- 2019 */
public class FindPivotOfSortedAndRotatedArray {

  public static void main(String[] args) {
    int[] A = {4, 5, 1, 2, 3};
    int n = A.length;
    int s = 0;
    int e = n - 1;
    int m = 0;

    while (true) {
      m = s + (e - s) / 2;
      if (m == s || m == e) {
       m = e;
        break;
      }
      if (A[s] < A[m]) {
        s = m; // pivot is towards right
        continue;
      }
      if (A[s] > A[m]) {
        e = m; // pivot is towards left
      }
    }

    System.out.println("Pivot index :: " + m);
  }
}
