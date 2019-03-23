package ds.arrays;

/** Created by HARISH on 23- 03- 2019 */
public class MoveAllZerosToEndInArray {

  public static void main(String[] args) {
    int a[] = {2, 0, 1, 0, 4, 0, 6, 5, 9, 9, 0, 0, 0};
    int n = a.length;

    int i = 0, j = n - 1;
    while (i < j) {

      if (a[i] == 0) {

        // move the 0 element to the end
        while (i != j) {
          if (a[j] != 0) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            j--;
            break;
          } else {
            j--;
          }
        }
      }
      i++;
    }
    System.out.println(a);
  }
}
