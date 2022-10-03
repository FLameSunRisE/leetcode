# 387. First Unique Character in a String

Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.


**Example:**

```
Input: s = "leetcode"
Output: 0
```

**Example:**

```
Input: s = "loveleetcode"
Output: 2
```

**Example:**

```
Input: s = "aabb"
Output: -1
```


## Solution :

這題主要是找第一個```唯一的```char, 因此for loop並且比對index即可。

## Code:

* java
  
```java
class Solution {
    public int firstUniqChar(String s) {
        Integer index = null;
        Integer lastIndex = null;
        for(char c : s.toCharArray()){
            index = s.indexOf(c);
            lastIndex = s.lastIndexOf(c);
            if(index.equals(lastIndex)) {
                return index;
            }
        }
        return -1;
    }
}
```


* python

```py
class Solution:

```

