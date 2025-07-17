package Recursion;
import java.util.Scanner;
public class printn {
    static void print(int n){  // n to 1
        if(n==1){   // Base case
            System.out.println("1");
            return ;
        }
        System.out.println(n);  // self work
         print(n-1);        // recursive work
    }
    // print natural no. from n to 1 using recursion
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
}
