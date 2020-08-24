package anagram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Minh Lee on 20/08/2020.
 */
public class AnagramUtils {

  public static boolean isAnagram(String firstStr, String secondStr) {
    Map<String, Integer> firstCharMap = buildCharMap(firstStr);
    Map<String, Integer> secondCharMap = buildCharMap(secondStr);

    if (firstCharMap.size() != secondCharMap.size()) {
      return false;
    }

    Set<String> characters = firstCharMap.keySet();
    for (String character : characters) {
      if (!firstCharMap.get(character).equals(secondCharMap.get(character))) {
        return false;
      }
    }
    return true;
  }

  public static boolean isAnagramAlternative(String firstStr, String secondStr) {
    char[] firstCleanArr = firstStr.replace(" ", "").toCharArray();
    char[] secondCleanArr = secondStr.replace(" ", "").toCharArray();

    Arrays.sort(firstCleanArr);
    firstStr = new String(firstCleanArr);
    Arrays.sort(secondCleanArr);
    secondStr = new String(secondCleanArr);
    return firstStr.equals(secondStr);
  }

  private static Map<String, Integer> buildCharMap(String str) {
    Map<String, Integer> charFreqMap = new HashMap<>();
    for (String element : str.split("")) {
      element = element.toLowerCase();
      if (!charFreqMap.containsKey(element)) {
        charFreqMap.put(element, 1);
      } else {
        int currentCharFreq = charFreqMap.get(element);
        charFreqMap.put(element, currentCharFreq + 1);
      }
    }
    return charFreqMap;
  }
}
