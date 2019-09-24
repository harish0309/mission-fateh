package ds.arrays;

import static java.lang.Math.max;

/**
 * Created by HARISH on 24- 09- 2019
 */
public class LaraFlowerShopProblem {

    public static void main(String[] args) {
        System.out.println(maxProfit(5, 3, new int[]{0, 0, 0, 1}));

    }

    static int maxProfit(int pT1, int pT2, int[] a) {
        int profitType1 = 0;
        int profitType2 = 0;
        int profitType1n2 = 0;
        int n = a.length;

        int countType1 = 0;
        int countType2 = 0;
        int i = 0;

        // only for type 1
        int count1 = 0;

        while (i < n - 2) {
            if (isType1(i, a)) {
                count1++;
                i = i + 3;
            } else {
                i++;
            }
        }

        profitType1 = count1 * pT1;

        // only for type 2
        int count2 = 0;
        i = 0;

        while (i < n - 1) {
            if (isType2(i, a)) {
                count2++;
                i = i + 2;
            } else {
                i++;
            }
        }

        profitType2 = count2 * pT2;

        i = 0;
        while (i < n - 2) {
            if (isType1(i, a)) {
                countType1++;
                i = i + 3;
            } else if (isType2(i, a)) {
                countType2++;
                i = i + 2;
            } else {
                i++;
            }
        }

        profitType1n2 = (countType1 * pT1) + (countType2 * pT2);


        return max(max(profitType1, profitType2), profitType1n2);
    }

    private static boolean isType2(int i, int[] a) {
        return (a[i] == 0 && a[i + 1] == 1) || (a[i] == 1 && a[i + 1] == 0);
    }

    private static boolean isType1(int i, int[] a) {
        return a[i] == 0 && a[i + 1] == 0 && a[i + 2] == 0;
    }

}
