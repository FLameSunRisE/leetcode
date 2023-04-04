package test.string;

import main.string.AddStrings415;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AddStrings415Test {

    private AddStrings415 solution;

    @BeforeEach
    void setUp() {
        this.solution = new AddStrings415();
    }


    @Test
    void example1() {
        String num1 = "11";
        String num2 = "123";
        String expected = "134";
        Assertions.assertEquals(expected, solution.addStrings(num1, num2));
    }

    @Test
    void example2() {
        String num1 = "456";
        String num2 = "77";
        String expected = "533";
        Assertions.assertEquals(expected, solution.addStrings(num1, num2));
    }

    @Test
    void zero() {
        String num1 = "0";
        String num2 = "0";
        String expected = "0";
        Assertions.assertEquals(expected, solution.addStrings(num1, num2));
    }

    @Test
    void oneEmptyString() {
        String num1 = "";
        String num2 = "123";
        String expected = "123";
        Assertions.assertEquals(expected, solution.addStrings(num1, num2));
    }

    @Test
    void bothEmptyStrings() {
        String num1 = "";
        String num2 = "";
        String expected = "";
        Assertions.assertEquals(expected, solution.addStrings(num1, num2));
    }
}