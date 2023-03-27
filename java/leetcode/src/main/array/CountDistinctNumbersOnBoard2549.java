package main.array;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctNumbersOnBoard2549 {

  public int distinctIntegers(int n) {
    Set<Integer> storeSet = new HashSet<>();
    if (n == 1) {
      return 1;
    }
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (i % j == 1) {
          storeSet.add(j);
        }
      }
    }
    return storeSet.size();
  }
}
