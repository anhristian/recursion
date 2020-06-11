package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromesTest {
static final String[] knownPalindromes = {"radar", "abba", "x", ""};
static final String[] knownNonPalindromes = {"sonar", "abb"};

static final String[] knownDenormalized = {"radar", "Radar", "A man, a plan, a canal - Panama!", "aBbA"};
static final String[] knownNonDenormalized = {"A man, a plan, a dam - Hoover!",};

  @Test
  void testRecursive() {
    for (String values : knownPalindromes) {
      assertTrue(Palindromes.testRecursive(values));
    }
    for (String value : knownNonPalindromes) {
      assertFalse(Palindromes.testRecursive(value));
    }
  }

  @Test
  void testDenormalized() {
for (String values : knownDenormalized) {
  assertTrue(Palindromes.testDenormalized(values));
}
for (String values: knownNonDenormalized) {
  assertFalse(Palindromes.testDenormalized(values));
}

  }

  @Test
  void testIterative() {
    Palindromes iterative = new Palindromes();
    for ( String values : knownPalindromes) {
      assertTrue(Palindromes.testIterative(values));
    }
    for (String values : knownNonPalindromes) {
      assertFalse(Palindromes.testIterative(values));
    }
  }
}