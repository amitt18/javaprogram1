package Recursion;
import java.util.*;
public class gcd2 {
    static int gcd(int x,int y){
        while(y%x!=0){
     int rem = y%x;
     y=x;
     x=rem;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println(gcd(12,15));
    }
}
