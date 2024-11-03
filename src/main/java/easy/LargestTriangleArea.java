package easy;

public class LargestTriangleArea {
    // https://leetcode.com/problems/largest-triangle-area/description/

    public double largestTriangleArea(int[][] points) {
        if (points.length < 3) return 0;
        double area = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                for (int k = j + 1; k < points.length ; k++) {
                    double currArea = Math.abs(findArea(points[i], points[j], points[k]));
                    area = Math.max(area, currArea);
                }
            }
        }
        return area;

    }

    private double findArea(int[] A, int[]B, int[]C){
        int x = 0;
        int y = 1;
        return (double) (A[x] * (B[y] - C[y]) + B[x] * (C[y] - A[y]) + C[x] * (A[y] - B[y])) / 2;
    }

    public static void main(String[] args) {
        LargestTriangleArea triangleArea = new LargestTriangleArea();
        int[][] points = new int[][]{{0,0},{0,1},{1,0},{0,2},{2,0}};
        System.out.println(triangleArea.largestTriangleArea(points));

    }

}
