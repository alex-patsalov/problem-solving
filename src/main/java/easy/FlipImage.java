package easy;

public class FlipImage {

//    https://leetcode.com/problems/flipping-an-image/
//    Input: image = [[1,1,0],[1,0,1],[0,0,0]]
//    Output: [[1,0,0],[0,1,0],[1,1,1]]
//    Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
//    Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]

    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            image[i] = reverseAndInvertArray(image[i]);
        }
        return image;
    }

    public static int[] reverseAndInvertArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = array.length - 1, index = 0; i >= 0 && index < reversed.length; i--, index++) {
            reversed[index] = array[i];
            reversed[index] = reversed[index] == 1 ? 0 : 1;
        }
        return reversed;
    }

}
