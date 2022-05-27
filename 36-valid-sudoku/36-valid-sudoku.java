class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet set = new HashSet<>();
        char num = 0;

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){

                num = board[i][j];
                if((num !='.')){

                    if(!set.add(num + " in row " + i) || !set.add(num + " in column " + j) || !set.add(num + " in block[" + i/3 + "," + j/3 + "]")){
                        
                        return false;
                        
                    }

                }

            }
        }
        
        return true;

    }
}