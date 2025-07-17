import java.util.*;
public class knapsack {
    public static void main(String[] args) {
        int[] cost = {232,453,678,343,234};
        int[] quantity = {4,5,1,6,7};
        int k = 10;
        float[] res = new float[cost.length];
        int j=0;
        int l=0;
        for(int i=0;i<res.length;i++){
            res[i] =(float) cost[j]/quantity[l];
            j++;
            l++;
        }
        for(float num:res){
            System.out.println(num+" ");
        }
        Arrays.sort(res);
        
    }
}
