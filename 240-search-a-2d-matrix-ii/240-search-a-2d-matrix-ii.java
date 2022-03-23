public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null)
            return false;
        int col=matrix[0].length-1,row=0, rowfin=matrix.length-1;
        while(col>=0 && row<=rowfin){
            if(target==matrix[row][col])
                return true;
            else
                if(target>matrix[row][col])
                    row++;
            else
                col--;
        }
        return false;
    }
}