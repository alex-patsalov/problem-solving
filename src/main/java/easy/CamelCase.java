package easy;

public class CamelCase {

    public static int camelcase(String s) {
        return 1 + (int) s.chars().filter(c -> c < 'a').count();
    }

}
