package test.tree;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import main.tree.BinaryTreePaths257;
import main.tree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinaryTreePaths257Test {

  private BinaryTreePaths257 solution;

  @BeforeEach
  void setUp() {
    this.solution = new BinaryTreePaths257();
  }

  @Test
  public void testBinaryTreePaths() {
    // 构建二叉树
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.right = new TreeNode(5);

    // 预期结果
    List<String> expected = Arrays.asList("1->2->5", "1->3");

    // 执行方法
    List<String> result = solution.binaryTreePaths(root);

    // 断言结果
    Assertions.assertEquals(expected, result);
  }
}