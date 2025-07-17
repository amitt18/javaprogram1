package BackTraking;

public class FourDirectionMaze {
    public static void main(String[] args) {
        int rows = 3;
        int col = 3;
        boolean[][] isvisited = new boolean[rows][col];
        print(0,0,rows-1,col-1,"",isvisited);
    }
    private static void print(int sr, int sc, int er, int ec,String s,boolean[][] isvisited) {
        if(sr<0 || sc<0) return;
        if(sr>er|| sc>ec) return ;
        if(isvisited[sr][sc]==true) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        isvisited[sr][sc] = true;
        print(sr,sc+1,er,ec,s+"R",isvisited); // GO RIGHT
        print(sr+1,sc,er,ec,s+"D",isvisited); // GO DOWN
        print(sr,sc-1,er,ec,s+"L",isvisited); // GO LEFT
        print(sr-1,sc,er,ec,s+"U",isvisited); // GO UP
        isvisited[sr][sc] = false;
    }
}
