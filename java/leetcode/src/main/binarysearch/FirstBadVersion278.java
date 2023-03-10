package main.binarysearch;

/**
 * FirstBadVersion278.
 *
 * @author jay
 * @version 1.0.0
 * @date 2023/03/09
 */
public class FirstBadVersion278 {

  boolean isBadVersion(int version){
    int bad = 4;
    if (bad <= version){
      return true;
    }
    return false;
  }

  public int firstBadVersion(int n) {
    int left = 1;
    int right = n;

    while (left < right) {
      int mid = left + (right - left) / 2;
      if (isBadVersion(mid)) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }

    return left;
  }

}
