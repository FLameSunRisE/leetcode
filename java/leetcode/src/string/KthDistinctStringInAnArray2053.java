package string;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jayyeh on 2022/07/29
 * @author Jay
 */
public class KthDistinctStringInAnArray2053 {
    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println();
        // Input: arr = ["d","b","c","b","c","a"], k = 2
        // Output: "a"
        String[] inputList = {"d","b","c","b","c","a"};
        int k = 2;
        System.out.println(new KthDistinctStringInAnArray2053().kthDistinct(inputList, k ));
        // Input: arr = ["aaa","aa","a"], k = 1
        // Output: "aaa"
        inputList = new String[]{"aaa","aa","a"};
        k = 1;
        System.out.println(new KthDistinctStringInAnArray2053().kthDistinct(inputList, k ));
        // Input: arr = ["a","b","a"], k = 3
        // Output: ""
        inputList = new String[]{"a","b","a"};
        k = 3;
        System.out.println(new KthDistinctStringInAnArray2053().kthDistinct(inputList, k ));
    }

    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new HashMap<>();
        for(String s : arr) {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        int point = 0;
        for(String s : arr) {
            if(map.get(s) == 1 && ++point==k) {
                return s;
            }
        }
        return "";
    }
}
