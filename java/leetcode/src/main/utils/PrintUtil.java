package main.utils;

import java.util.Set;

public class PrintUtil {

  public String printSet(Set<Character> set) {
    StringBuilder sb = new StringBuilder();
    for (Character c : set) {
      sb.append(c);
    }
    String result = sb.toString();
    return result;
  }

}
