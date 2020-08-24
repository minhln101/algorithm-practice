package palindrome;

/**
 * Algorithms to check if a string is palindrome or not.
 *
 * Example: "kayak" is a palindrome string, "new year" is not a palindrome string
 */
public class PalindromeUtils {

  public static boolean isPalindrome(String str) {
    String reversedStr = new StringBuilder(str).reverse().toString();
    return str.equals(reversedStr);
  }

  public static boolean isPalindromeAlternative(String str) {
    int index = 0;
    int backwardIndex = str.length() - 1;

    while (index < backwardIndex) {
      if (str.charAt(index) != str.charAt(backwardIndex)) {
        return false;
      }
      index++;
      backwardIndex--;
    }
    return true;
  }
}
