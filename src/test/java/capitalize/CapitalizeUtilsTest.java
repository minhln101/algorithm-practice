package capitalize;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Provide unit test for class
 */
class CapitalizeUtilsTest {

  @Test
  void capitalize() {
    Assertions.assertEquals("Hello World", CapitalizeUtils.capitalize("hello world"));
    Assertions.assertEquals("Hi There, How Is It Going?",
        CapitalizeUtils.capitalize("hi there, how is it going?"));
  }

  @Test
  void capitalizeAlternative() {
    Assertions
        .assertEquals("Terms Of Service", CapitalizeUtils.capitalizeAlternative("terms of service"));
  }

  @Test
  void steps() {
    Assertions.assertEquals("#  \n"
        + "## \n"
        + "###", CapitalizeUtils.steps(3));
    Assertions.assertEquals("", CapitalizeUtils.steps(0));
  }
}