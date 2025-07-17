package Recursion;
import java.util.*;
public class sum {

    static int sum(int n){
        if(n==0){
            return 0;
        }
        sum(n-1);
        int res = 0;
        res+=n;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sum(5);
    }
}
