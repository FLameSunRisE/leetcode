package main.array;

/**
 * LemonadeChange860.
 *
 * @author jayyeh
 * @version 1.0.0
 * @date 2023/04/03
 */
public class LemonadeChange860 {
    public boolean lemonadeChange(int[] bills) {
        int fiveCount = 0;
        int tenCount = 0;
        for (int i = 0; i < bills.length; i++) {
            int cur = bills[i];
            if (cur == 5) {
                fiveCount++;
            } else if (cur == 10) {
                if (fiveCount >= 1) {
                    fiveCount--;
                    tenCount++;
                } else {
                    return false;
                }
            } else {
                if (tenCount >= 1 && fiveCount >= 1) {
                    tenCount--;
                    fiveCount--;
                } else if (fiveCount >= 3) {
                    fiveCount -= 3;
                } else {
                    return false;
                }
            }
            if (check(fiveCount, tenCount)){
                return false;
            }
        }
        if (check(fiveCount, tenCount)){
            return false;
        }
        return true;
    }

    private static boolean check(int fiveCount, int tenCount) {
        return tenCount < 0 || fiveCount < 0;
    }
}
