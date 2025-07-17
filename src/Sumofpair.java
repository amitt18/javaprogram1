import java.util.*;
public class Sumofpair {
    static void SumOfPair(int[] a,int tar){
        for(int i=0;i<a.length/2;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]+a[j] ==tar){
                    System.out.println(a[i]+" "+a[j]);
                }
            }
        }
    }
    public static  void main(String[] args){
        int[] a = {1,2,3,4,5};
        int tar = 5;
        SumOfPair(a,tar);
    }

}
