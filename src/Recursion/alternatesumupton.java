package Recursion;
import java.util.*;
public class alternatesumupton {
    static int sum(int n){
        if(n==0){
            return 0;
        }
        if(n%2!=0) {
            return sum(n - 1) + n;
        }
        return sum(n - 1) - n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}
