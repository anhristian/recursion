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
    "abb"
};
static final String[] knownDenormalized = {
    "radar",
    "Radar",
    "A man, a plan, a canal - Panama!",
    "aBbA"
};
static final String[] knownNonDenormalized = {
    "A man, a plan, a dam - Hoover!",
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

  @Test
  void testDenormalized() {
    assertTrue(Palindromes.testDenormalized("radar"));
    assertTrue(Palindromes.testDenormalized("Radar"));
    assertTrue(Palindromes.testDenormalized("A man, a plan, a canal - Panama!"));
    assertTrue(Palindromes.testDenormalized("aBba"));
    assertFalse(Palindromes.testDenormalized("A man, a plan, a dam - Hoover"));

  }
}