class Solution {
    public int uniquePaths(int m, int n) {
        return unique(m-1,n-1,new int[n][m]);
        
    }
    public int unique(int x,int y,int[][] memo){
        if(x<0 || y<0)
            return 0;
        if(x==0 || y==0)
            return 1;
        if(memo[y][x]>0)
            return memo[y][x];
        memo[y][x] = unique(x-1,y,memo) + unique(x,y-1,memo); 
        return memo[y][x];
    }
}