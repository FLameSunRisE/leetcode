package test.tree;

import main.tree.PathSum112;
import main.tree.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PathSum112Test {

    private PathSum112 solution;

    @BeforeEach
    void setUp() {
        this.solution = new PathSum112();
    }

    @Test
    public void testPathSum_True() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
        assertTrue(solution.hasPathSum(root, 22));
    }

    @Test
    public void testPathSum_False() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        assertFalse(solution.hasPathSum(root, 5));
    }
    @Test
    public void testPathSum_Null() {
        assertFalse(solution.hasPathSum(null, 1));
    }
}