package main.hashmap;

import java.util.HashSet;
import java.util.Set;

/**
 * BuddyStrings859.
 *
 * @author jayyeh
 * @version 1.0.0
 * @date 2023/04/02
 */
public class BuddyStrings859 {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        // 如果两个字符串相等，则需要检查其中是否有重复字符
        if (s.equals(goal)) {
            // 用来记录每个字母出现的次数
            Set<Character> set = new HashSet<>();
            for (char c : s.toCharArray()) {
                if (set.contains(c)) {
                    return true;
                } else {
                    set.add(c);
                }
            }
            return false;
        }

        // 查找需要交换的字符的位置
        int first = -1, second = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (first == -1) {
                    first = i;
                } else if (second == -1) {
                    second = i;
                } else {
                    return false;
                }
            }
        }

        // 如果只有一对需要交换的字符，则无法通过交换字符使得两个字符串相等
        if (second == -1) {
            return false;
        }

        // 检查需要交换的字符是否能使得两个字符串相等
        return s.charAt(first) == goal.charAt(second) && s.charAt(second) == goal.charAt(first);
    }
}
