package Recursion;
import java.util.*;
public class Sumofdigit {
     static int Sumof(int n) {
        int sum = 0;
        if (n>= 0&& n<=9)
            return n;
        return Sumof(n/10)+n%10;
//        int smallans = Sumof(n/10);
//        return smallans+ n%10;

    }

    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Sumof(n));
    }

}
