import java.util.Scanner;
public class Spiral {

    // [1 2 3]
    // [4 5 6]    ==>> output [1,2,3,6,9,8,7,4,5]
    // [7 8 9]
    static void printSpiralMatrix(int[][] matrx, int r, int c) {
        int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;
        int totalElements = 0;
        while (totalElements < r * c) {
            for (int j = leftCol; j <= rightCol && totalElements<r*c; j++) {
                System.out.println(matrx[topRow][j] + " ");
                totalElements++;
            }
            topRow++;
            for (int i = topRow; i <= bottomRow && totalElements<r*c; i++) {
                System.out.println(matrx[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--;
            for (int j = rightCol; j >= leftCol && totalElements<r*c; j--) {
                System.out.println(matrx[bottomRow][j] + " " );
                totalElements++;
            }
            bottomRow--;
            for (int i = bottomRow; i >= topRow && totalElements<r*c; i--) {
                System.out.println(matrx[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows and column of first matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrx = new int[r][c];
        System.out.println("enter elements of ist ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrx[i][j] = sc.nextInt();
            }
        }
        printSpiralMatrix(matrx, r, c);
    }

}