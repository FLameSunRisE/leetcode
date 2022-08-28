package leetcode.src.tree;

/**
 * Created by jayyeh on 2022/07/29
 *
 * <p>
 * Given two binary strings, return their sum (also a binary string).
 *
 * <p>
 * For example, a = "11" b = "1" Return "100".
 */
public class SymmetricTree {

  /**
   * Main method
   *
   * @param args
   */
  public static void main(String[] args) {
    System.out.println();
    // Input: root = [1,2,2,3,4,4,3]
    // Output: true
//    System.out.println(new SymmetricTree().isSymmetric([1,2,2,3,4,4,3]));
    // Input: root = [1,2,2,null,3,null,3]
    // Output: false
//    System.out.println(new SymmetricTree().isSymmetric([1,2,2,null,3,null,3]);
  }

  /**
   * Definition for a binary tree node
   */
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
  }
  class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return isSymmetricHelp(root.left, root.right);
    }

    private boolean isSymmetricHelp(TreeNode left, TreeNode right){
        if(left==null || right==null){
            return left==right;
        }
        if(left.val!=right.val){
            return false;
        }
        return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
    }
  }
}
