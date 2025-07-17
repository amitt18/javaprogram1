package Sorting;
import java.util.*;
public class Count {
    static int findmax(int[] arr){
        int mx = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
return mx;
    }

    static  void basiccount(int[] arr){
// find the largest element of array
        int max = findmax(arr);
        int[] count = new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int k=0;
        for(int i=0;i<count.length;i++){
          for(int j=0;j<count[i];j++){
              arr[k++]=i;
          }
        }
    }
static void display(int[] arr){
        for(int a:arr){
            System.out.print(a+" ");
        }
}
    public static void main(String[] args) {
        int[] arr = {1,4,5,2,2,5};
        System.out.println("array before sorting");
        display(arr);
        System.out.println();
        basiccount(arr);
        System.out.println("array after sorting");
        display(arr);
    }
}
