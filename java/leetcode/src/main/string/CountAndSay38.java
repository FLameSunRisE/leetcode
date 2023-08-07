package main.string;

/**
 * CountAndSay38.
 *
 * @author jayyeh
 * @version 1.0.0
 * @date 2023/08/07
 */
public class CountAndSay38 {

  public String countAndSay(int n) {
    if (n == 1) {
      return "1";
    }

    String result = "1";
    for (int i = 2; i <= n; i++) {
      StringBuilder nowStr = new StringBuilder();
      int left = 0;
      int right = 0;

      while (right < result.length()) {
        // 移動右指針，找到連續重複數字的結束位置
        while (right < result.length() && result.charAt(left) == result.charAt(right)) {
          right++;
        }
        // 計算連續重複數字的數量
        int count = right - left;
        // 拼接重複數字的數量和該數字本身，添加到新的報數序列 nowStr 中
        nowStr.append(count).append(result.charAt(left));
        left = right;
      }
      result = nowStr.toString();
    }
    return result;
  }
}
