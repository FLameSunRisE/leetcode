1309. Decrypt String from Alphabet to Integer Mapping

Given a string s formed by digits ('0' - '9') and '#' . We want to map s to English lowercase characters as follows:

Characters ('a' to 'i') are represented by ('1' to '9') respectively.
Characters ('j' to 'z') are represented by ('10#' to '26#') respectively. 
Return the string formed after mapping.

It's guaranteed that a unique mapping will always exist.

 

**Example 1:**

Input: s = "10#11#12"
Output: "jkab"
Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".

**Example 2:**

Input: s = "1326#"
Output: "acz"


**Example 3:**

Input: s = "25#"
Output: "y"


**Example 4:**

Input: s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"
Output: "abcdefghijklmnopqrstuvwxyz"
 

## Solution:
- 題目說明：
    這題就只是簡單的字串轉換，只需要將字串的位址轉換為字母即可。

- 解題：
    只要找出#的符號另外處理，其餘透過charAt方法就可以解決。


    參考：
        - [LeetCode 1309. 解码字母到整数映射](https://developer.aliyun.com/article/766049)

## Code:
- java
```java
  class Solution {
    public String freqAlphabets(String s) {
        String rtnAns = "";
        int index = 0;
        while(index<s.length()){
            if(index < s.length() - 2 && s.charAt(index + 2) == '#'){
                int num = Integer.parseInt(s.substring(index, index + 2));
                rtnAns += (char)(num + 96);
                index = index + 3;
                continue;
            }
            rtnAns += (char)(97 + s.charAt(index) - '1');
            index++;
        }
        return rtnAns;
    }
}
```

- javascript
```js
```