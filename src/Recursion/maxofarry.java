package Recursion;
import java.util.*;
public class maxofarry {
    static int max(int[] a,int ind){
        if(ind==a.length-1){
            return a[ind];
        }
       int sa= max(a,ind+1);
        return  Math.max(a[ind],sa);
    }
    public static void main(String[] args) {
        int[] a = {1,4,2,7,6};
        System.out.println(max(a,0));
    }
}
