package ds.arrays;

import java.util.Arrays;

/**
 * Created by HARISH on 14- 04- 2020
 */
public class ImmediateNextNumber_Amazon {

    public static void main(String[] args) {
        Integer number = 816543;


        char[] numStr = String.valueOf(number).toCharArray();

        int n = numStr.length;
        Integer newNumber = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (numStr[i] - '0' < numStr[n - 1] - '0') {
                char temp = numStr[i];
                numStr[i] = numStr[n - 1];
                numStr[n - 1] = temp;
                newNumber = sortNums(String.valueOf(numStr), i + 1, n);
            }
        }

        if (newNumber == -1) {
            System.out.println("Not Possible");
        } else {
            System.out.printf("Next greater number after %d is = %d", number, newNumber);
        }


    }

    private static Integer sortNums(String str, int i, int n) {
        char[] array = str.toCharArray();
        Arrays.sort(array, i, n);
        return Integer.valueOf(String.valueOf(array));
    }
}
