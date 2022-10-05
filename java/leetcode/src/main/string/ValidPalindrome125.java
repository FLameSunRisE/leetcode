package main.string;

/**
 * Created by jayyeh on 2022/07/29
 *
 * @author Jay
 */
public class ValidPalindrome125 {
    public static void main(String[] args) {
    }

    public boolean isPalindrome(String s) {
        int bottomPoint = 0;
        int hightPoint = s.length() - 1;
        char bottomPointCh, hightPointCh;
        while (bottomPoint < hightPoint) {
            bottomPointCh = s.charAt(bottomPoint);
            if (!Character.isLetterOrDigit(bottomPointCh)) {
                bottomPoint++;
                continue;
            }
            hightPointCh = s.charAt(hightPoint);
            if (!Character.isLetterOrDigit(hightPointCh)) {
                hightPoint--;
                continue;
            }
            if (Character.toLowerCase(bottomPointCh) != Character.toLowerCase(hightPointCh)) {
                return false;
            }
            bottomPoint++;
            hightPoint--;
        }
        return true;
    }
}
