import java.util.*;
public class sort012 {
    public static void main(String[] args) {
        int arr[] = {1,2,0,1,1,0,2,2,1};
        int i=0; // this is for 0
        int j=0; // this is for traversal
         int k=arr.length-1;  // this is for 2
         while(j<=k){
             if(arr[j]==1){
                 j++;
             }
             else if(arr[j]==0){
                 int temp=arr[i];
                 arr[i]=arr[j];
                 arr[j] = temp;
                 i++;
                 j++;
             }
             else if(arr[j]==2){
                 int temp=arr[k];
                 arr[k]=arr[j];
                 arr[j] = temp;
                 k--;
             }
         }
         for(int n:arr){
             System.out.println(n);
         }
    }
}
