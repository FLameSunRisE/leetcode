package main.binarysearch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FirstBadVersion278Test {

  @Test
  void testFirstBadVersionCase1() {
    FirstBadVersion278 sol = new FirstBadVersion278() {
      @Override
      boolean isBadVersion(int version) {
        return version >= 4;
      }
    };
    int actual = sol.firstBadVersion(5);
    assertEquals(4, actual);
  }

  @Test
  void testFirstBadVersionCase2() {
    FirstBadVersion278 sol = new FirstBadVersion278() {
      @Override
      boolean isBadVersion(int version) {
        return version >= 10;
      }
    };
    int actual = sol.firstBadVersion(15);
    assertEquals(10, actual);
  }

  @Test
  void testFirstBadVersionCase3() {
    FirstBadVersion278 sol = new FirstBadVersion278() {
      @Override
      boolean isBadVersion(int version) {
        return version >= 1;
      }
    };
    int actual = sol.firstBadVersion(1);
    assertEquals(1, actual);
  }

}