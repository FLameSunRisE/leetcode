1304. Find N Unique Integers Sum up to Zero


Given an integer n, return any array containing n unique integers such that they add up to 0.

 

**Example 1:**

Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].

**Example 2:**

Input: n = 3
Output: [-1,0,1]
Example 3:

Input: n = 1
Output: [0]
 

Constraints:

1 <= n <= 1000

## Solution:
- 題目說明：
    給一個陣列長度 n ，其陣列內的數值皆為唯一值，且其內部數值加總需等於0．
- 解題：
    解題一：
        由於只要是唯一值且加總等於零，因此透過流水號的方式加總，最後再透過減掉總數，即可達成加總為零的目標．
    解題二：
        RULE : A[i] = i * 2 - n + 1
        可參考下方連結．


    參考：
        - [Java/C++/Python Find the Rule](https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/discuss/465585/JavaC%2B%2BPython-Find-the-Rule)
        - [Keep it simple. Add all values till n-1 and then balance it with -sum.](https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/discuss/463998/Keep-it-simple.-Add-all-values-till-n-1-and-then-balance-it-with-sum.)
## Code:
- java
```java
  class Solution1 {
    public int[] sumZero(int n) {
        int[] rslt = new int[n];
        int sum = 0;
        for(int i = 0; i < n-1; i++) {
            arr[i] = i+1;
            sum += arr[i];
        }
        arr[n-1] = -sum;
        return rslt;
    }

    class Solution2 {
    public int[] sumZero(int n) {
        int[] rslt = new int[n];
        for(int i=0; i< n ; i++){
            int tmp = 2 * i - n + 1 ;
            rslt[i] = tmp;
        }
        return rslt;
    }
}
```

- javascript
```js
```