1054. Distant Barcodes

In a warehouse, there is a row of barcodes, where the ith barcode is barcodes[i].

Rearrange the barcodes so that no two adjacent barcodes are equal. You may return any answer, and it is guaranteed an answer exists.


**Example 1:**
```
Input: barcodes = [1,1,1,2,2,2]
Output: [2,1,2,1,2,1]
```

**Example 2:**
```
Input: barcodes = [1,1,1,1,2,2,3,3]
Output: [1,3,1,3,1,2,1,2]
```

## Constraints:
1 <= barcodes.length <= 10000
1 <= barcodes[i] <= 10000


## Solution:
- 解題：
    
## Code:
- python3
```py3
class Solution:
    def rearrangeBarcodes(self, barcodes: List[int]) -> List[int]:
        ## 初始化array
        rsltArr = [0] * len(barcodes)
        
        ## 排序
        sortedCollect = collections.Counter(barcodes)
        sorted_by_cnt = [ ]
        ## sorterd dic to array
        for key , val in sortedCollect.most_common():
            sorted_by_cnt.extend([key] * val)
        
       
        ## 先將最多的寫入偶數位置
         count = 0
        for i  in range(0, len(barcodes), 2):
            rsltArr[i] = sorted_by_cnt[count]
            count += 1
        ## 再將其餘的補上
        for i in range(1, len(barcodes), 2):
            rsltArr[i] = sorted_by_cnt[count]
            count += 1
        
        return rsltArr
```