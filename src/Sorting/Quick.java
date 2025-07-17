package Sorting;
import java.util.*;
public class Quick {
    static void display(int[] arr){
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
    static void swap(int[] arr,int x,int y){
        int temp= arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static int partition(int[] arr,int st,int end){
        int pivot=arr[st];
        int cnt=0;
        for(int i= st+1;i<=end;i++){
            if(arr[i]<pivot)cnt++;
        }
        int pivotIdx = st+cnt;
        swap(arr,st,pivotIdx);
        int i=st,j=end;
        while (i<pivotIdx && j>pivotIdx){
            while (arr[i]<=pivot)i++;
            while (arr[j]>pivot)j--;

            if(i<=pivotIdx && j>pivotIdx){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }
    static void qsort(int[] arr,int st,int end){
if(st>=end) return;;
int pi= partition(arr,st,end);
 qsort(arr,st,pi-1);
 qsort(arr,pi+1,end);
    }
    public static void main(String[] args) {
        int[] arr = {6,3,1,5,4};
        System.out.println("Array before sorting");
        display(arr);
        System.out.println();
        qsort(arr,0,arr.length-1);
        System.out.println("Array after sorting");
        display(arr);
    }
}
