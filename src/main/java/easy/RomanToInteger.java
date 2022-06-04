package easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

  /*
   * https://leetcode.com/problems/roman-to-integer/
   * */

  public int romanToInt(String s) {
    Map<Character, Integer> map = new HashMap<>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);
    int sum = 0;
    for (int i = 0; i < s.length(); ++i) {
      if(i != s.length() - 1 && s.charAt(i) == 'I' && s.charAt(i + 1) == 'V'){
        sum += 4;
        ++i;
      }
      else if(i != s.length() - 1 && s.charAt(i) == 'I' && s.charAt(i + 1) == 'X'){
        sum += 9;
        ++i;
      }
      else if(i != s.length() - 1 && s.charAt(i) == 'X' && s.charAt(i + 1) == 'L'){
        sum += 40;
        ++i;
      }
      else if(i != s.length() - 1 && s.charAt(i) == 'X' && s.charAt(i + 1) == 'C'){
        sum += 90;
        ++i;
      }
      else if(i != s.length() - 1 && s.charAt(i) == 'C' && s.charAt(i + 1) == 'D'){
        sum += 400;
        ++i;
      }
      else if(i != s.length() - 1 && s.charAt(i) == 'C' && s.charAt(i + 1) == 'M'){
        sum += 900;
        ++i;
      }
      else{
        sum += map.get(s.charAt(i));
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    RomanToInteger romanToInteger = new RomanToInteger();
    int iii = romanToInteger.romanToInt("III");
    System.out.println(iii);
  }

}
