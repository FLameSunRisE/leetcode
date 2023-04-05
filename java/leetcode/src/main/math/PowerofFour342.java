package main.math;

/**
 * PowerofFour342.
 *
 * @author jayyeh
 * @version 1.0.0
 * @date 2023/04/05
 */
public class PowerofFour342 {
    public boolean isPowerOfFour(int n) {
        if (n == 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        while (n % 4 == 0) {
            n = n / 4;
        }
        return n == 1;
    }
}
