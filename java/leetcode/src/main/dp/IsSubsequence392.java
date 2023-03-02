package leetcode.src.main.dp;

/**
 * IsSubsequence392-是subsequence392.
 *
 * @author jayyeh
 * @version 1.0.0
 * @date 2023/03/02
 */
public class IsSubsequence392 {
    public static void main(String[] args) {

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

    public boolean isSubsequence1(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}

