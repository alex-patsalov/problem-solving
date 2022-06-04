package medium;

import java.util.ArrayList;
import java.util.List;

public class Encryption {

    // https://www.hackerrank.com/challenges/encryption/problem

    public static String encryption2(String s) {
        List<String> list = new ArrayList<>();
        String str = s.replaceAll(" ", "");
        int length = str.length();
        int sqrt = (int) Math.ceil(Math.sqrt(length));
        while (str.length() >= sqrt) {
            String substring = str.substring(0, sqrt);
            list.add(substring);
//            System.out.println(substring);
            str = str.substring(sqrt);
            if (str.length() > 0 && str.length() < sqrt) {
                list.add(str);
//                System.out.println(str);
            }
        }
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        while (idx < sqrt) {
            for (String s1 : list) {
                if (s1.length() <= idx) continue;
                sb.append(s1.charAt(idx));
            }
            sb.append(" ");
            idx++;
        }
//        System.out.println(sb);
        return sb.toString();
    }

    public static String encryption(String s) {
        String str = s.replaceAll(" ", "");
        System.out.println(str);
        int length = str.length();
        int sqrt = (int) Math.ceil(Math.sqrt(length));
        int pointer = 0;
        StringBuilder sb = new StringBuilder();
        while (pointer < sqrt) {
            int index = pointer;
            while (index < length) {
                sb.append(str.charAt(index));
                index += sqrt;
            }
            pointer++;
            sb.append(" ");
        }
        System.out.println(sb);
        return sb.toString();
    }

    public static void main(String[] args) {
        encryption("hello everyone how are you doing");
    }

}
