import java.util.Scanner;
public class SumOf {
    public  static  int sumof(int n) {
        if(n==0) return 0;
            int r = n % 10;
            int sum = r+sumof(n/10);
        return sum;
    }
    public static void main(String[] args) {
        int n= 9876;
       int result =  sumof(n);
        System.out.println(result);
    }
}
