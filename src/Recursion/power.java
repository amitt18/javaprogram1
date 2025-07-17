package Recursion;
import java.util.*;
public class power {
    static int pow(int p,int q){

        // it is base case common in both method
        if(q==0){
            return 1;
        }
        // ist method
       // return pow(p, q-1)*p;


        // second method
        int sm=pow(p,q/2);
        if(q%2==0){
            return  sm*sm;
        }

        return p*sm*sm;
    }
    public static void main(String[] args) {
        System.out.println(pow(2,4));
    }
}
