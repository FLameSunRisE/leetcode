package test.binarysearch;

import static org.junit.jupiter.api.Assertions.*;

import main.binarysearch.FirstBadVersion278;
import main.linklist.ReverseLinkedList206;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FirstBadVersion278Test {

    private FirstBadVersion278 solution;

    @BeforeEach
    public void setUp() {
        this.solution = new FirstBadVersion278();
    }

    private boolean isBadVersion(int version) {
        // Implementation goes here.
        return true;
    }

    @Test
    public void testFirstBadVersion() {
        // Number of versions.
        int n = 5;
        // Index of the first bad version.
        int bad = 4;

        // Test that the correct bad version is returned.
        int result = solution.firstBadVersion(n);
        Assertions.assertEquals(bad, result, "Expected bad version to be " + bad + ", but was " + result);
    }

}