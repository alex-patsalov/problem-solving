package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SherlockStringProblemTest {

  @Test
  void checkString0() {
    assertTrue(SherlockStringProblem.checkString("abc"));
  }

  @Test
  void checkString1() {
    assertTrue(SherlockStringProblem.checkString("aabc"));
  }

  @Test
  void checkString2() {
    assertTrue(SherlockStringProblem.checkString("aabbc"));
  }

  @Test
  void checkString3() {
    assertFalse(SherlockStringProblem.checkString("aaabc"));
  }

  @Test
  void checkString4() {
    assertTrue(SherlockStringProblem.checkString("aabbcc"));
  }

  @Test
  void checkString5() {
    assertTrue(SherlockStringProblem.checkString("abbbccc"));
  }
  @Test
  void checkString6() {
    assertTrue(SherlockStringProblem.checkString("aabcc"));
  }
  @Test
  void checkString7() {
    assertFalse(SherlockStringProblem.checkString("aaabcc"));
  }
  @Test
  void checkString8() {
    assertTrue(SherlockStringProblem.checkString("abcdefgr"));
  }
  @Test
  void checkString9() {
    assertTrue(SherlockStringProblem.checkString("aaab"));
  }
  @Test
  void checkString10() {
    assertFalse(SherlockStringProblem.checkString("aabbbccc"));
  }
  @Test
  void checkString12() {
    assertFalse(SherlockStringProblem.checkString("aaabbbdddee"));
  }
  @Test
  void checkString13() {
    assertFalse(SherlockStringProblem.checkString("aaaaabbb"));
  }
  @Test
  void checkString14() {
    assertTrue(SherlockStringProblem.checkString("aaabbbc"));
  }

  @Test
  void checkString15() {
    assertFalse(SherlockStringProblem.checkString("aaaabbbccd"));
  }

  @Test
  void checkString16() {
    assertTrue(SherlockStringProblem.checkString("a"));
  }

  @Test
  void checkString17() {
    assertTrue(SherlockStringProblem.checkString("aaaaa"));
  }

  @Test
  void checkString18() {
    assertTrue(SherlockStringProblem.checkString("aabbb"));
  }

  @Test
  void checkString19() {
    assertFalse(SherlockStringProblem.checkString("aabbcd"));
  }

  @Test
  void checkString20() {
    assertFalse(SherlockStringProblem.checkString("aabbccddeefghi"));
  }

  @Test
  void checkString21() {
    assertTrue(SherlockStringProblem.checkString("abcdefghhgfedecba"));
  }
}