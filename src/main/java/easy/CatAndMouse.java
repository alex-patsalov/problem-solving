package easy;

public class CatAndMouse {

  static String CAT_A = "Cat A";
  static String CAT_B = "Cat B";
  static String MOUSE = "Mouse C";

  static String catAndMouse(int catAPos, int catBPos, int mousePos) {
    if (Math.abs(mousePos - catAPos) == Math.abs(mousePos - catBPos)) return MOUSE;
    else if (Math.abs(mousePos - catAPos) < Math.abs(mousePos - catBPos)) return CAT_A;
    else return CAT_B;
  }

}
