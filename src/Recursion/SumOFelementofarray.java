package Recursion;
import java.util.*;
public class SumOFelementofarray {
    static int sum(int[] a,int ind){
        // base case
        if(ind==a.length-1){
            return a[ind];
        }
        // this is also use as a base case
//        if(ind==a.length){
//            return 0;
//        }
        return sum(a,ind+1)+a[ind];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] =sc.nextInt();
        }
        System.out.println(sum(a,0));
    }
}
