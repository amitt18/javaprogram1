import java.util.*;
public class binary{
    public static void main(String args[]){
        int[] a= {23,34,54,67,89,90,91,94};
        int target = 89;
        int si = 0;
        int ei = a.length -1;
        while(si<ei){
            int mid = (si + ei) / 2;
            if(a[mid]==target){
                System.out.println(mid);
            }
           else if(a[mid] >target){
                si = mid+1;
            }
            else if(target < a[mid]){
                ei = mid-1;
            }
            else{
                System.out.println("-1");
            }
        }
    }
}