package easy;

public class PlusOne {

    // https://leetcode.com/problems/plus-one
    public static int[] plusOne(int[] digits) {
        // 9 9 9
        int index = digits.length - 1;
        while (true){
            if(index >= 0 && digits[index] == 9){
                digits[index] = 0;
                index--;
            } else if(index == -1){
                int[] res = new int[digits.length + 1];
                res[0] = 1;
                return res;
            } else {
                digits[index] += 1;
                break;
            }
        }
        return digits;

    }

    public static void main(String[] args) {
        plusOne(new int[]{9,9,9});
    }

}
