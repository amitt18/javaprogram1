package Sorting;
import java.util.*;
public class bubble {
    static void bsort(int[] a){
        int n = a.length;
        for(int i=0;i<n-1;i++){
            boolean flag  =false;
            for(int j=0;j<n-i-1;j++){
                if (a[j]>a[j+1]){
                    int temp= a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=true;
                }
            }
            // use for optimize code
            if(!flag){
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {132,44,2,53,76,32,11,32,6,54};
  bsort(a);
 for(int n:a){
     System.out.print(n+" ");
 }
    }
}
