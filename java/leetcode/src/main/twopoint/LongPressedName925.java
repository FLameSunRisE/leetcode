package main.twopoint;

/**
 * LongPressedName925.
 *
 * @author jay
 * @version 1.0.0
 * @date 2023/03/22
 */
public class LongPressedName925 {

  public boolean isLongPressedName(String name, String typed) {
    int tmpJ = 0;
    for (int i = 0; i < name.length(); i++) {
      char currentChar = name.charAt(i);
      for (int j = tmpJ; j < typed.length(); j++) {
         char tmpChar = typed.charAt(j);
         if (tmpChar == currentChar){
           continue;
         }
        tmpJ = j;
         break;

      }
    }
    return false;
  }
}
