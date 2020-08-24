package fizzbuzz;

/**
 * Algorithms to solve fizz buzz game
 */
public class FizzBuzz {

  public static String fizzOrBuzz(int n) {
    String result = "Neither Fizz nor Buzz";
    if (n % 3 == 0 && n % 5 == 0) {
      result = "FizzBuzz";
    } else if (n % 3 == 0) {
      result = "Fizz";
    } else if (n % 5 == 0) {
      result = "Buzz";
    }
    return result;
  }
}
