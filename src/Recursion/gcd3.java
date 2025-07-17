package Recursion;
import java.util.*;
public class gcd3 {
    static  int gcd(int x,int y){
        if(y==0){
            return x;
        }
        return gcd(y,x%y);
    }
    // lcm*gcd = x*y  so lcm== (x*y)/gcd
    static int lcm(int x,int y,int gcd){
        return (x*y)/gcd
;    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(gcd(24,15));
        System.out.println(lcm(10,50,gcd(10,20)));
    }
}
