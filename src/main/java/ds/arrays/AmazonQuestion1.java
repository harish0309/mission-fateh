package ds.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by HARISH on 02- 06- 2019
 */
public class AmazonQuestion1 {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>(2);
        input.add(1);
        input.add(10);
        input.add(25);
        input.add(35);
        input.add(60);
        ArrayList<Integer> packages = packages(90, input);
        System.out.println(packages);
    }

    private static ArrayList<Integer> packages(int truckSpace, ArrayList<Integer> packagesSpace) {
        ArrayList<Integer> inputList = new ArrayList(packagesSpace);
        Collections.sort(inputList);
        ArrayList<Integer> output = new ArrayList<>(2);
        int totalSum = truckSpace - 30;
        int finalSum = 0;
        List<Integer> validInput = inputList.stream().filter(i -> i <= totalSum).collect(Collectors.toList());
        int[] A = validInput.stream().mapToInt(i->i).toArray();
        int n = A.length;
        int s = 0;
        int e = n - 1;

        while (s < e) {
            int sum = A[s] + A[e];
            if (sum > totalSum) {
                e--;
                continue;
            }
            if (sum > finalSum) {
                finalSum = sum;
                output.clear();
                output.add(0, A[s]);
                output.add(1, A[e]);
            }
            s++;

        }
        ArrayList<Integer> finalOuput = new ArrayList<>(2);

        for (Integer integer : output) {
            finalOuput.add(packagesSpace.indexOf(integer));
        }

        return finalOuput;
    }
}
