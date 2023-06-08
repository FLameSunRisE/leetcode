package main.array;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LongestWordInDictionaryThroughDeleting524Test {

  private LongestWordInDictionaryThroughDeleting524 solution;

  @BeforeEach
  void setUp() {
    this.solution = new LongestWordInDictionaryThroughDeleting524();
  }


  @Test
  public void testFindLongestWord_case1() {
    String s = "abpcplea";
    List<String> dictionary = new ArrayList<>();
    dictionary.add("ale");
    dictionary.add("apple");
    dictionary.add("monkey");
    dictionary.add("plea");
    String expected = "apple";
    String result = solution.findLongestWord(s, dictionary);
    Assertions.assertEquals(expected, result);
  }

  @Test
  public void testFindLongestWord_case2() {
    String s = "abpcplea";
    List<String> dictionary = new ArrayList<>();
    dictionary.add("a");
    dictionary.add("b");
    dictionary.add("c");
    String expected = "a";
    String result = solution.findLongestWord(s, dictionary);
    Assertions.assertEquals(expected, result);
  }
}