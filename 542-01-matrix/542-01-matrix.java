class Solution {
    public int[][] updateMatrix(int[][] mat) {
        if(mat.length==0 || mat[0].length==0)
            return mat;
        int rec = mat.length*mat[0].length;
        for(int i=0;i<mat.length;i++)
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]!=0){
                    int top=(i>0)?mat[i-1][j]:rec;
                    int right=(j>0)?mat[i][j-1]:rec;
                    mat[i][j]=Math.min(top,right)+1;
                }
            }
        for(int i=mat.length-1;i>=0;i--)
            for(int j=mat[0].length-1;j>=0;j--){
                if(mat[i][j]!=0){
                    int bot=(i<mat.length-1)?mat[i+1][j]:rec;
                    int left=(j<mat[0].length-1)?mat[i][j+1]:rec;
                    mat[i][j]=Math.min(Math.min(bot,left)+1,mat[i][j]);
                }
            }
        return mat;
    }
}