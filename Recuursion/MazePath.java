public class MazePath {
    public static void main(String[] args) {
        int m=3;
        int n=3;
        System.out.println(maze(1,1,m,n));
    }
    public static int maze(int row,int col,int m ,int n){
        if(row==m || col==n){
            return 1;
        }
        int Right=maze(row,col+1,m,n);
        int Down=maze(row+1,col,m,n);
        return Right+Down;
    }
}
