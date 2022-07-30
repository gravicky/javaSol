class Solution {
    public void gameOfLife(int[][] board) {
        if(board == null || board.length == 0)
            return;
        int len = board.length, br = board[0].length;
        for(int i=0;i<len;i++){
            for(int j = 0;j<br;j++){
                int lives = numlive(board,i,j,len,br);
                if(board[i][j] ==1 && lives>=2 && lives<=3)
                    board[i][j] = 3;
                if(board[i][j] == 0 && lives == 3)
                    board[i][j] = 2;
            }
        }
        for(int i=0;i<len;i++){
            for(int j = 0;j<br;j++){
                board[i][j] >>=1;
            }
        }
    }
    public int numlive(int[][] board,int i,int j,int len,int br){
        int lives = 0;
        for(int x = Math.max(0,i-1);x<=Math.min(len-1,i+1);x++)
             for(int y = Math.max(0,j-1);y<=Math.min(br-1,j+1);y++){
                 lives+= board[x][y]&1;
             }
        lives-= board[i][j]&1;
        return lives;
    }
}