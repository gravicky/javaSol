class Solution {
    int x,y;
    char[][] gr;
    public int numIslands(char[][] grid) {
        x=grid.length;
        if(x==0)
            return 0;
        y=grid[0].length;
        int c=0;
        gr=grid;
        for(int i=0;i<x;i++)
            for(int j=0;j<y;j++)
                if(gr[i][j]=='1'){
                    c++;
                    dfs(i,j);
                }
        return c;
        
    }
    public void dfs(int i,int j){
        if(i<0 || j<0 || i>=x || j>=y || gr[i][j]=='0')
            return;
        gr[i][j]='0';
        dfs(i-1,j);
        dfs(i,j-1);
        dfs(i+1,j);
        dfs(i,j+1);
    }
}