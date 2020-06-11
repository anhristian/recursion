package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialsTest {

  static final long[][] testCases = {
      {0, 1},
      {1,	1},
      {5,	120},
      {10, 3628800},
      {13, 6227020800L}

  };
  @Test
  void computeRecursive() {
    for (long[] testCases : testCases) {
      int n = (int) testCases[0];
      long expected = testCases[1];
      long actual = Factorials.computeIterative(n);
      assertEquals(expected, actual);

    }
  }


  @Test
  void computeIterative() {
    for (long[] testCase : testCases) {
      int n = (int) testCase[0];
      long expected = testCase[1];
      long actual = Factorials.computeIterative(n);
      assertEquals(expected, actual);
    }
    assertThrows(IllegalArgumentException.class, () -> Factorials.computeIterative(-1));
  }
}