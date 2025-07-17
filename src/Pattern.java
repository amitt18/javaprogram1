import java.util.Scanner;
public class Pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, k, row;
        System.out.println("enter no. of rows");
        int rows = sc.nextInt();
        for (i = 1; i <= rows; i++) {
            for (k = 1; k <= rows - i; k++) {
                System.out.print(" ");
            }
            System.out.print("\n");

            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
           // System.out.print("\n");
        }
    }
        }

