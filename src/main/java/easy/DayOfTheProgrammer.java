package easy;

public class DayOfTheProgrammer {

  public static String dayOfProgrammer(int year) {
    final int progDay = 256;
    final int leapYearDays = 244;
    final int notLeapYearDays = 243;
    int septemberDay;
    if (year > 1918 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) || year < 1918 && year %4 == 0) {
        septemberDay = progDay - leapYearDays;
    }
    else if (year == 1918) septemberDay = progDay - leapYearDays + 14;
    else septemberDay = progDay - notLeapYearDays;
    return String.format("%d.09.%d\n", septemberDay, year);
  }

}
