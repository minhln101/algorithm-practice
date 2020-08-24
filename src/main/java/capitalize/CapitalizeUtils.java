package capitalize;

/**
 * Created by Minh Lee on 20/08/2020.
 */
public class CapitalizeUtils {

  static String SPACE = " ";

  public static String capitalize(String str) {
    StringBuilder stringBuilder = new StringBuilder();
    String[] strArr = str.split(SPACE);
    for (String word : strArr) {
      if (!word.equals(strArr[strArr.length - 1])) {
        word = word + SPACE;
      }

      String firstCharacter = String.valueOf(word.charAt(0));
      word = word.replaceFirst(firstCharacter, firstCharacter.toUpperCase());

      stringBuilder.append(word);
    }
    return stringBuilder.toString();
  }

  public static String capitalizeAlternative(String str) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      if (i == 0 || String.valueOf(str.charAt(i - 1)).equals(SPACE)) {
        stringBuilder.append(String.valueOf(str.charAt(i)).toUpperCase());
      } else {
        stringBuilder.append(str.charAt(i));
      }
    }
    return stringBuilder.toString();
  }

  public static String steps(int n) {
    StringBuilder stringBuilder = new StringBuilder();
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    for (int i = 0; i < n; i++) {
      String hash = "#";
      String space = " ";
      hash = new String(new char[i + 1]).replace("\0", hash);
      space = new String(new char[n - 1 - i]).replace("\0", space);
      stringBuilder.append(hash).append(space);
      if (i != n - 1) {
        stringBuilder.append("\n");
      }
    }
    return stringBuilder.toString();
  }

}
