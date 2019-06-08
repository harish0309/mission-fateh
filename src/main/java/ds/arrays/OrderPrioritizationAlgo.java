package ds.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by HARISH on 02- 06- 2019
 */
public class OrderPrioritizationAlgo {

    public static void main(String[] args) {
        List<String> input = Arrays.asList("Anoop 345", "Mayank 123", "Himanshu abc", "Harish abc", "Chandan def");
        List<String> primeOrders = input.stream().filter(s -> Character.isAlphabetic(s.charAt(s.indexOf(" ") + 1))).collect(Collectors.toList());
        List<String> nonPrimeOrders = input.stream().filter(s -> Character.isDigit(s.charAt(s.indexOf(" ") + 1))).collect(Collectors.toList());

        primeOrders.sort((o1, o2) -> {
            String s1 = o1.substring(o1.indexOf(" "));
            String s2 = o2.substring(o2.indexOf(" "));
            if (s1.compareTo(s2) > 0) {
                return 1;
            } else if (s1.compareTo(s2) < 0) {
                return -1;
            } else {
                return o1.compareTo(o2);
            }
        });
        for (String nonPrimeOrder : nonPrimeOrders) {
            primeOrders.add(nonPrimeOrder);

        }

        System.out.println(primeOrders);
    }


}
