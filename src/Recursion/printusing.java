package Recursion;
import java.util.Scanner;
public class printusing {
    static void  print(int n){
        while(n==1){
            System.out.print("1 ");
            return ;
        }
         print(n-1);
        System.out.print(n+ " ");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
}
