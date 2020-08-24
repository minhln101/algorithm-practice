package anagram;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Provide unit test for class StringUtils.
 */
class AnagramUtilsTest {

  @Test
  void isAnagram() {
    Assertions.assertTrue(AnagramUtils.isAnagram("fairy tales", "rail safety"));
    Assertions.assertFalse(AnagramUtils.isAnagram("failed   ", "fall date"));
  }

  @Test
  void isAnagramAlternative() {
    Assertions.assertTrue(AnagramUtils.isAnagramAlternative("fairy tales", "rail safety"));
    Assertions.assertFalse(AnagramUtils.isAnagramAlternative("failed   ", "fall date"));
    Assertions.assertTrue(AnagramUtils.isAnagramAlternative("Whoa! Hi!   ", "Hi! Whoa!"));
  }
}