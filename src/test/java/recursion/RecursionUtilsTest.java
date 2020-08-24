package recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Provide unit test for class RecursionUtils.
 */
class RecursionUtilsTest {

  @Test
  void fibonacci() {
    Assertions.assertEquals(55, RecursionUtils.fibonacci(10));
    Assertions.assertEquals(13, RecursionUtils.fibonacci(7));
    Assertions.assertEquals(89, RecursionUtils.fibonacci(11));
  }

  @Test
  void bunnyEars() {
    Assertions.assertEquals(5, RecursionUtils.bunnyEars(2));
    Assertions.assertEquals(2, RecursionUtils.bunnyEars(1));
    Assertions.assertEquals(7, RecursionUtils.bunnyEars(3));
  }

  @Test
  void bunnyEars2() {
    Assertions.assertEquals(4, RecursionUtils.bunnyEars2(2));
    Assertions.assertEquals(20, RecursionUtils.bunnyEars2(10));
    Assertions.assertEquals(2, RecursionUtils.bunnyEars2(1));
    Assertions.assertEquals(6, RecursionUtils.bunnyEars2(3));
    Assertions.assertEquals(24, RecursionUtils.bunnyEars2(12));
  }

  @Test
  void factorial() {
    Assertions.assertEquals(6, RecursionUtils.factorial(3));
    Assertions.assertEquals(120, RecursionUtils.factorial(5));
    Assertions.assertEquals(479001600, RecursionUtils.factorial(12));
  }


  @Test
  void triangle() {
    Assertions.assertEquals(0, RecursionUtils.triangle(0));
    Assertions.assertEquals(1, RecursionUtils.triangle(1));
    Assertions.assertEquals(3, RecursionUtils.triangle(2));
    Assertions.assertEquals(6, RecursionUtils.triangle(3));
  }

  @Test
  void sumOfDigits() {
    Assertions.assertEquals(9, RecursionUtils.sumOfDigits(126));
    Assertions.assertEquals(13, RecursionUtils.sumOfDigits(49));
    Assertions.assertEquals(3, RecursionUtils.sumOfDigits(12));
  }

  @Test
  void count7() {
    Assertions.assertEquals(2, RecursionUtils.count7(717));
  }

  @Test
  void count8() {
    Assertions.assertEquals(4, RecursionUtils.count8(8818));
    Assertions.assertEquals(4, RecursionUtils.count8(8088));
    Assertions.assertEquals(2, RecursionUtils.count8(818));
    Assertions.assertEquals(6, RecursionUtils.count8(88788));
  }

  @Test
  void powerN() {
    Assertions.assertEquals(9, RecursionUtils.powerN(3, 2));
    Assertions.assertEquals(1, RecursionUtils.powerN(3, 0));
    Assertions.assertEquals(32, RecursionUtils.powerN(2, 5));
  }

  @Test
  void countX() {
    Assertions.assertEquals(0, RecursionUtils.countX("abc"));
    Assertions.assertEquals(0, RecursionUtils.countX(""));
    Assertions.assertEquals(4, RecursionUtils.countX("xxxXx"));
  }

  @Test
  void countHi() {
    Assertions.assertEquals(2, RecursionUtils.countHi("hihiHiHI"));
    Assertions.assertEquals(2, RecursionUtils.countHi("xhixhix"));
    Assertions.assertEquals(1, RecursionUtils.countHi("hi"));
    Assertions.assertEquals(5, RecursionUtils.countHi("ihihihihihi"));
  }

  @Test
  void changeXY() {
    Assertions.assertEquals("Codey", RecursionUtils.changeXY("Codex"));
    Assertions.assertEquals("yyyHiyyy", RecursionUtils.changeXY("xxxHixxx"));
  }

  @Test
  void changePi() {
    Assertions.assertEquals("x3.14x", RecursionUtils.changePi("xpix"));
  }

  @Test
  void noX() {
    Assertions.assertEquals("ab", RecursionUtils.noX("xaxb"));
    Assertions.assertEquals("12345", RecursionUtils.noX("x1x2x3x4x5"));
    Assertions.assertEquals("ggggg", RecursionUtils.noX("gggxgg"));
  }

  @Test
  void array6() {
    Assertions.assertTrue(RecursionUtils.array6(new int[]{1, 6, 4}, 0));
    Assertions.assertTrue(RecursionUtils.array6(new int[]{6}, 0));
    Assertions.assertFalse(RecursionUtils.array6(new int[]{1, 4}, 0));
  }

  @Test
  void array11() {
    Assertions.assertEquals(2, RecursionUtils.array11(new int[]{1, 11, 12, 11}, 1));
    Assertions.assertEquals(0, RecursionUtils.array11(new int[]{1, 2, 3, 4}, 0));
  }

  @Test
  void array220() {
    Assertions.assertFalse(RecursionUtils.array220(new int[]{1, 2, 20}, 2));
    Assertions.assertTrue(RecursionUtils.array220(new int[]{1, 4, 40}, 0));
    Assertions.assertFalse(RecursionUtils.array220(new int[]{1, 50}, 3));
    Assertions.assertFalse(RecursionUtils.array220(new int[]{1, 50}, 0));
    Assertions.assertFalse(RecursionUtils.array220(new int[]{20, 2, 21}, 0));
  }

  @Test
  void allStar() {
    Assertions.assertEquals("a*b*c", RecursionUtils.allStar("abc"));
    Assertions.assertEquals("h*e*l*l*o", RecursionUtils.allStar("hello"));
    Assertions.assertEquals("C*h*o*c*o*l*a*t*e", RecursionUtils.allStar("Chocolate"));
  }

  @Test
  void pairStar() {
    Assertions.assertEquals("x*xy*y", RecursionUtils.pairStar("xxyy"));
    Assertions.assertEquals("noadjacent", RecursionUtils.pairStar("noadjacent"));
    Assertions.assertEquals("ab*b*ba", RecursionUtils.pairStar("abbba"));
  }

  @Test
  void endX() {
    Assertions.assertEquals("rexx", RecursionUtils.endX("xxre"));
    Assertions.assertEquals("hixxxx", RecursionUtils.endX("xxhixx"));
    Assertions.assertEquals("hihixxx", RecursionUtils.endX("xhixhix"));
  }

  @Test
  void countPairs() {
    Assertions.assertEquals(1, RecursionUtils.countPairs("AxA"));
    Assertions.assertEquals(3, RecursionUtils.countPairs("AxAxA"));
    Assertions.assertEquals(2, RecursionUtils.countPairs("AxAx"));
    Assertions.assertEquals(0, RecursionUtils.countPairs("ihjxhh"));
    Assertions.assertEquals(1, RecursionUtils.countPairs("aaa"));
    Assertions.assertEquals(0, RecursionUtils.countPairs("a"));
  }

  @Test
  void countAbc() {
    Assertions.assertEquals(1, RecursionUtils.countAbc("abc"));
    Assertions.assertEquals(2, RecursionUtils.countAbc("abcxxabc"));
    Assertions.assertEquals(2, RecursionUtils.countAbc("abaxxaba"));
    Assertions.assertEquals(2, RecursionUtils.countAbc("abcxxabc"));
  }

  @Test
  void count11() {
    Assertions.assertEquals(1, RecursionUtils.count11("11ab"));
    Assertions.assertEquals(2, RecursionUtils.count11("11abc11"));
    Assertions.assertEquals(3, RecursionUtils.count11("abc11x11x11"));
    Assertions.assertEquals(1, RecursionUtils.count11("111"));
    Assertions.assertEquals(4, RecursionUtils.count11("11x111x1111"));
    Assertions.assertEquals(0, RecursionUtils.count11("1Hello1"));
  }

  @Test
  void stringClean() {
    Assertions.assertEquals("yza", RecursionUtils.stringClean("yyyzzzaa"));
    Assertions.assertEquals("Helo Bokeper", RecursionUtils.stringClean("Hello Bookkeeper"));
  }

  @Test
  void countHi2() {
    Assertions.assertEquals(1, RecursionUtils.countHi2("ahixhi"));
    Assertions.assertEquals(2, RecursionUtils.countHi2("ahibhi"));
    Assertions.assertEquals(0, RecursionUtils.countHi2("xhixhi"));
    Assertions.assertEquals(2, RecursionUtils.countHi2("hixhhi"));
    Assertions.assertEquals(1, RecursionUtils.countHi2("Hellohi"));
  }

  @Test
  void parentBit() {
    Assertions.assertEquals("(abc)", RecursionUtils.parentBit("123(abc)xyz"));
    Assertions.assertEquals("(hello)", RecursionUtils.parentBit("x(hello)"));
    Assertions.assertEquals("(abc)", RecursionUtils.parentBit("xyz(abc)123"));
  }

  @Test
  void nestParent() {
    Assertions.assertTrue(RecursionUtils.nestParent("(())"));
    Assertions.assertTrue(RecursionUtils.nestParent("((()))"));
    Assertions.assertFalse(RecursionUtils.nestParent("(((x))"));
  }

  @Test
  void strCount() {
    Assertions.assertEquals(2, RecursionUtils.strCount("catcowcat", "cat"));
    Assertions.assertEquals(1, RecursionUtils.strCount("catcowcat", "cow"));
    Assertions.assertEquals(0, RecursionUtils.strCount("catcowcat", "dog"));
  }

  @Test
  void strCopies() {
    Assertions.assertTrue(RecursionUtils.strCopies("catcowcat", "cat", 2));
    Assertions.assertTrue(RecursionUtils.strCopies("catcowcat", "cow", 1));
    Assertions.assertFalse(RecursionUtils.strCopies("catcowcat", "cow", 5));
    Assertions.assertFalse(RecursionUtils.strCopies("catcowcat", "dog", 5));
    Assertions.assertTrue(RecursionUtils.strCopies("iiijjj", "i", 3));
    Assertions.assertTrue(RecursionUtils.strCopies("iiijjj", "ii", 2));
  }

  @Test
  void strDist() {
    Assertions.assertEquals(9, RecursionUtils.strDist("catcowcat", "cat"));
    Assertions.assertEquals(3, RecursionUtils.strDist("catcowcat", "cow"));
    Assertions.assertEquals(9, RecursionUtils.strDist("cccatcowcatxx", "cat"));
    Assertions.assertEquals(5, RecursionUtils.strDist("hiHellohihihi", "hih"));
  }
}