package main.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * FindCommonCharacters1002.
 *
 * @author jayyeh
 * @version 1.0.0
 * @date 2023/03/30
 */
public class FindCommonCharacters1002 {
    public Object[] commonChars(String[] A) {
        List<String> ans = new ArrayList<String>();
        if (A == null || A.length == 0) {
            return new List[]{ans};
        }

        // 儲存第一個字串的每個字元出現的次數
        HashMap<Character, Integer> union = new HashMap<>();
        for (int i = 0; i < A[0].length(); i++) {
            union.put(A[0].charAt(i), union.getOrDefault(A[0].charAt(i), 0) + 1);
        }

        // 對於每個字串建立一個暫存 HashMap，用於儲存當前字串中所有出現在前面字串中的字元的次數
        for (int i = 1; i < A.length; i++) {
            HashMap<Character, Integer> temp = new HashMap<>();
            for (int j = 0; j < A[i].length(); j++) {
                char curr = A[i].charAt(j);
                if (union.containsKey(curr)) {
                    temp.put(curr, Math.min(union.get(curr), temp.getOrDefault(curr, 0) + 1));
                }
            }
            union = temp;
        }

        // 遍歷 union 中所有字元及其出現次數，將其加入結果陣列
        for (char c : union.keySet()) {
            for (int i = 0; i < union.get(c); i++) {
                ans.add(c + "");
            }
        }

        return new List[]{ans};
    }

    public List<String> commonChars_2(String[] A) {
        List<String> res = new ArrayList<>();
        int[] charCount = new int[26];
        // 先填入一個極大值，方便之後取最小值
        Arrays.fill(charCount, Integer.MAX_VALUE);

        for (String word : A) {
            // 用來記錄當前字串中每個字元出現的次數
            int[] currCharCount = new int[26];
            for (char c : word.toCharArray()) {
                currCharCount[c - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                // 取最小值
                charCount[i] = Math.min(charCount[i], currCharCount[i]);
            }
        }

        for (int i = 0; i < 26; i++) {
            while (charCount[i]-- > 0) {
                // 將結果轉換為字元並加入結果列表
                res.add(String.valueOf((char) ('a' + i)));
            }
        }

        return res;
    }
}
