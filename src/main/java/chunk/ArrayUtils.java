package chunk;

import java.util.Arrays;

/**
 * Algorithms to solve Array Chunk Problem.
 *
 * Given an array and chunk size, divide the array into many subarrays where each subarrays is of
 * length size
 */
public class ArrayUtils {

  public static int[][] chunkingArray(int[] arr, int size) {
    int chunkArrSize = arr.length / size + arr.length % size;
    int[][] chunkedArray = new int[chunkArrSize][];

    int subArrIndex = 0;
    for (int i = 0; i < chunkArrSize; i++) {
      if (i == chunkArrSize - 1 && subArrIndex + size > arr.length) {
        chunkedArray[i] = new int[]{arr[arr.length - 1]};
      } else {
        chunkedArray[i] = Arrays.copyOfRange(arr, subArrIndex, subArrIndex + size);
      }
      subArrIndex += size;
    }

    return chunkedArray;
  }


}
