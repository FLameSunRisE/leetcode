# 125. Valid Palindrome

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.


**Example:**

```
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
```

**Example:**

```
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
```


**Example:**

```
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
```


## Constraints:

```
1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
```

## Solution:

用前後```pointer```去比對,略過非英文數字的字元,比對失敗就return false, 反之繼續比對,直到while結束

## code:


- java
  - Code
    ```java
    class Solution {
        public boolean isPalindrome(String s) {
            int bottomPoint = 0;
            int hightPoint = s.length() - 1;
            char bottomPointCh, hightPointCh;
            while (bottomPoint < hightPoint) {
                bottomPointCh = s.charAt(bottomPoint);
                if (!Character.isLetterOrDigit(bottomPointCh)) {
                    bottomPoint++;
                    continue;
                }
                hightPointCh = s.charAt(hightPoint);
                if (!Character.isLetterOrDigit(hightPointCh)) {
                    hightPoint--;
                    continue;
                }
                if (Character.toLowerCase(bottomPointCh) != Character.toLowerCase(hightPointCh)) {
                    return false;
                }
                bottomPoint++;
                hightPoint--;
            }
            return true;
        }
    }
    ```

- python

```py
```



