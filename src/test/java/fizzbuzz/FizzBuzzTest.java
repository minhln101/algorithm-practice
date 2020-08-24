package fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Provide unit test for class FizzBuzz.
 */
class FizzBuzzTest {

  @Test
  void fizzOrBuzz() {
    Assertions.assertEquals("FizzBuzz", FizzBuzz.fizzOrBuzz(0));
    Assertions.assertEquals("FizzBuzz", FizzBuzz.fizzOrBuzz(150));
    Assertions.assertEquals("Fizz", FizzBuzz.fizzOrBuzz(36));
    Assertions.assertEquals("Buzz", FizzBuzz.fizzOrBuzz(25));
    Assertions.assertEquals("Neither Fizz nor Buzz", FizzBuzz.fizzOrBuzz(152));
    Assertions.assertEquals("Neither Fizz nor Buzz", FizzBuzz.fizzOrBuzz(44444));
  }

}