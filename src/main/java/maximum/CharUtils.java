package maximum;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Algorithms to get the most used character in a string.
 *
 * Examples: "abbbbbcc" has the most used character is 'b'
 */
public class CharUtils {

  public static char mostCommonCharacter(String str) {
    Map<Character, Integer> charFreqMap = new HashMap<>();
    for (char element : str.toCharArray()) {
      if (!charFreqMap.containsKey(element)) {
        charFreqMap.put(element, 1);
      } else {
        int currentCharFreq = charFreqMap.get(element);
        charFreqMap.put(element, currentCharFreq + 1);
      }
    }
    return charFreqMap.entrySet().stream()
        .max(Entry.comparingByValue()).get().getKey();
  }

}
