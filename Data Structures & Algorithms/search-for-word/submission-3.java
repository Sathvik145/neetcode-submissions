class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(solve(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean solve(char[][] board,String word,int i,int j,int ind){
        if(ind==word.length()){
            return true;
        }
         int m=board.length;
        int n=board[0].length;
        if(i<0 || j<0 || i>=m || j>=n || board[i][j]!=word.charAt(ind)){
            return false;
        }
        char temp=board[i][j];
        board[i][j]='#';

        boolean found=solve(board,word,i+1,j,ind+1) ||
        solve(board,word,i,j+1,ind+1) ||
        solve(board,word,i-1,j,ind+1) ||
        solve(board,word,i,j-1,ind+1) ;

        board[i][j]=temp;

        return found;
    }
}
