package easy;

import java.util.List;

public class DesignPDFView {

  public static int designerPdfViewer(List<Integer> heights, String word) {

    char[] chars = word.toCharArray();
    int[] nVal = new int[chars.length];
    int max = 1;
    for (int i = 0; i < nVal.length; i++) {
      nVal[i] = chars[i] - 'a';
      if (heights.get(nVal[i]) > max) max = heights.get(nVal[i]);
    }
    return max * word.length();
  }

}
