package ds.arrays;

/**
 * Created by HARISH on 02- 01- 2020
 */
public class LongestPalindromicSubsequenceUsingRecursion {


    public static void main(String[] args) {
        String str = "pqstvqpe";
        int r = findPalindromicLength(str, 0, str.length() - 1);
        System.out.println(r);
    }

    static int findPalindromicLength(String str, int s, int e) {
        if (s >= e) {
            return 0;
        }
        if (str.charAt(s) == str.charAt(e)) {
            return 2 + findPalindromicLength(str.substring(s + 1, e), 0, str.substring(s + 1, e).length() - 1);
        } else {
            return Math.max(findPalindromicLength(str.substring(s, e), 0, str.substring(s, e).length() - 1),
                    findPalindromicLength(str.substring(s + 1, e + 1), 0, str.substring(s + 1, e + 1).length() - 1));
        }
    }
}
