package leetcode.src.string;

import java.util.*;

/**
 * Created by jayyeh on 2022/07/29
 *
 * <p>
 * Given two binary strings, return their sum (also a binary main.string).
 *
 * <p>
 * For example, a = "11" b = "1" Return "100".
 */
public class FindtheDistanceValueBetweenTwoArrays1385 {
    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println();
        // Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"], list2 = ["Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"]
        // Output: ["Shogun"]
        // Explanation: The only common main.string is "Shogun".
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        System.out.println(Arrays.toString(new FindtheDistanceValueBetweenTwoArrays1385().findRestaurant(list1, list2)));
        // Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"], list2 = ["KFC","Shogun","Burger King"]
        // Output: ["Shogun"]
        // Explanation: The common main.string with the least index sum is "Shogun" with index sum = (0 + 1) = 1.
        list1 = new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"};
        list2 = new String[]{"KFC", "Shogun", "Burger King"};
        System.out.println(Arrays.toString(new FindtheDistanceValueBetweenTwoArrays1385().findRestaurant(list1, list2)));
        // Input: list1 = ["happy","sad","good"], list2 = ["sad","happy","good"]
        // Output: ["sad","happy"]
        // Explanation: There are three common strings:
        // "happy" with index sum = (0 + 1) = 1.
        // "sad" with index sum = (1 + 0) = 1.
        // "good" with index sum = (2 + 2) = 4.
        // The strings with the least index sum are "sad" and "happy".
        list1 = new String[]{"happy", "sad", "good"};
        list2 = new String[]{"sad", "happy", "good"};
        System.out.println(Arrays.toString(new FindtheDistanceValueBetweenTwoArrays1385().findRestaurant(list1, list2)));
    }

    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> res = new LinkedList<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            Integer j = map.get(list2[i]);
            if (j == null){
                continue;
            }
            if (i + j <= minSum){
                if (i + j < minSum) {
                    res.clear();
                    minSum = i + j;
                }
                res.add(list2[i]);
            }
        }
        return res.toArray(new String[res.size()]);
    }
}
