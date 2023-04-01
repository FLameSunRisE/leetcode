package main.array;

import java.util.HashMap;
import java.util.Map;

/**
 * XofaKindaDeckofCards914.
 *
 * @author jayyeh
 * @version 1.0.0
 * @date 2023/04/01
 */
public class XofaKindaDeckofCards914 {
    public boolean hasGroupsSizeX(int[] deck) {
        if (deck == null || deck.length < 2) {
            return false;
        }
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : deck) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        int gcd = -1;
        for (int count : countMap.values()) {
            if (count % 2 != 0) {
                return false;
            }
            if (gcd == -1) {
                gcd = count;
            } else {
                gcd = gcd(gcd, count);
            }
        }
        return gcd >= 2;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
