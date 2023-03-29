package test.hashmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import main.hashmap.GroupAnagrams49;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GroupAnagrams49Test {
  private GroupAnagrams49 solution;

  @BeforeEach
  void setUp() {
    this.solution = new GroupAnagrams49();
  }

  @Test
  public void testGroupAnagrams() {
    String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
    List<List<String>> expected = Arrays.asList(
        Arrays.asList("ate", "eat", "tea"),
        Arrays.asList("bat"),
        Arrays.asList("nat", "tan")

    );

    List<List<String>> actual = solution.groupAnagrams(strs);

    Assertions.assertEquals(expected.size(), actual.size());

    // Sort each group and compare with expected
    for (int i = 0; i < expected.size(); i++) {
      List<String> expectedGroup = expected.get(i).stream().sorted().collect(Collectors.toList());
      List<String> actualGroup = actual.get(i).stream().sorted().collect(Collectors.toList());
      Assertions.assertEquals(expectedGroup, actualGroup);
    }
  }

  @Test
  public void testGroupAnagrams_EmptyInput() {
    String[] strs = {};
    List<List<String>> expected = Arrays.asList();

    List<List<String>> actual = solution.groupAnagrams(strs);

    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void testGroupAnagrams_SingleString() {
    String[] strs = {"abc"};
    List<List<String>> expected = Arrays.asList(Arrays.asList("abc"));

    List<List<String>> actual = solution.groupAnagrams(strs);

    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void testGroupAnagrams_SameString() {
    String[] strs = {"abc", "abc", "abc"};
    List<List<String>> expected = Arrays.asList(Arrays.asList("abc", "abc", "abc"));

    List<List<String>> actual = solution.groupAnagrams(strs);

    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void testGroupAnagrams_NoAnagrams() {
    String[] strs = {"abc", "def", "xyz"};
    List<List<String>> expected = Arrays.asList(
        Arrays.asList("abc"),
        Arrays.asList("def"),
        Arrays.asList("xyz")
    );

    List<List<String>> actual = solution.groupAnagrams(strs);

    Assertions.assertEquals(expected, actual);
  }
}