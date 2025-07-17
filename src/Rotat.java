import java.util.*;
public class Rotat {
    static void Rotate(int[] a, int k){
        int n = a.length;
        k = k%n;
        Reverse(a,0,n-k-1);
        Reverse(a,n-k,n-1);
        Reverse(a,0,n-1);
    }
    static void Reverse(int[] a,int start,int end){
        while(start<end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
    static void PrintArray(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size.");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter element of array.");
        for (int i = 0; i < n; i++) {
             a[i] = sc.nextInt();
        }
        System.out.println("enter value of k");
        int k = sc.nextInt();
        Rotate(a, k);
    PrintArray(a);
    }
    }



