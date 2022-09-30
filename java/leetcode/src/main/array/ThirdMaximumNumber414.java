package main.array;

/**
 * @author User
 */
public class ThirdMaximumNumber414 {
    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println();
        //Input: nums = [3,2,1]
        //Output: 1
        int[] list = {3, 2, 1};
        System.out.println(new ThirdMaximumNumber414().thirdMax(list));
        System.out.println("========================");
        //Input: nums = [1,2]
        //Output: 2
        list = new int[]{1, 2};
        System.out.println(new ThirdMaximumNumber414().thirdMax(list));
        System.out.println("========================");
        //Input: nums = [2,2,3,1]
        //Output: 1
        list = new int[]{2,2,3,1};
        System.out.println(new ThirdMaximumNumber414().thirdMax(list));
        System.out.println("========================");


    }

    /**
     * @param nums
     * @return
     */
    public int thirdMax(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Integer maxOne = null;
        Integer maxTwo = null;
        Integer maxThree = null;
        for (Integer num : nums) {
            if (num.equals(maxOne) || num.equals(maxTwo) || num.equals(maxThree)) {
                continue;
            }
            if (maxOne == null || num > maxOne) {
                maxThree = maxTwo;
                maxTwo = maxOne;
                maxOne = num;
            } else if (maxTwo == null || num > maxTwo) {
                maxThree = maxTwo;
                maxTwo = num;
            } else if (maxThree == null || num > maxThree) {
                maxThree = num;
            }
        }
        return maxThree == null ? maxOne : maxThree;
    }
}
