package leetcode.src.array;

import java.util.*;

/**
 * @author jay
 */
public class FindtheDistanceValueBetweenTwoArrays1385 {
    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println();
        // Input: arr1 = [4,5,8], arr2 = [10,9,1,8], d = 2
        // Output: 2
        int[] list1 = {4, 5, 8};
        int[] list2 = {10, 9, 1, 8};
        int d = 2;
        System.out.println(new FindtheDistanceValueBetweenTwoArrays1385().findTheDistanceValue(list1, list2, d));
        // Input: arr1 = [1,4,2,3], arr2 = [-4,-3,6,10,20,30], d = 3
        // Output: 2
        list1 = new int[]{1, 4, 2, 3};
        list2 = new int[]{-4, -3, 6, 10, 20, 30};
        d = 2;
        System.out.println(new FindtheDistanceValueBetweenTwoArrays1385().findTheDistanceValue(list1, list2, d));
        // Input: arr1 = [2,1,100,3], arr2 = [-5,-2,10,-3,7], d = 6
        // Output: 1
        list1 = new int[]{2, 1, 100, 3};
        list2 = new int[]{-5, -2, 10, -3, 7};
        d = 1;
        System.out.println(new FindtheDistanceValueBetweenTwoArrays1385().findTheDistanceValue(list1, list2, d));
    }

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
//        Arrays.sort(arr2);
        int count = arr1.length;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (Math.abs(arr1[i] - arr2[j]) <= d) {
                    count -= 1;
                    break;
                }
            }
        }
        return count;
    }
}
