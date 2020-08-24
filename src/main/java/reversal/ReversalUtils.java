package reversal;

/**
 * Algorithms to reverse a string.
 *
 * Examples reverse('apple') == 'leppa' reverse('hello') == 'olleh' reverse('Greetings!') ==
 * '!sgniteerG'
 */
public class ReversalUtils {

  /**
   * Reverse a string using StringBuilder helper method
   *
   * @param str the string to reverse
   * @return reversed string
   */
  public static String reverse(String str) {
    // using reverse helper function of string builder
    return new StringBuilder(str).reverse().toString();
  }

  /**
   * Reverse a string using forward loop and StringBuilder helper method: insert()
   *
   * @param str the string to reverse
   * @return reversed string
   */
  public static String reverseUsingForwardLoop(String str) {
    StringBuilder result = new StringBuilder();
    String[] strArr = str.split("");
    for (String character : strArr) {
      result.insert(0, character);
    }
    return result.toString();
  }

  /**
   * Reverse a string using loop and StringBuilder helper method: append()
   *
   * @param str the string to reverse
   * @return reversed string
   */
  public static String reverseUsingBackwardLoop(String str) {
    StringBuilder result = new StringBuilder();
    String[] strArr = str.split("");
    for (int i = strArr.length - 1; i >= 0; i--) {
      result.append(strArr[i]);
    }
    return result.toString();
  }

  /**
   * @param number the number to reverse
   * @return reversed number
   */
  public static int reverseInt(int number) {
    int result;

    // convert number to a string then reverse it
    // remove the dash symbol from string if it exists
    String strNumber = new StringBuilder(String.valueOf(number)).reverse().toString();
    strNumber = strNumber.replace("-", "");

    result = Integer.parseInt(strNumber);
    if (number < 0) {
      result *= -1;
    }
    return result;
  }
}
