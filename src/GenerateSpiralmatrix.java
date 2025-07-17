import java.util.Scanner;
public class GenerateSpiralmatrix {
    static void printMatrix(int[][] matrx){
      for(int i=0;i< matrx.length;i++){
          for(int j=0;j<matrx[i].length;j++ ){
              System.out.println(matrx[i][j] + " ");
          }
      }
    }
    static int[][] printSpiralMatrix(int n) {
        int[][] matrx = new int[n][n];

        int topRow = 0, bottomRow = n - 1, leftCol = 0, rightCol = n - 1;
        int curr = 1;
        while (curr<= n*n) {
            for (int j = leftCol; j <= rightCol && curr<=n*n; j++) {
                matrx[topRow][j] =curr;
                curr++;
            }
            topRow++;
            for (int i = topRow; i <= bottomRow && curr<=n*n; i++) {
                matrx[i][rightCol] =curr;
                curr++;
            }
            rightCol--;
            for (int j = rightCol; j >= leftCol && curr<=n*n; j--) {
                matrx[bottomRow][j] =curr;
                curr++;
            }
            bottomRow--;
            for (int i = bottomRow; i >= topRow&& curr<=n*n; i--) {
                matrx[i][leftCol]=curr;
                curr++;
            }
            leftCol++;
        }
        printMatrix(matrx);
        return matrx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of matrix matrix");
        int n = sc.nextInt();
        printSpiralMatrix(n);
    }

}

