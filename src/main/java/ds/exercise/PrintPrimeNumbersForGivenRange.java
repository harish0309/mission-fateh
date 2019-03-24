package ds.exercise;

/** Created by HARISH on 24- 03- 2019 */
public class PrintPrimeNumbersForGivenRange {

  public static void main(String[] args) {
    int range = 1000;
    //findPrimes(range);
    isPrime(33);
  }

  public static void findPrimes(int range) {
    for (int i = 3; i <= range; i++) {
      if (isPrime(i)) {
        System.out.print(i + ", ");
      }
    }
  }

  public static boolean isPrime(int num) {
    boolean isPrime = true;
    int div = 2;
    while (div <= Math.sqrt(num)) {
      if (num % div == 0) {
        isPrime = false;
        break;
      }
      div++;
    }
    return isPrime;
  }
}
