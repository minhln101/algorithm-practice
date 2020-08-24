package reversal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Provide unit test for class ReversalUtils.
 */
class ReversalUtilsTest {

  @Test
  void reverse() {
    Assertions.assertEquals("elppaenip", ReversalUtils.reverse("pineapple"));
    Assertions.assertEquals("olleh", ReversalUtils.reverse("hello"));
    Assertions.assertEquals("skcor", ReversalUtils.reverse("rocks"));
  }

  @Test
  void reverseUsingForwardLoop() {
    Assertions.assertEquals("skcor", ReversalUtils.reverseUsingForwardLoop("rocks"));
    Assertions.assertEquals("", ReversalUtils.reverseUsingForwardLoop(""));
  }

  @Test
  void reverseUsingBackwardLoop() {
    Assertions.assertEquals("htuos", ReversalUtils.reverseUsingBackwardLoop("south"));
  }

  @Test
  void reverseInt() {
    Assertions.assertEquals(-51, ReversalUtils.reverseInt(-15));
    Assertions.assertEquals(29, ReversalUtils.reverseInt(92));
    Assertions.assertEquals(9, ReversalUtils.reverseInt(90));
    Assertions.assertEquals(8, ReversalUtils.reverseInt(8000));
  }

}