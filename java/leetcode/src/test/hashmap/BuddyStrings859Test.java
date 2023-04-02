package test.hashmap;

import main.hashmap.BuddyStrings859;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BuddyStrings859Test {

    private BuddyStrings859 solution;

    @BeforeEach
    void setUp() {
        this.solution = new BuddyStrings859();
    }

    @Test
    public void testBuddyStrings1() {
        String a = "ab";
        String b = "ba";
        assertTrue(solution.buddyStrings(a, b));
    }

    @Test
    public void testBuddyStrings2() {
        String a = "ab";
        String b = "ab";
        assertFalse(solution.buddyStrings(a, b));
    }

    @Test
    public void testBuddyStrings3() {
        String a = "aa";
        String b = "aa";
        assertTrue(solution.buddyStrings(a, b));
    }

    @Test
    public void testBuddyStrings4() {
        String a = "aaaaaaabc";
        String b = "aaaaaaacb";
        assertTrue(solution.buddyStrings(a, b));
    }

    @Test
    public void testBuddyStrings5() {
        String a = "";
        String b = "aa";
        assertFalse(solution.buddyStrings(a, b));
    }

    @Test
    public void testBuddyStrings6() {
        String a = "abcd";
        String b = "badc";
        assertFalse(solution.buddyStrings(a, b));
    }
}