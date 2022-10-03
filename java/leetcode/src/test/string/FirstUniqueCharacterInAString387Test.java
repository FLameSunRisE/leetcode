package test.string;

import jdk.jfr.Description;
import main.string.FirstUniqueCharacterInAString387;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueCharacterInAString387Test {

    private FirstUniqueCharacterInAString387 target = new FirstUniqueCharacterInAString387();

    @Test
    void firstUniqChar() {
        String s = "leetcode";
        Assertions.assertEquals(0, target.firstUniqChar(s));
    }

    @Test
    void firstUniqChar1() {
        String s = "loveleetcode";
        Assertions.assertEquals(2, target.firstUniqChar(s));
    }

    @Test
    void firstUniqChar2() {
        String s = "aabb";
        Assertions.assertEquals(-1, target.firstUniqChar(s));
    }
}