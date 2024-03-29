# 495. Teemo Attacking

Our hero Teemo is attacking an enemy Ashe with poison attacks! When Teemo attacks Ashe, Ashe gets poisoned for a exactly duration seconds. More formally, an attack at second t will mean Ashe is poisoned during the inclusive time interval [t, t + duration - 1]. If Teemo attacks again before the poison effect ends, the timer for it is reset, and the poison effect will end duration seconds after the new attack.

You are given a non-decreasing integer array timeSeries, where timeSeries[i] denotes that Teemo attacks Ashe at second timeSeries[i], and an integer duration.

Return the total number of seconds that Ashe is poisoned.

**Example:**

```
Input: timeSeries = [1,2], duration = 2
Output: 3
Explanation: Teemo's attacks on Ashe go as follows:
- At second 1, Teemo attacks, and Ashe is poisoned for seconds 1 and 2.
- At second 2 however, Teemo attacks again and resets the poison timer. Ashe is poisoned for seconds 2 and 3.
Ashe is poisoned for seconds 1, 2, and 3, which is 3 seconds in total.
```


**Constraints:**

```
1 <= timeSeries.length <= 104
0 <= timeSeries[i], duration <= 107
timeSeries is sorted in non-decreasing order.
```

## Solution:

由於```timeSeries```是sorted過的, 因此for loop去算出每個攻擊間的傷害

- 攻擊時間 < 上次攻擊 + duration : 表示毒與下次攻擊有重疊, ```攻擊時間 - 上次攻擊時間``` 即為此次時間


## Code:

* java
  
```java
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0) {
            return 0;
        }
        int begin = timeSeries[0];
        int total = 0;
        for (int t : timeSeries) {
            total = total + (t < begin + duration ? t - begin : duration);
            begin = t;
        }
        return total + duration;
    }
}
```


* python

```py
class Solution:
```

* 


