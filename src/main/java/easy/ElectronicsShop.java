package easy;

public class ElectronicsShop {

  static int getMoneySpent(int[] keyboards, int[] drives, int budget) {
    int spentSum = -1;
    int max = 0;
    for (int keyboard : keyboards) {
      for (int drive : drives) {
        if (keyboard + drive <= budget) {
          spentSum = max = Math.max(max, keyboard + drive);
        }
      }
    }
    return spentSum;
  }

}
