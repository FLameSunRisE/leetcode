1528. Check Array Formation Through Concatenation

You are given an array of distinct integers arr and an array of integer arrays pieces, where the integers in pieces are distinct. Your goal is to form arr by concatenating the arrays in pieces in any order. However, you are not allowed to reorder the integers in each array pieces[i].

Return true if it is possible to form the array arr from pieces. Otherwise, return false.

**Example 1:**
```
Input: arr = [85], pieces = [[85]]
Output: true
```

**Example 2:**
```
Input: arr = [15,88], pieces = [[88],[15]]
Output: true
Explanation: Concatenate [15] then [88]
```

**Example 3:**
```
Input: arr = [49,18,16], pieces = [[16,18,49]]
Output: false
Explanation: Even though the numbers match, we cannot reorder pieces[0].
```

**Example 4:**
```
Input: arr = [91,4,64,78], pieces = [[78],[4,64],[91]]
Output: true
Explanation: Concatenate [91] then [4,64] then [78]
```

**Example 5:**
```
Input: arr = [1,3,5,7], pieces = [[2,4,6,8]]
Output: false
```


## Constraints:

1 <= pieces.length <= arr.length <= 100
sum(pieces[i].length) == arr.length
1 <= pieces[i].length <= arr.length
1 <= arr[i], pieces[i][j] <= 100
The integers in arr are distinct.
The integers in pieces are distinct (i.e., If we flatten pieces in a 1D array, all the integers in this array are distinct).



## Solution:
- 題目說明：
    給你一組array，當中每個數字皆不相同，另有一組pieces的陣列中整數也不相同。 以任意順序的與pieces中的陣列形成array，但不可以對pieces內的整數重新排序。

- 解題：
    首先須紀錄pieces陣列中的整數記錄在map之中，再loop 第一組array去找尋是否存在於map之中，若存在則存入rslt的陣列中，最後再比對兩組陣列確認是否一致即為正解。
        
## Code:
- python3
```py3
class Solution(object):
    def canFormArray(self, arr, pieces):
        """
        :type arr: List[int]
        :type pieces: List[List[int]]
        :rtype: bool
        """
        saveMap = {};
        rslt = []
        for data in pieces:
            saveMap[data[0]] = data
        for num in arr:
            rslt += saveMap.get(num, [])
            
        return rslt == arr
```