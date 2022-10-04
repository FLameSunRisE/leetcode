package test.string;

import main.string.ValidPalindrome125;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidPalindrome125Test {

    private ValidPalindrome125 target = new ValidPalindrome125();

    @Test
    void isPalindrome() {
        String s = "A man, a plan, a canal: Panama";
        Assertions.assertTrue(target.isPalindrome(s));
    }

    @Test
    void isPalindrome1() {
        String s = "race a car";
        Assertions.assertFalse(target.isPalindrome(s));
    }

    @Test
    void isPalindrome2() {
        String s = " ";
        Assertions.assertTrue(target.isPalindrome(s));
    }
}