package main.twopoint;

/**
 * ReverseStringII541.
 *
 * @author jayyeh
 * @version 1.0.0
 * @date 2023/04/07
 */
public class ReverseStringII541 {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        for (int i = 0; i < n; i += 2 * k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);
            while (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }

}
