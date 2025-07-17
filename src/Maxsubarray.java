import java.util.*;
public class Maxsubarray {
    static int MaxSubarray(int[] a){
        int res = a[0];
        for(int i=0;i<a.length;i++){
            int currSum=0;
            for(int j=i;j<a.length;j++){
                currSum+=a[j];
                res = Math.max(res, currSum);
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] a = {1,4,7,-2,-3};
        System.out.println(MaxSubarray(a));
    }

}
