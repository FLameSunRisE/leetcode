package main.dp;

import java.util.ArrayList;
import java.util.List;

/**
 * GenerateParentheses22.
 *
 * @author jayyeh
 * @version 1.0.0
 * @date 2023/04/12
 */
public class GenerateParentheses22 {

    public List<String> generateParenthesis(int n) {
        System.out.println("===================================================");
        System.out.println("GenerateParentheses22.generateParenthesis");
        List<String> list = new ArrayList<String>();
        backtrack(list, "", 0, 0, n);
        return list;
    }

    public void backtrack(List<String> list, String str, int open, int close, int max) {
        System.out.println("[GenerateParentheses22.recurse]open: " + open + ", close: " + close + ", str: " + str.toString() + ", max: " + max);
        if (str.length() == max * 2) {
            list.add(str);
            System.out.println("[sb.length() == n * 2] res = " + str.toString());
            return;
        }
        if (open < max) {
            System.out.println("[open < max]before backtrack > str = " + str);
            backtrack(list, str + "(", open + 1, close, max);
            System.out.println("[open < max]after backtrack > str = " + str);
        }
        if (close < open) {
            System.out.println("[close < open]before backtrack > str = " + str);
            backtrack(list, str + ")", open, close + 1, max);
            System.out.println("[close < open]after backtrack > str = " + str);
        }
    }


    public List<String> generateParenthesis_1(int n) {
        System.out.println("===================================================");
        System.out.println("GenerateParentheses22.generateParenthesis");
        List<String> res = new ArrayList<>();
        recurse(res, 0, 0, new StringBuilder(), n);
        return res;
    }

    public void recurse(List<String> res, int left, int right, StringBuilder sb, int n) {
        System.out.println("[GenerateParentheses22.recurse]left: " + left + ", right: " + right + ", sb: " + sb.toString() + ", n: " + n);
        if (sb.length() == n * 2) {
            res.add(sb.toString());
            System.out.println("[sb.length() == n * 2] res = " + res.toString());
            return;
        }

        if (left < n) {
            recurse(res, left + 1, right, sb.append("("), n);
            System.out.println("[left < n]before length -1 > res = " + sb.toString());
            sb.setLength(sb.length() - 1);
            System.out.println("[left < n]after length -1 > res = " + sb.toString());
        }

        if (right < left) {
            recurse(res, left, right + 1, sb.append(")"), n);
            System.out.println("[right < left]before length -1 > res = " + sb.toString());
            sb.setLength(sb.length() - 1);
            System.out.println("[right < left]after length -1 > res = " + sb.toString());
        }
    }
}
