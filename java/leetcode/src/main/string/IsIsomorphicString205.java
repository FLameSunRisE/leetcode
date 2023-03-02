package leetcode.src.main.string;

import java.util.HashMap;

/**
 * IsIsomorphicString205-同构string205.
 *
 * @author jayyeh
 * @version 1.0.0
 * @date 2023/03/02
 */
public class IsIsomorphicString205 {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<String, String> sMap = new HashMap<String, String>();
        HashMap<String, String> tMap = new HashMap<String, String>();
        for (int i = 0; i < s.length(); i++) {
            String sWord = String.valueOf(s.charAt(i));
            String tWord = String.valueOf(t.charAt(i));
            if (sMap.containsKey(sWord) && !sMap.get(sWord).equals(tWord)
                    || tMap.containsKey(tWord) && !tMap.get(tWord).equals(sWord)) {
                return false;
            }
            sMap.put(sWord, tWord);
            tMap.put(tWord, sWord);
        }
        return true;
    }
}
