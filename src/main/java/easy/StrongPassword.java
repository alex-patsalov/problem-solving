package easy;

public class StrongPassword {

    public static int minimumNumber(int length, String password) {
        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";
        int required = 4;
        int reqlength = 6 - length;
        boolean nb = true;
        boolean lcb = true;
        boolean upb = true;
        boolean scb = true;
        for (char c : password.toCharArray()) {
            if (numbers.indexOf(c) >= 0 && nb) {
                required--;
                nb = false;
            } else if (lower_case.indexOf(c) >= 0 && lcb) {
                required--;
                lcb = false;
            } else if (upper_case.indexOf(c) >= 0 && upb) {
                required--;
                upb = false;
            } else if (special_characters.indexOf(c) >= 0 && scb) {
                required--;
                scb = false;
            }
        }
        return Math.max(reqlength, required);
    }

}
