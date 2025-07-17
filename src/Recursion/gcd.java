package Recursion;
import java.util.*;
public class gcd {
    static int Gcd(int n1,int n2){
        for(int i=n1;i>=1;i--){
            if(n1%i==0 && n2%i==0)
                return i;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(Gcd(n1,n2));
    }
}
