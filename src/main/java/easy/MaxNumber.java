package easy;

public class MaxNumber {

    //https://leetcode.com/problems/maximum-69-number/

    public int maximum69Number(int num) {
        String str = String.valueOf(num);
        StringBuilder sb = new StringBuilder();
        int idx = str.indexOf("6");
        if (idx < 0) return num;
        else if (idx == 0) {
            str = str.substring(1);
            sb.append("9").append(str);
            return Integer.parseInt(sb.toString());
        } else if (idx == str.length() - 1) {
            String left = str.substring(0, idx);
            sb.append(left).append("9");
            return Integer.parseInt(sb.toString());
        } else {
            String left = str.substring(0, idx);
            String right = str.substring(idx + 1);
            sb.append(left).append("9").append(right);
            return Integer.parseInt(sb.toString());
        }
    }

    public int maximum69Number2(int num) {
        String strNumb = String.valueOf(num);
        if(strNumb.contains("6")){
            StringBuilder str = new StringBuilder(strNumb);
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == '6'){
                    str.setCharAt(i, '9');
                    break;
                }
            }
            return Integer.parseInt(str.toString());
        }
        return num;
    }

    public static void main(String[] args) {
        new MaxNumber().maximum69Number(9996);
    }
}
