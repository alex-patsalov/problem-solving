package easy;

public class BeautifulDays {

  public static int beautifulDays(int startDate, int endDate, int divisible) {
    int goodDays = 0;
    while(endDate - startDate >= 0){
      int reverse = Integer.parseInt(new StringBuilder(startDate+"").reverse().toString());
      if((startDate - reverse) % divisible == 0) goodDays++;
      startDate++;
    }

    return goodDays;
  }

}
