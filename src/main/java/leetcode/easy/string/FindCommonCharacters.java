package leetcode.easy.string;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nikoo28 on 10/16/19 1:17 AM
 */

public class FindCommonCharacters {

  public List<String> commonChars(String[] A) {

    List<String> result = new ArrayList<>();

    for (int c = 'a'; c <= 'z'; c++) {
      int minCount = Integer.MAX_VALUE;
      for (String currentWord : A) {

        int wordCount = 0;
        for (char currentChar : currentWord.toCharArray()) {
          if (currentChar == c) {
            wordCount++;
          }
        }

        minCount = Math.min(minCount, wordCount);
      }

      for (int i = 0; i < minCount; i++) {
        result.add("" + (char) c);
      }
    }

    return result;
  }

}
