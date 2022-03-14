class Solution {
    int x,y;
    char[][] g;
    public int numIslands(char[][] grid) {
        if(grid.length==0)
            return 0;
        x=grid.length;
        y=grid[0].length;
        g=grid;
        int c=0;
        for(int i=0;i<x;i++)
            for(int j=0;j<y;j++){
                if(g[i][j]=='1'){
                    c++;
                    dfs(i,j);
                }
            }
        return c;
        
    }
    public void dfs(int i,int j){
        if(i<0 || i>=x ||j<0 || j>=y || g[i][j]!='1')
            return;
        g[i][j]='0';
        dfs(i+1,j);
        dfs(i-1,j);
        dfs(i,j+1);
        dfs(i,j-1);
    }
}