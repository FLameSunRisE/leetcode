package leetcode.src.string;

/**
 * Created by jayyeh on 2022/07/29
 *
 * <p>
 * Given two binary strings, return their sum (also a binary string).
 *
 * <p>
 * For example, a = "11" b = "1" Return "100".
 */
public class FindtheDifference {
    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println();
        //Input: s = "abcd", t = "abcde"
        //Output: "e"
        //Explanation: 'e' is the letter that was added.
        System.out.println(new FindtheDifference().findTheDifference("456","77"));
        //Input: s = "", t = "y"
        //Output: "y"
        System.out.println(new FindtheDifference().findTheDifference("","0"));
    }

    public char findTheDifference(String s, String t) {
        char c = 0;
        for(char cs : s.toCharArray()) {
            c ^= cs;
        }
        for(char ct : t.toCharArray()) {
            c ^= ct;
        }
        return c;
    }
}
