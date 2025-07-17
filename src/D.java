import java.util.Scanner;
public class D {
    static void Multiply(int[][] a,int m,int n,int[][]b,int o,int p) {
        if (n != o) {
            System.out.println("multiplication not");
            return;
        }
        int[][] mul = new int[m][p];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    mul[i][j] += (a[i][k] *b[k][j]);
                }
            }
        }
        System.out.println("multiplication");
        print(mul);
    }
    static void Sum(int[][] a,int m,int n,int[][] b,int o,int p){
        if(m!=o || n!=p){
            System.out.println("wrong input");
            return;
        }
        int[][] sum = new int[m][n];
        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n; j++) {
                sum[i][j] = a[i][j] +b[i][j];
            }
        }
        print(sum);
    }

    static void Transpose(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i] != a[j]) {
                    swap(a, i, j);
                }
            }
        }
    }

    static void swap(int[][] a, int i, int j) {
        int temp = a[i][j];
        a[j][i] = a[i][j];
        a[i][j] = temp;
    }

    static void print(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println(" ");
        }
    }
   static void Reverse(int[][] a,int m,int n){  //wrong hai ye function
        int[][] asn = new int[m][n];
        int t=0,r=0;
        for(int i=m-1;i>0;i--){
            for(int j=n-1;j>0;j--){
              asn[t++][r++] = a[i][j];
            }
        }
        print(asn);
   }
static int[][] FindTranspose(int[][] a,int m,int n){
        int[][] ans = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[i][j] = a[j][i];
            }
        }
        return ans;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows and column of first matrix");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        System.out.println("enter elements of ist ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
//            System.out.println("enter no of rows and column  of 2nd");
//            int o = sc.nextInt();
//            int p = sc.nextInt();
//            int[][] b = new int[o][p];
//            System.out.println("enter elements of 2nd");
//            for (int i = 0; i < o; i++) {
//                for (int j = 0; j < p; j++) {
//                    b[i][j] = sc.nextInt();
//                }
//            }
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print( " " +a[i][j]);
//            }
//            System.out.println(" ");
//        }
           // Sum(a,m,n,b,o,p);
            //Transpose(a);
            //print(a);
       // Multiply(a,m,n,b,o,p);
       // Reverse(a,m,n);
        FindTranspose(a,m,n);
       // print(a);
        }
    }




