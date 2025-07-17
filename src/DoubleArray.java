import java.util.Scanner;
public class DoubleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of rows");
        int m = sc.nextInt();
        System.out.println("enter no. of columns");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("enter elements in array");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = i + j;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println("\n");
        }



//                int rows = 80, columns = 5;
//                int[][] marks = new int[rows][columns];
//
//                // initializing the array elements using for loop
//                for (int i = 0; i < rows; i++) {
//                    for (int j = 0; j < columns; j++) {
//                        marks[i][j] = i + j;
//                    }
//                }
//
//                // printing the first three rows of marks array
//                System.out.println("First three rows are: ");
//                for (int i = 0; i < 3; i++) {
//                    for (int j = 0; j < columns; j++) {
//                        System.out.printf(marks[i][j] + " ");
//                    }
//                    System.out.println();
//                }
            }
        }
