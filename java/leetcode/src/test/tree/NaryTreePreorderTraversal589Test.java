package test.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import main.tree.NaryTreePreorderTraversal589;
import main.tree.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * NaryTreePreorderTraversal589Test-TODO(jay),testcase有問題.
 *
 * @author jay
 * @version 1.0.0
 * @date 2023/03/07
 */
class NaryTreePreorderTraversal589Test {

  private NaryTreePreorderTraversal589 solution;

  @BeforeEach
  void setUp() {
    this.solution = new NaryTreePreorderTraversal589();
  }

  /*
  第一個案例測試一棵多元樹，檢查它的先序遍歷結果是否為預期的值。
  Input: root = [1,null,3,2,4,null,5,6]
  Output: [1,3,5,6,2,4]
   */
  @Test
  public void exampleTest1() {
    Node n5 = new Node(5);
    Node n6 = new Node(6);
    Node n3 = new Node(3, Arrays.asList(n5, n6));
    Node n2 = new Node(2);
    Node n4 = new Node(4);
    Node n1 = new Node(1, Arrays.asList(n3, n2, n4));
    List<Integer> expected = Arrays.asList(1, 3, 5, 6, 2, 4);
    assertEquals(expected, solution.preorder(n1));
  }

  //  第二個案例測試一個深度為2的多元樹，檢查它的先序遍歷結果是否為預期的值。
  //  Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
  //  Output: [1,2,3,6,7,11,14,4,8,12,5,9,13,10]
  @Test
  public void exampleTest2() {
    Node n11 = new Node(11);
    Node n13 = new Node(13);
    Node n10 = new Node(10, Arrays.asList(n13));
    Node n9 = new Node(9, Arrays.asList(n11));
    Node n8 = new Node(8, Arrays.asList(n9, n10));
    Node n7 = new Node(7);
    Node n6_2 = new Node(6);
    Node n12 = new Node(12);
    Node n5_2 = new Node(5, Arrays.asList(n12));
    Node n4_2 = new Node(4, Arrays.asList(n7));
    Node n3_2 = new Node(3, Arrays.asList(n6_2, n8));
    Node n2_2 = new Node(2, Arrays.asList(n4_2, n5_2));
    Node n1_2 = new Node(1, Arrays.asList(n2_2, n3_2));
    List<Integer> expected2 = Arrays.asList(1, 2, 4, 7, 3, 6, 9, 11, 10, 5, 12, 13);
    assertEquals(expected2, solution.preorder(n1_2));
  }

}