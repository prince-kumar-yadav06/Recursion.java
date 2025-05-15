public class NqueenProblem {
    
    // Note :- IF 2 queens cannot  attack each other
    public static void Queen(char board[][],int row){

        if(row == board.length){
            print(board);
            return;
        }

        for(int j=0;j<board.length;j++){
            if(isSafe(board, row, j)){
                board[row][j]='Q';
                Queen(board, row+1);
                board[row][j]='X';
            }

        }
    }

    //isSafe function

    public static boolean isSafe(char board[][],int row,int col){

        // for vertical
        for(int i=row-1, j=col;i>=0 && j>=0;i--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        // for left daigonal
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        // for right daigonal
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]== 'Q'){
                return false;
            }
        }

        return true;

    }
    public static void print(char board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println("-----------");
    }

    public static void main(String args[]){

        int n=4;
        char board[][]=new char[n][n];
         for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='X';
            }
        }

        Queen(board, 0);

    }
}
