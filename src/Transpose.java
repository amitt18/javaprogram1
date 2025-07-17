import java.util.Scanner;
public class Transpose {
    static int[][] FindTranspose(int[][] a,int r,int c){
        int ans[][] = new int[c][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                    ans[j][i] = a[i][j];
                }
            }
        print(ans);
        return ans;
    }
static void print(int[][] ans){
        for(int i=0;i<ans.length;i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println(" ");
        }
}

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter row and column");
        int r=sc.nextInt();
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j] = sc.nextInt();
            }
        }
        int[][] ans = FindTranspose(a,r,c);
    }
}
