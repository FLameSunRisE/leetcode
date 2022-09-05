package string;

import java.util.*;

/**
 * Created by jayyeh on 2022/07/29
 * @author Jay
 */
public class AreNumbersAscending {
    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println();
        // Input: s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles"
        // Output: true
        // Explanation: The numbers in s are: 1, 3, 4, 6, 12.
        String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        System.out.println(new AreNumbersAscending().areNumbersAscending(s));
        // Input: s = "hello world 5 x 5"
        // Output: false
        // Explanation: The numbers in s are: 5, 5. They are not strictly increasing.
        s = "hello world 5 x 5";
        System.out.println(new AreNumbersAscending().areNumbersAscending(s));
        // Input: s = "sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s"
        // Output: false
        // Explanation: The numbers in s are: 7, 51, 50, 60. They are not strictly increasing.
        s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        System.out.println(new AreNumbersAscending().areNumbersAscending(s));
    }

    public boolean areNumbersAscending(String s) {
        int prev = 0;
        for (String token : s.split(" ")) {
            try {
                int number = Integer.parseInt(token);
                if (number <= prev) {
                    return false;
                }
                prev = number;
            } catch (Exception e) {
            }
        }
        return true;
    }
}
