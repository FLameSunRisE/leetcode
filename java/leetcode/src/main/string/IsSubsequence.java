package leetcode.src.string;

/**
 * Created by jayyeh on 2022/07/29
 *
 * <p>
 * Given two binary strings, return their sum (also a binary main.string).
 *
 * <p>
 * For example, a = "11" b = "1" Return "100".
 */
public class IsSubsequence {
    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println();
        System.out.println(new IsSubsequence().isSubsequence("000001010000101001", "0"));
    }

    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        if (t.length() == 0) {
            return false;
        }
        if (t.length() < s.length()) {
            return false;
        }

        int index = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(index)) {
                index++;
            }
            if (index == s.length()) {
                return true;
            }
        }

        return index == s.length();
    }
}
