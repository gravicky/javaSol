public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length<0 || matrix[0].length<0)
            return false;
        int col=matrix[0].length-1,row=0, rowfin=matrix.length-1;
        while(col>=0 && row<=rowfin){
                if(target>matrix[row][col])
                    row++;
            else
                if(target<matrix[row][col])
                    col--;
            else
                return true;
        }
        return false;
    }
}