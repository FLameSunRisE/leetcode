package main.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * NaryTreePreorderTraversal589.
 *
 * @author jay
 * @version 1.0.0
 * @date 2023/03/06
 */
public class NaryTreePreorderTraversal589 {

  public List<Integer> preorder(Node root) {
    List<Integer> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    preorderHelper(root, result);
    return result;
  }

  private void preorderHelper(Node node, List<Integer> result) {
    if (node.children == null){
      return;
    }
    result.add(node.val);
    for (Node child : node.children) {
      preorderHelper(child, result);
    }
  }

}
