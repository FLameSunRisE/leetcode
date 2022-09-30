package main.string;

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
        String s = "";
        System.out.println(new FirstUniqueCharacterInAString387().firstUniqChar(s));
        System.out.println("========================");
        //Example 2:
        //Input: s = "loveleetcode"
        //Output: 2
        s = "";
        System.out.println(new FirstUniqueCharacterInAString387().firstUniqChar(s));
        System.out.println("========================");
        //Example 3:
        //Input: s = "aabb"
        //Output: -1
        s = "";
        System.out.println(new FirstUniqueCharacterInAString387().firstUniqChar(s));
        System.out.println("========================");
    }

    public int firstUniqChar(String s) {
        return 0;
    }
}
