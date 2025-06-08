public class sudokoSolver {
    
    // check krenge row or col pe phle se digti to nhi hai
    //aur grid 3*3 me bhi check krenge
    public static boolean isSafe(int grid[][],int row,int col,int digit){

        // check in row
        for(int i=0;i<=8;i++){
            if(grid[i][col]== digit){
                return false;
            }
        }
        // check in col
        for(int j=0;j<=8;j++){
            if(grid[row][j]== digit){
                return false;
            }
        }

        // check for grid
        int strow=(row/3) *3;
        int stcol=(col/3) *3;


    for(int i=strow;i<strow+3;i++){
     for(int j=stcol;j<stcol+3;j++){
        if(grid[i][j] == digit){
            return false;
        }
     }
    }
        return true;
    }

    public static boolean Solution(int grid[][],int row,int col){

        if(row ==9){
            return true;
        }

        int nextrow=row;
        int nextcol=col+1;

        if(col ==8){
            nextrow=row+1;
            nextcol=0;
        }

        // /recursion

        if(grid[row][col] != 0){
           return Solution(grid, nextrow, nextcol);
        }
           else{

        for(int digit=1;digit <=9;digit++){

            if(isSafe(grid, row, col,digit)){
                grid[row][col]=digit;
                if(Solution(grid, nextrow, nextcol)){
                    return true;
                }
                else{
                    grid[row][col]=0;
                }
            }
        }
    }
        return false;
    }

    public static void printsuduko(int suduko[][]){

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(suduko[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){

         int[][] grid = {
            {3, 0, 6, 5, 0, 8, 4, 0, 0},
            {5, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 8, 7, 0, 0, 0, 0, 3, 1},
            {0, 0, 3, 0, 1, 0, 0, 8, 0},
            {9, 0, 0, 8, 6, 3, 0, 0, 5},
            {0, 5, 0, 0, 9, 0, 6, 0, 0},
            {1, 3, 0, 0, 0, 0, 2, 5, 0},
            {0, 0, 0, 0, 0, 0, 0, 7, 4},
            {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        Solution(grid,0,0);
        printsuduko(grid);

        
    }
}
