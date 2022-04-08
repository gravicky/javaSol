class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++)
            for(int j=0;j<board[0].length;j++){
                if(word.charAt(0)==board[i][j] && help(board,word,i,j,0))
                    return true;
            }
        return false;
        
    }
    
    public boolean help(char[][] b, String w, int i,int j, int index){
        if(index==w.length())
            return true;
        if(i<0 || i>=b.length || j<0 || j>=b[0].length || w.charAt(index)!=b[i][j])
            return false;
        b[i][j]='0';
        if(help(b,w,i-1,j,index+1) || help(b,w,i,j-1,index+1) || help(b,w,i+1,j,index+1) || help(b,w,i,j+1,index+1) )
            return true;
        b[i][j]=w.charAt(index);
        return false;
    }
}