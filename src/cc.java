import java.util.*;
public class cc {
    public static void display(int[] arr){
        for(int a:arr){
            System.out.println(a);
        }
    }
    public static void merge(int[] arr,int l,int mid,int r){
        int n1= mid-l+1;
        int n2 = r-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];

    }

public static void mergesort(int[] arr,int l,int r){
        int mid = (l+r)/2;
        mergesort(arr,l,mid);
        mergesort(arr,mid+1,r);
        merge(arr,l,mid,r);
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {4,2,7,6,3};
        System.out.println("before sort");
        display(arr);
    }

}
