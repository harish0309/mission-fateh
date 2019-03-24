package ds.arrays;

/** Created by HARISH on 24- 03- 2019 */
public class FindMinProductOfKIntegerInArray {
  public static void main(String[] args) {
    int[] a = {11, 8, 5, 7, 5, 100};
    int k = 6;
    int minProd = minimumProd(a, k);
    System.out.println(minProd);
  }

  public static int minimumProd(int[] a, int k) {
    int sum = Integer.MAX_VALUE;
    int n = a.length;

    for (int i = 0; i <= n - k; i++) {

      int prod = findInitialProd(a, i, i + k - 2);
      int s = i + k - 1;
      while (s < n) {
        if (prod * a[s] < sum) {
          sum = prod * a[s];
        }
        s++;
      }
    }

    return sum;
  }

  private static int findInitialProd(int[] a, int s, int e) {
    int prod = 1;
    int j = s;
    while (j <= e) {
      prod *= a[j];
      j++;
    }
    return prod;
  }
}
