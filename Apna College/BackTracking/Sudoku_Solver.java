/**
 * Sudoku_Solver
 */
public class Sudoku_Solver {
    public static boolean isSafe(char[][]board,int row,int col,int number){
        // Check the number in the row
        for(int x = 0;x<9;x++){
            if(board[row][x]==(char)(number+48)){
                return false;
            }
        }

        // check the number in the column
        for(int x = 0;x<9;x++){
            if(board[x][col]==(char)(number+48)){
                return false;
            }
        }

        // check Grid wise
        int startRow = (row/3)*3;
        int startCol = (col/3)*3;
        for(int i = startRow;i<startRow+3;i++){
            for(int j = startCol;j<startCol+3;j++){
                if(board[i][j]==(char)(number+48)){
                    return false;
                }
            }
        }
        return true;

    }

    public static boolean helper(char [][] board,int row,int col){
        if(row==board.length){
            return true;
        }
        int nrow=0;
        int ncol=0;
        if(col!=board.length-1){
            nrow=row;
            ncol=col+1;

        }
        else{
            nrow=row+1;
            ncol=0;
        }

        if(board[row][col]!='.'){
            if(helper(board, nrow, ncol)){
                return true;
            }
        }
        else{
            for(int i=1;i<=9;i++){
                if(isSafe(board,row,col,i)){
                    board[row][col]=(char)(i+48);
                    if(helper(board, nrow, ncol)){
                        return true;
                    }
                    else{
                        board[row][col]='.';
                    }
                }
            }
        }
        return false;
    }

    public static boolean solveSudoku(char[][] board){
        return helper(board,0,0);
    }

    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
            if (solveSudoku(board)) {
                System.out.println("Sudoku solved successfully!");
                printBoard(board);
            } else {
                System.out.println("No solution exists.");
            }
            
        
    }
    public static void printBoard(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

}