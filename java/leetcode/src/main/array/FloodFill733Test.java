package main.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FloodFill733Test {

    private FloodFill733 solution;

    @BeforeEach
    void setUp() {
        this.solution = new FloodFill733();
    }

    @Test
    public void testFloodFill1() {
        int[][] image = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };
        int[][] expected = {
                {2, 2, 2},
                {2, 2, 0},
                {2, 0, 1}
        };
        int sr = 1, sc = 1, newColor = 2;
        int[][] result = solution.floodFill(image, sr, sc, newColor);

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void testFloodFill2() {
        int[][] image = {
                {0,0,0},
                {0,0,0}
        };
        int[][] expected = {
                {0,0,0},
                {0,0,0}
        };
        int sr = 0, sc = 0, newColor = 0;
        int[][] result = solution.floodFill(image, sr, sc, newColor);

        Assertions.assertArrayEquals(expected, result);
    }
}