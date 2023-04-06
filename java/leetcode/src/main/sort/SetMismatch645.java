package main.sort;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * SetMismatch645.
 *
 * @author jayyeh
 * @version 1.0.0
 * @date 2023/04/06
 */
public class SetMismatch645 {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer, Integer> tmpMap = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            tmpMap.put(nums[i], tmpMap.getOrDefault(nums[i], 0) + 1);
        }
        res[0] = tmpMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 2)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
        int[] missingNums = IntStream.rangeClosed(1, nums.length + 1)
                .filter(i -> !tmpMap.containsKey(i))
                .toArray();
        res[1] = missingNums[0];
        return res;
    }

    public int[] findErrorNums_sort(int[] nums) {
        int[] result = new int[2];
        int n = nums.length;
        // 存储每个数字是否存在的数组
        boolean[] exists = new boolean[n + 1];
        // 记录重复的数
        int duplicate = 0;
        // 记录缺失的数
        int missing = 0;
        for (int i = 0; i < n; i++) {
            if (exists[nums[i]]) {
                duplicate = nums[i];
            }
            exists[nums[i]] = true;
        }
        for (int i = 1; i <= n; i++) {
            // 如果数字不存在，则找到了缺失的数
            if (!exists[i]) {
                missing = i;
                break;
            }
        }
        result[0] = duplicate;
        result[1] = missing;
        return result;
    }
}
