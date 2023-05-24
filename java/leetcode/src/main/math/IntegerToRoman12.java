package main.math;

import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerToRoman12 {

  public String intToRoman(int num) {
//    return this.intToRoman_first(num);
    return this.intToRoman_opt(num);
  }

  public String intToRoman_first(int num) {
    // 创建整数与罗马数字的对应关系表
    Map<Integer, String> symbolMap = new LinkedHashMap<>();
    symbolMap.put(1000, "M");
    symbolMap.put(900, "CM");
    symbolMap.put(500, "D");
    symbolMap.put(400, "CD");
    symbolMap.put(100, "C");
    symbolMap.put(90, "XC");
    symbolMap.put(50, "L");
    symbolMap.put(40, "XL");
    symbolMap.put(10, "X");
    symbolMap.put(9, "IX");
    symbolMap.put(5, "V");
    symbolMap.put(4, "IV");
    symbolMap.put(1, "I");

    StringBuilder roman = new StringBuilder();
    // 逐位转换整数为罗马数字
    for (Map.Entry<Integer, String> entry : symbolMap.entrySet()) {
      int value = entry.getKey();
      String symbol = entry.getValue();
      while (num >= value) {
        roman.append(symbol);
        num -= value;
      }
    }
    return roman.toString();
  }

  /**
   * intToRoman_opt.
   * time
   *
   * @param num
   * @return {@link String }
   */
  public String intToRoman_opt(int num) {
    String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    String[] hrns = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    String[] ths = {"", "M", "MM", "MMM"};

    return ths[num / 1000] + hrns[(num % 1000) / 100] + tens[(num % 100) / 10] + ones[num % 10];
  }
}
