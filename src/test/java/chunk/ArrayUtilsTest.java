package chunk;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Provide unit test for class ArrayUtils.
 */
class ArrayUtilsTest {

  @Test
  void chunkingArrayOneToTen() {
    int[] oneToTen = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    String newSubArray = "[[1, 2], [3, 4], [5, 6], [7, 8], [9, 10]]";
    Assertions
        .assertEquals(newSubArray, Arrays.deepToString(ArrayUtils.chunkingArray(oneToTen, 2)));
  }

  @Test
  void chunkingArrayOneToFive() {
    int[] oneToFive = new int[]{1, 2, 3, 4, 5};
    String newSubArray = "[[1, 2], [3, 4], [5]]";
    Assertions
        .assertEquals(newSubArray, Arrays.deepToString(ArrayUtils.chunkingArray(oneToFive, 2)));
  }

  @Test
  void chunkingArrayWithSize3() {
    int[] oneToTen = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    String newSubArray = "[[1, 2, 3], [4, 5, 6], [7, 8, 9], [10]]";
    Assertions
        .assertEquals(newSubArray, Arrays.deepToString(ArrayUtils.chunkingArray(oneToTen, 3)));
  }

  @Test
  void chunkWithSize5() {
    int[] oneToTen = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    String newSubArray = "[[1, 2, 3, 4, 5], [6, 7, 8, 9, 10]]";
    Assertions
        .assertEquals(newSubArray, Arrays.deepToString(ArrayUtils.chunkingArray(oneToTen, 5)));
  }
}