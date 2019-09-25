package ds.arrays;

/**
 * Created by HARISH on 24- 09- 2019
 */
public class LaraFlowerShopProblem {

    public static void main(String[] args) {
        System.out.println(maxProfit(2, 3, new int[]{0, 0, 0, 1/*, 1, 0, 1, 0, 1, 1*/}));

    }

    static int maxProfit(int pT1, int pT2, int[] a) {
        int[] sol = new int[a.length];
        for (int i = 1; i < a.length; i++) {
            if (isType1(i, a)) {
                sol[i] = Math.max(sol[i - 1], pT1 + sol[i - 3]);
            } else if (isType2(i, a)) {
                sol[i] = Math.max(sol[i - 1], pT2 + sol[i - 2]);
            } else {
                sol[i] = sol[i - 1];
            }
        }

        return sol[a.length - 1];
    }

    private static boolean isType2(int i, int[] a) {
        return i - 2 >= 0 && ((a[i] == 0 && a[i - 1] == 1) || (a[i] == 1 && a[i - 1] == 0));
    }

    private static boolean isType1(int i, int[] a) {
        return i - 3 >= 0 && (a[i] == 0 && a[i - 1] == 0 && a[i - 2] == 0);
    }

}
