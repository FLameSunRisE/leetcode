package test.array;

import main.array.TeemoAttacking495;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TeemoAttacking495Test {

    TeemoAttacking495 target = new TeemoAttacking495();

    @Test
    void findPoisonedDuration() {
        int[] list = {1, 4};
        int duration = 2;
        Assertions.assertEquals(4, target.findPoisonedDuration(list, duration));
    }

    @Test
    void findPoisonedDuration1() {
        int[] list = {1,2};
        int duration = 2;
        Assertions.assertEquals(3, target.findPoisonedDuration(list, duration));
    }
}