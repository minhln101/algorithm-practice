package recursion;

/**
 * Created by Minh Lee on 21/08/2020.
 */
public class RecursionUtils {

  /**
   * @param n represents order of the result in the Fibonacci sequence
   * @return value of the number at nth of the Fibonacci sequence
   */
  public static int fibonacci(int n) {
    // base case
    if (n <= 1) {
      return n;
    }

    // recursive case
    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  /**
   * The odd bunnies (1, 3, ..) have the normal 2 ears.
   *
   * The even bunnies (2, 4, ..) we'll say have 3 ears.
   *
   * @param bunnies number of bunnies that need to calculate the ear quantity
   * @return all the bunnies ears
   */
  public static int bunnyEars(int bunnies) {
    if (bunnies <= 0) {
      return 0;
    }
    if (bunnies % 2 == 0) {
      return bunnyEars(bunnies - 1) + 3;
    }
    return bunnyEars(bunnies - 1) + 2;
  }

  // We have a number of bunnies and each bunny has two big floppy ears.
  // We want to compute the total number of ears across all the bunnies recursively
  // (without loops or multiplication).
  public static int bunnyEars2(int bunnies) {
    if (bunnies <= 0) {
      return 0;
    }

    return bunnyEars2(bunnies - 1) + 2;
  }

  // Given n of 1 or more,
  // return the factorial of n, which is n * (n-1) * (n-2) ... 1.
  // Compute the result recursively (without loops).
  public static int factorial(int n) {
    if (n <= 1) {
      return n;
    }

    return n * factorial(n - 1);
  }

  // We have triangle made of blocks.
  // The topmost row has 1 block, the next row down has 2 blocks,
  // the next row has 3 blocks, and so on.
  // Compute recursively (no loops or multiplication) the total number of blocks
  // in such a triangle with the given number of rows.
  public static int triangle(int rows) {
    if (rows <= 0) {
      return 0;
    }
    return rows + triangle(rows - 1);
  }

  // Given a non-negative int n, return the sum of its digits recursively (no loops).
  public static int sumOfDigits(int number) {
    // base case
    if (number <= 0) {
      return 0;
    }

    return (number % 10) + sumOfDigits(number / 10);
  }

  // Given a non-negative int n, return the count of the occurrences of 7 as a digit,
  // so for example 717 yields 2. (no loops).
  public static int count7(int number) {
    if (number < 7) {
      return 0;
    }

    int counter = 0;
    if (number % 10 == 7) {
      counter++;
    }
    if (number / 10 == 0) {
      return counter;
    }
    return counter + count7(number / 10);
  }

  //  Given a non-negative int n,
  //  compute recursively (no loops) the count of the occurrences of 8 as a digit,
  //  except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4.
  public static int count8(int number) {
    if (number < 8) {
      return 0;
    }

    if (number % 10 == 8 && (number / 10) % 10 == 8) {
      return count8(number / 10) + 2;
    } else if (number % 10 == 8) {
      return count8(number / 10) + 1;
    }
    return count8(number / 10);
  }

  // Given base and n that are both 1 or more,
  // compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
  public static int powerN(int base, int n) {
    if (n == 0) {
      return 1;
    }
    return base * powerN(base, n - 1);
  }

  //Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
  public static int countX(String str) {
    char validX = 'x';
    int counter = 0;

    if (str.length() == 0) {
      return counter;
    }

    if (str.charAt(0) == validX) {
      return 1 + countX(str.substring(1));
    }

    return countX(str.substring(1));
  }

  // Given a string,
  // compute recursively (no loops) the number of times lowercase "hi" appears in the string.
  public static int countHi(String str) {
    if (str.length() <= 1) {
      return 0;
    }

    int counter = 0;
    String validHi = "hi";

    if (str.substring(0, 2).equals(validHi)) {
      counter = 1;
    }
    return counter + countHi(str.substring(1));
  }

  // Given a string,
  // compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.
  public static String changeXY(String str) {
    // base case
    if (str.length() == 0) {
      return str;
    }

    int index = 0;
    // recursive case
    if (str.charAt(index) == 'x') {
      return 'y' + changeXY(str.substring(1));
    }
    return str.charAt(index) + changeXY(str.substring(1));
  }

  // Given a string,
  // compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".
  public static String changePi(String str) {
    // base case
    if (str.length() < 2) {
      return str;
    }

    if (str.startsWith("pi")) {
      return "3.14" + changePi(str.substring(2));
    }
    return str.charAt(0) + changePi(str.substring(1));
  }

  // Given a string, compute recursively a new string where all the 'x' chars have been removed.
  public static String noX(String str) {
    // base case
    if (str.length() == 0) {
      return str;
    }

    // remove x from string if exits
    if (str.charAt(0) == 'x') {
      return noX(str.substring(1));
    }

    return str.charAt(0) + noX(str.substring(1));
  }

  // Given an array of ints, compute recursively if the array contains a 6.
  // We'll use the convention of considering only the part of the array that begins at the given index.
  // In this way, a recursive call can pass index+1 to move down the array.
  // The initial call will pass in index as 0.
  public static boolean array6(int[] nums, int index) {
    if (index >= nums.length) {
      return false;
    }

    if (nums[index] == 6) {
      return true;
    }

    return array6(nums, index + 1);
  }

  // Given an array of ints, compute recursively the number of times that the value 11 appears in the array.
  // We'll use the convention of considering only the part of the array that begins at the given index.
  // In this way, a recursive call can pass index+1 to move down the array.
  // The initial call will pass in index as 0.
  public static int array11(int[] nums, int index) {
    if (index >= nums.length) {
      return 0;
    }

    if (nums[index] == 11) {
      return 1 + array11(nums, index + 1);
    }

    return array11(nums, index + 1);
  }

  // Given an array of ints,
  // compute recursively if the array contains somewhere a value followed in the array by that value times 10.
  // We'll use the convention of considering only the part of the array that begins at the given index.
  // In this way, a recursive call can pass index+1 to move down the array.
  // The initial call will pass in index as 0.
  public static boolean array220(int[] nums, int index) {
    if (index >= nums.length - 1) {
      return false;
    }

    if (nums[index + 1] == nums[index] * 10) {
      return true;
    }

    return array220(nums, index + 1);
  }

  // Given a string,
  // compute recursively a new string where all the adjacent chars are now separated by a "*".
  public static String allStar(String str) {
    if (str.length() < 2) {
      return str;
    }

    return str.charAt(0) + "*" + allStar(str.substring(1));
  }

  // Given a string,
  // compute recursively a new string where identical chars that are adjacent
  // in the original string are separated from each other by a "*".
  public static String pairStar(String str) {
    if (str.length() <= 1) {
      return str;
    }

    if (str.charAt(0) == str.charAt(1)) {
      return str.charAt(0) + "*" + pairStar(str.substring(1));
    }
    return str.charAt(0) + pairStar(str.substring(1));
  }

  // Given a string, compute recursively a new string
  // where all the lowercase 'x' chars have been moved to the end of the string.
  public static String endX(String str) {
    if (str.length() == 0) {
      return str;
    }

    if (str.charAt(0) == 'x') {
      return endX(str.substring(1)) + "x";
    }

    return str.charAt(0) + endX(str.substring(1));
  }

  // We'll say that a "pair" in a string is two instances of a char separated by a char.
  // So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x.
  // Recursively compute the number of pairs in the given string.
  public static int countPairs(String str) {
    if (str.length() < 3) {
      return 0;
    }

    if (str.charAt(0) == str.charAt(2)) {
      return 1 + countPairs(str.substring(1));
    }
    return countPairs(str.substring(1));
  }

  // Count recursively the total number of "abc" and "aba" substrings that appear in the given string.
  public static int countAbc(String str) {
    if (str.length() < 3) {
      return 0;
    }

    if (str.startsWith("abc") || str.startsWith("aba")) {
      return 1 + countAbc(str.substring(1));
    }

    return countAbc(str.substring(1));
  }

  // Given a string, compute recursively (no loops) the number of "11" substrings in the string.
  // The "11" substrings should not overlap.
  public static int count11(String str) {
    if (str.length() < 2) {
      return 0;
    }

    if (str.startsWith("11")) {
      return 1 + count11(str.substring(2));
    }

    return count11(str.substring(1));
  }

  // Given a string, return recursively a "cleaned" string
  // where adjacent chars that are the same have been reduced to a single char.
  // So "yyzzza" yields "yza".
  public static String stringClean(String str) {
    if (str.length() < 2) {
      return str;
    }

    if (str.charAt(0) == str.charAt(1)) {
      return stringClean(str.substring(1));
    }

    return str.charAt(0) + stringClean(str.substring(1));
  }

  // Given a string, compute recursively the number of times lowercase "hi" appears in the string,
  // however do not count "hi" that have an 'x' immedately before them.
  public static int countHi2(String str) {
    if (str.length() < 2) {
      return 0;
    }

    if (str.charAt(0) == 'x' && str.startsWith("hi", 1)) {
      return countHi2(str.substring(3));
    } else if (str.startsWith("hi", 1)) {
      return 1 + countHi2(str.substring(3));
    } else if (str.startsWith("hi")) {
      return 1 + countHi2(str.substring(2));
    }

    return countHi2(str.substring(1));
  }

  // Given a string that contains a single pair of parenthesis,
  // compute recursively a new string made of only of the parenthesis and their contents,
  // so "xyz(abc)123" yields "(abc)".
  public static String parentBit(String str) {
    if (str.length() < 3) {
      return str;
    }

    if (str.charAt(0) == '(') {
      if (str.charAt(str.length() - 1) == ')') {
        return str;
      } else {
        return parentBit(str.substring(0, str.length() - 1));
      }
    }

    return parentBit(str.substring(1));
  }

  // Given a string, return true if it is a nesting of zero or more pairs of parenthesis,
  // like "(())" or "((()))".
  // Suggestion: check the first and last chars, and then recur on what's inside them.

  public static boolean nestParent(String str) {
    if (str.length() == 0) {
      return true;
    }

    if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
      return nestParent(str.substring(1, str.length() - 1));
    }

    return false;
  }

  // Given a string and a non-empty substring sub,
  // compute recursively the number of times that sub appears in the string,
  // without the sub strings overlapping.
  public static int strCount(String str, String sub) {
    if (sub.length() > str.length()) {
      return 0;
    }

    if (str.startsWith(sub)) {
      return 1 + strCount(str.substring(sub.length()), sub);
    }
    return strCount(str.substring(1), sub);
  }

  // Given a string and a non-empty substring sub,
  // compute recursively if at least n copies of sub appear in the string somewhere,
  // possibly with overlapping. N will be non-negative.
  public static boolean strCopies(String str, String sub, int n) {
    return countStrAppearance(str, sub) == n;
  }

  private static int countStrAppearance(String str, String sub) {
    if (str.length() < sub.length()) {
      return 0;
    }

    if (str.startsWith(sub)) {
      return 1 + countStrAppearance(str.substring(1), sub);
    }
    return countStrAppearance(str.substring(1), sub);
  }

  // Given a string and a non-empty substring sub,
  // compute recursively the largest substring which starts and ends with sub and return its length.
  public static int strDist(String str, String sub) {
    int strLength = str.length();
    int subLength = sub.length();

    if (subLength > strLength) {
      return 0;
    }

    if (str.startsWith(sub)) {
      if (str.endsWith(sub)) {
        return strLength;
      }
      return strDist(str.substring(0, strLength - 1), sub);
    }

    return strDist(str.substring(1), sub);
  }


}

