package ds.searching;

/** Created by HARISH on 18- 03- 2019 */
public class BinarySearchInArray {
  public static void main(String[] args) {
    int[] A = {2, 4, 6, 8, 10, 12, 14};
    int size = A.length;
    int find = 11;
    int start = 0;
    int end = size - 1;
    int mid = 0;
    while (start <= end) {
      mid = start + (end - start) / 2;
      if (find < A[mid]) {
        end = mid - 1;
      } else if (find > A[mid]) {
        start = mid + 1;
      } else if (find == A[mid]) {
        System.out.println("Element found at index {" + mid + "}");
        break;
      }
    }
  }
}
