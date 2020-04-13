package ds.tree;

/**
 * Created by HARISH on 13- 04- 2020
 */
public class CountNumOfBSTPossibleForGivenDistinctNode {

    public static void main(String[] args) {
        int[] nodes = new int[]{5, 6, 7,4};
        int possibleBSTCount = countBSTs(nodes);
        System.out.println(possibleBSTCount);
    }

    private static int countBSTs(int[] nodes) {
        int numberOfNodes = nodes.length;
        int[] N = new int[nodes.length + 1];

        N[0] = N[1] = 1;
        for (int i = 2; i <= numberOfNodes; i++) {
            N[i] = 0;
            for (int j = 0; j < i; j++) {
                N[i] += N[j] * N[i - j - 1];
            }
        }
        return N[nodes.length];
    }
}
