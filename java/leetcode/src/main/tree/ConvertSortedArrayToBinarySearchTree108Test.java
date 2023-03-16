package main.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertSortedArrayToBinarySearchTree108Test {

    private ConvertSortedArrayToBinarySearchTree108 solution;

    @BeforeEach
    void setUp() {
        this.solution = new ConvertSortedArrayToBinarySearchTree108();
    }

    @Test
    public void test1() {
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode result = solution.sortedArrayToBST(nums);
        Assertions.assertEquals(0, result.val);
        Assertions.assertEquals(-10, result.left.val);
        Assertions.assertEquals(-3, result.left.right.val);
        Assertions.assertEquals(5, result.right.val);
        Assertions.assertEquals(9, result.right.right.val);
    }

    @Test
    public void test2() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        TreeNode result = solution.sortedArrayToBST(nums);
        Assertions.assertEquals(4, result.val);
        Assertions.assertEquals(2, result.left.val);
        Assertions.assertEquals(1, result.left.left.val);
        Assertions.assertEquals(3, result.left.right.val);
        Assertions.assertEquals(6, result.right.val);
        Assertions.assertEquals(5, result.right.left.val);
        Assertions.assertEquals(7, result.right.right.val);
    }

    @Test
    public void test3() {
        int[] nums = {1};
        TreeNode result = solution.sortedArrayToBST(nums);
        Assertions.assertEquals(1, result.val);
    }

    @Test
    public void test4() {
        int[] nums = {};
        TreeNode result = solution.sortedArrayToBST(nums);
        Assertions.assertNull(result);
    }
}