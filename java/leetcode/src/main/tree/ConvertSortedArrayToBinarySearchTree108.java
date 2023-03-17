package main.tree;

/**
 * ConvertSortedArraytoBinarySearchTree108.
 *
 * @author jayyeh
 * @version 1.0.0
 * @date 2023/03/16
 */
public class ConvertSortedArrayToBinarySearchTree108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, left, mid - 1);
        root.right = helper(nums, mid + 1, right);
        return root;
    }
}
