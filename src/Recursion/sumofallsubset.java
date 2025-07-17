package Recursion;
import java.util.*;
public class sumofallsubset {

    static void subsetsum(int[] a,int n,int idx,int sum){
        if(idx>=n){
            System.out.println(sum);
            return;
        }
        // cuur ind+sum
        subsetsum(a,n,idx+1,sum+a[idx]);

subsetsum(a,n,idx+1,sum);
        // curr ans
    }
    public static void main(String[] args) {
int[] a  ={2,4,5};
subsetsum(a,a.length,0,0);
    }
}
