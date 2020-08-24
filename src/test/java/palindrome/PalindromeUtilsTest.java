package palindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Provide unit test for class PalindromeUtils.
 */
class PalindromeUtilsTest {

  @Test
  void isPalindrome() {
    Assertions.assertTrue(PalindromeUtils.isPalindrome("abba"));
  }

  @Test
  void isNotPalindrome() {
    Assertions.assertFalse(PalindromeUtils.isPalindrome("true"));
  }

  @Test
  void isPalindromeAlternative() {
    Assertions.assertTrue(PalindromeUtils.isPalindromeAlternative("kayak"));
  }

  @Test
  void isNotPalindromeAlternative() {
    Assertions.assertFalse(PalindromeUtils.isPalindromeAlternative("hobbies"));
  }
}