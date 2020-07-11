package ds.arrays;

/** Created by HARISH on 11- 07- 2020
 *
 *
 *
 * https://www.geeksforgeeks.org/minimize-cash-flow-among-given-set-friends-borrowed-money/
 * */
public class SplitwiseSmartSettle {

  public static void main(String[] args) {
    // A has to Pay 1000 to B
    // A has to Pay 2000 to C
    // B has to Pay 5000 to C

    int[][] G = {{0, 1000, 2000}, {0, 0, 5000}, {0, 0, 0}};
    // netAmount stores total payable and receivable for A, B, C
    int[] netAmount = getAmount(G);
    minimizeCashflow(netAmount);
  }

  private static void minimizeCashflow(int[] netAmount) {
    int maxPayer = getMaxPayer(netAmount);
    int maxReceiver = getMaxReceiver(netAmount);

    // Return when all have zero balance
    if (netAmount[maxPayer] == 0 && netAmount[maxReceiver] == 0) {
      return;
    }

    //
    int min = Math.min(-netAmount[maxPayer], netAmount[maxReceiver]);

    netAmount[maxReceiver] -= min;
    netAmount[maxPayer] += min;

    System.out.printf("Person(%s) pays %d to Person(%s)\n", maxPayer, min, maxReceiver);

    minimizeCashflow(netAmount);
  }

  private static int getMaxReceiver(int[] netAmount) {
    int maxReceiver = 0;
    for (int i = 1; i < netAmount.length; i++) {
      if (netAmount[i] > netAmount[maxReceiver]) {
        maxReceiver = i;
      }
    }
    return maxReceiver;
  }

  private static int getMaxPayer(int[] netAmount) {
    int maxPayer = 0;
    for (int i = 1; i < netAmount.length; i++) {
      if (netAmount[i] < netAmount[maxPayer]) {
        maxPayer = i;
      }
    }
    return maxPayer;
  }

  private static int[] getAmount(int[][] G) {
    int[] amount = new int[G.length];

    for (int i = 0; i < G.length; i++) {
      for (int j = 0; j < G.length; j++) {
        // netAmount = Net Receivable - Net Payable
        amount[i] += G[j][i] - G[i][j];
      }
    }
    return amount;
  }
}
