package test.hashmap;

import main.hashmap.FindCommonCharacters1002;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FindCommonCharacters1002Test {

    private FindCommonCharacters1002 solution;

    @BeforeEach
    void setUp() {
        this.solution = new FindCommonCharacters1002();
    }

    @Test
    public void test1() {
        String[] words = {"bella", "label", "roller"};
        String[] expected = {"e", "l", "l"};
        assertArrayEquals(expected, solution.commonChars(words));
    }

    @Test
    public void test2() {
        String[] words = {"cool", "lock", "cook"};
        String[] expected = {"c", "o"};
        assertArrayEquals(expected, solution.commonChars(words));
    }
}