class Solution {
    public boolean isValidSudoku(char[][] board) {
        int row = board.length;
        int col = board[0].length;
        //checking in rows
        for(int i=0;i<row;i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=0;j<col;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(set.contains(board[i][j])){
                    return false;
                }
                set.add(board[i][j]);
            }
        }
        
        //checking in columns
        for(int k=0;k<col;k++){
            HashSet<Character>set = new HashSet<>();
            for(int l=0;l<row;l++){
                if(board[l][k]=='.'){
                    continue;
                }
                if(set.contains(board[l][k])){
                    return false;
                }
                set.add(board[l][k]);
            }
        }
        
        // checking for blocks
        
        for(int i=0;i<row;i+=3){
            for(int j=0;j<col;j+=3){
                
                if(!checkBlock(i,j,board)){
                    return false;
                }
            }
        }
        return true;
        
    }
    public boolean checkBlock(int indxI , int indxJ,char[][]board){
        int row=indxI+3;
        int col=indxJ+3;
        HashSet<Character> set = new HashSet<>();

        for(int i=indxI;i<row;i++){
            for(int j=indxJ;j<col;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(set.contains(board[i][j])){
                    return false;
                }
                set.add(board[i][j]);
                
            }
        }
        return true;
    }
}