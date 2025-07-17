package BackTraking;

public class Printpath {
    public static void main(String[] args) {
        int rows = 3;
        int col = 3;
         print(1,1,rows,col,"");

    }

    private static void print(int sr, int sc, int er, int ec,String s) {
          if(sr>er|| sc>ec) return ;
          if(sr==er && sc==ec){
              System.out.println(s);
              return;
          }
          print(sr+1,sc,er,ec,s+"D");
        print(sr,sc+1,er,ec,s+"R");


    }
}
