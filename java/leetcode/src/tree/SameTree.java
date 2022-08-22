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
public class SameTree {

  /**
   * Main method
   *
   * @param args
   */
  public static void main(String[] args) {
    System.out.println();
    // Input: p = [1,2,3], q = [1,2,3]
    // Output: true
    System.out.println(new SameTree().isSameTree([1,2,3], [1,2,3]));
    // Input: p = [1,2], q = [1,null,2]
    // Output: false
    System.out.println(new SameTree().isSameTree([1,2], [1,null,2]);
    // Input: p = [1,2,1], q = [1,1,2]
    // Output: false
    System.out.println(new SameTree().isSameTree([1,2,1], [1,1,2]));
  }

  public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }

  public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
      return true;
    }
    if (p == null || q == null) {
      return false;
    }
    if (p.val == q.val) {
      return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    return false;
  }
}
