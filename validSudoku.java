class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Validate columns
        for (int col = 0; col < 9; col++) {
            Set<Character> st = new HashSet<>();
            
            for (int row = 0; row < 9; row++) {
                if (board[row][col] == '.') continue;
                
                if (st.contains(board[row][col])) {
                    return false;
                }
                
                st.add(board[row][col]);
            }
        }
        
        // Validate rows
        for (int row = 0; row < 9; row++) {
            Set<Character> st = new HashSet<>();
            
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') continue;
                
                if (st.contains(board[row][col])) {
                    return false;
                }
                
                st.add(board[row][col]);
            }
        }
        
        // Validate 3x3 boxes
        for (int sr = 0; sr < 9; sr += 3) {
            for (int sc = 0; sc < 9; sc += 3) {
                if (!validBox(board, sr, sr + 2, sc, sc + 2)) {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    private boolean validBox(char[][] board, int sr, int er, int sc, int ec) {
        Set<Character> st = new HashSet<>();
        
        for (int i = sr; i <= er; i++) {
            for (int j = sc; j <= ec; j++) {
                if (board[i][j] == '.') continue;
                
                if (st.contains(board[i][j])) {
                    return false;
                }
                
                st.add(board[i][j]);
            }
        }
        
     return true;
    }

}
