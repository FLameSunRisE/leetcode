package main.string;

import jdk.jfr.Description;

import java.util.HashMap;

/**
 * Created by jayyeh on 2022/07/29
 */
public class FirstUniqueCharacterInAString387 {
    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println();
        //Example 1:
        //Input: s = "leetcode"
        //Output: 0
        String s = "leetcode";
        System.out.println(new FirstUniqueCharacterInAString387().firstUniqChar(s));
        System.out.println("========================");
        //Example 2:
        //Input: s = "loveleetcode"
        //Output: 2
        s = "loveleetcode";
        System.out.println(new FirstUniqueCharacterInAString387().firstUniqChar(s));
        System.out.println("========================");
        //Example 3:
        //Input: s = "aabb"
        //Output: -1
        s = "aabb";
        System.out.println(new FirstUniqueCharacterInAString387().firstUniqChar(s));
        System.out.println("========================");
    }

    public int firstUniqChar(String s) {
        Integer index = null;
        Integer lastIndex = null;
        for(char c : s.toCharArray()){
            index = s.indexOf(c);
            lastIndex = s.lastIndexOf(c);
            if(index.equals(lastIndex)) {
                return index;
            }
        }
        return -1;
    }
}
