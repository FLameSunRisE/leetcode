package main.tree;

/**
 * TreeNode.
 *
 * @author jayyeh
 * @version 1.0.0
 * @date 2023/03/16
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}