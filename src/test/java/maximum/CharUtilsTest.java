package maximum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Provide unit test for class CharUtils.
 */
class CharUtilsTest {

  @Test
  void mostCommonCharacter() {
    Assertions.assertEquals('a', CharUtils.mostCommonCharacter("abba"));
    Assertions.assertEquals('1', CharUtils.mostCommonCharacter("dajsfdhjefuwe121111111"));
  }
}