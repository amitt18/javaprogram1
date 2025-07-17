package Recursion;
import java.util.*;
public class printkmultipleofnum {
    static void printmultiple(int n,int k){
        // base case
        if(k==1) {
            System.out.print(n+" ");
            return ;
        }
        // Recursive work
        //int ans=n*k;
      //  System.out.println(ans);
        printmultiple(n,k-1);
        //int ans=n*k;
        // self work
        System.out.print(n*k+" ");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        printmultiple(n,k);
    }
}
