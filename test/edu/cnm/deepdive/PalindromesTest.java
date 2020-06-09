package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromesTest {
static final String[] knownPalindromes = {
    "radar",
    "abba",
    "x",
    "",
 };
static final String[] knownNonPalindromes = {
    "sonar",
    "abb",
};
  @Test
  void testRecursive() {
    assertTrue(Palindromes.testRecursive("radar"));
    assertTrue(Palindromes.testRecursive("abba"));
    assertTrue(Palindromes.testRecursive("x"));
    assertTrue(Palindromes.testRecursive(""));
    assertFalse(Palindromes.testRecursive("sonar"));
    assertFalse(Palindromes.testRecursive("abb"));
  }
}