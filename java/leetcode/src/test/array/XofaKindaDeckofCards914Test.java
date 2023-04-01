package test.array;

import main.array.XofaKindaDeckofCards914;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class XofaKindaDeckofCards914Test {

    private XofaKindaDeckofCards914 solution;

    @BeforeEach
    void setUp() {
        this.solution = new XofaKindaDeckofCards914();
    }


    @Test
    public void test1() {
        int[] deck = {1, 1, 1, 2, 2, 2, 3, 3};
        boolean expected = false;
        boolean actual = solution.hasGroupsSizeX(deck);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        int[] deck = {1, 1, 2, 2, 2, 2};
        boolean expected = true;
        boolean actual = solution.hasGroupsSizeX(deck);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        int[] deck = {1, 1, 1, 1, 2, 2, 2, 2, 2, 2};
        boolean expected = true;
        boolean actual = solution.hasGroupsSizeX(deck);
        Assertions.assertEquals(expected, actual);
    }
}