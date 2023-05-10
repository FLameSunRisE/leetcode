package main.string;

import java.util.Stack;

public class ValidParentheses20 {

  /**
   * isValid.
   *   1. 排除基本異常條件:單數判斷
   *   2. 使用stack存放
   *     2.1. 如果是開頭符號則丟進去
   *     2.2. 反之,則判斷是否一組
   *       - 同組: pop一層
   *       - 不同: return false
   *
   * time complexity: O(n)
   * space complexity: O(n)
   *
   * @param s
   * @return boolean
   */
  public boolean isValid(String s) {
    if (s.length() % 2 != 0) {
      return false;
    }
    Stack<Character> stack = new Stack();
    for (char c : s.toCharArray()) {
      if (c == '(' || c == '[' || c == '{') {
        stack.push(c);
      }else{
        Character top = stack.pop();
        if (c == ')' && top != '('){
          return false;
        }
        if (c == ']' && top != '['){
          return false;
        }
        if (c == '}' && top != '{'){
          return false;
        }
      }
    }
    return stack.isEmpty();
  }
}
