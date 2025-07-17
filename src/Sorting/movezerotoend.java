package Sorting;
import java.util.*;

// FIRST METHOD
public class movezerotoend {
    static int[] findzero(int[] a){
        int n=a.length;
        int[] res = new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                res[k++]=a[i];
            }
        }
        while(k<n){
            res[k++]=0;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {0,5,0,3,8,0,42};
        int[] res = findzero(a);
        for(int b:res){
            System.out.println(b);
        }
    }
}
