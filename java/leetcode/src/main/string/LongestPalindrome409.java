package leetcode.src.main.string;

import java.util.HashMap;
import java.util.Map;

/**
 * LongestPalindrome409.
 *
 * @author jayyeh
 * @version 1.0.0
 * @date 2023/03/06
 */
public class LongestPalindrome409 {
    public int longestPalindrome(String s) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }

        int len = 0;
        for (int i : charMap.values()) {
            if (i % 2 == 0) {
                len += i;
            } else {
                len += i - 1;
            }
        }
        return len < s.length() ? len + 1 : len;
    }

    public int longestPalindromeSelf(String s) {
        HashMap<String, Integer> countMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String str = String.valueOf(s.charAt(i));
            countMap.put(str, countMap.getOrDefault(str, 0) + 1);
        }

        int result = 0;
        boolean hasOdd = false;
        for (Map.Entry<String, Integer> set : countMap.entrySet()) {
            if (set.getValue() % 2 == 0) {
                result += set.getValue();
            } else {
                result = set.getValue() - 1;
                hasOdd = true;
            }
        }
        if (hasOdd) {
            result++;
        }
        return result;
    }
}
