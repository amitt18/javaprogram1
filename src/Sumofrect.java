
 // using brute force method;


import java.util.Scanner;
public class Sumofrect {
    static void sumofrectangle(int[][] a, int l1, int l2, int r1, int r2) {


        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum += a[i][j];
            }
        }
        System.out.println(sum);
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
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        sumofrectangle(a,l1,l2,r1,r2);
    }
}
