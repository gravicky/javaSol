public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        // Start from left bottom, 
        // when matrix[x][y] > target, exclude x row by moving to top
        // when matrix[x][y] < target, exclude y column by moving to right
        int r = rows - 1;
        int c = 0;
        while (r >= 0 && c < cols) {
            if (matrix[r][c] > target) {
                r --;
            } else if (matrix[r][c] < target) {
                c ++;
            } else {
                return true;
            }
        }
        return false;
    }
}