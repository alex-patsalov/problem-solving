package easy;

public class JumpnigOnClouds {

  public static int jumpingOnClouds(int[] clouds, int jumpDistance) {
    int energy = 100;
    int pos = 0;
    while (true){
      pos = (pos + jumpDistance) % clouds.length;
      energy -= clouds[pos] * 2 + 1;
      if(pos == 0) break;
    }
    return energy;
  }

}
