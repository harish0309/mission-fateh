package ds.arrays.rotation;

/** Created by HARISH on 10- 04- 2019 */
public class FindSubArrayWithGivenSum {

  public static void main(String[] args) {
    int a[] = {1, 2, 3, 7, 5};
    int sum = 10;
    int i = 0, temp = 0, s = 0, e = 0;

    while (i < a.length) {
      temp += a[i];
      if (temp == sum) {
        e = i;
        break;
      }
      if (temp < sum) {
        e = i;
        i++;
      } else {
        e = i;
        i++;
        while (temp > sum) {
          temp -= a[s];
          s++;
        }
        if (temp == sum) {
          break;
        }
      }
    }
    System.out.println("Starts at index: " + s + " and end at index: " + e);
  }
}
