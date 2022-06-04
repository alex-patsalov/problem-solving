package medium;

public class TimeInWords {

    // https://www.hackerrank.com/challenges/the-time-in-words/problem

    public static String timeInWords(int hours, int minutes) {
        StringBuilder sb = new StringBuilder();
        String exactHours = "o'clock";
        String h;
        String mins = minutes == 1 || minutes == 59 ? "minute" : "minutes";
        String[] words = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
                "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five",
                "twenty six", "twenty seven", "twenty eight", "twenty nine"};
        if (hours == 12) h = words[1];
        else h = words[hours + 1];

        if (minutes == 0) sb.append(words[hours]).append(" ").append(exactHours);
        else if (minutes == 15) sb.append("quarter past ").append(words[hours]);
        else if (minutes == 30) sb.append("half past ").append(words[hours]);
        else if (minutes == 45) sb.append("quarter to ").append(h);
        else if (minutes < 30) sb.append(words[minutes]).append(" ").append(mins).append(" past ").append(words[hours]);
        else sb.append(words[60 - minutes]).append(" ").append(mins).append(" to ").append(h);

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(timeInWords(12, 31));
    }
}
