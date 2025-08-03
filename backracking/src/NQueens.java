import java.util.*;

public class NQueens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        char[][] board = new char[n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j]='.';
            }
        }
        nqueen(board,0);
    }
    public static void print(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void nqueen(char[][] board,int row){
        if(row==board.length){
            print(board);
            System.out.println();
            return;
        }
        for(int col=0;col<board[0].length;col++){
            if(isSafe(board,row,col)){
                board[row][col]='Q';
                nqueen(board,row+1);
                board[row][col]='.';
            }
        }
    }
    public static boolean isSafe(char[][] board,int row,int col){
        //vertical
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //digonal left
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //digonal right
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
}