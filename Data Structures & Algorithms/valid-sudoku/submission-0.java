class Solution {
    private boolean checkAllRows(char[][] board){
        Set<Character> set= new HashSet<>();
        for(int r=0;r<board.length;r++){
            for(int c=0;c<board[r].length;c++){
                char value=board[r][c];
                if(value=='.'){
                    continue;
                }
                if(set.contains(value)){
                    return false;
                }else{
                    set.add(value);
                }
            }
            set.clear();
        }
        return true;
    }
    private boolean checkAllCol(char[][] board){
        Set<Character> set= new HashSet<>();
        for(int c=0;c<board.length;c++){
            for(int r=0;r<board[c].length;r++){
                char value=board[r][c];
                if(value=='.'){
                    continue;
                }
                if(set.contains(value)){
                    return false;
                }else{
                    set.add(value);
                }
            }
            set.clear();
        }
        return true;
    }
    private boolean checkAllSquares(char[][] board){
        Set<Character> set= new HashSet<>();
        for(int r=0;r<board.length;r+=3){
            for(int c=0;c<board[r].length;c+=3){
                for(int m=r;m<r+3;m++){
                    for(int n=c;n<c+3;n++){
                        char value=board[m][n];
                        if(value=='.'){
                            continue;
                        }
                        if(set.contains(value)){
                            return false;
                        }
                        set.add(value);
                    }
                }
                set.clear();
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        return checkAllRows(board) &&  checkAllCol(board) && checkAllSquares(board);
    }
}
