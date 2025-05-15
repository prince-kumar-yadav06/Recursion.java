public class Nqueen {
    
    // Note :- IF 2 queens can attack each other
    public static void Queen(char board[][],int row){

        if(row == board.length){
            print(board);
            return;
        }

        for(int j=0;j<board.length;j++){
            board[row][j]='Q';
            Queen(board, row+1);
            board[row][j]='X';

        }
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

        int n=2;
        char board[][]=new char[n][n];
         for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='X';
            }
        }

        Queen(board, 0);

    }
}
