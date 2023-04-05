# 342. Power of Four

Given an integer n, return true if it is a power of four. Otherwise, return false.

An integer n is a power of four, if there exists an integer x such that n == 4x.

**Example:**

```txt
Input: n = 16
Output: true
```

**Example:**

```txt
Input: n = 5
Output: false
```

**Example:**

```txt
Input: n = 1
Output: true
```

**Constraints:**

```txt
-231 <= n <= 231 - 1
```

## Solution

- 基本檢核0,1
- loop除以4直到整除為止

## Code

- java
  
```java
class Solution {
    public boolean isPowerOfFour(int n) {
        if (n == 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        while (n % 4 == 0) {
            n = n / 4;
        }
        return n == 1;
    }
}
```
