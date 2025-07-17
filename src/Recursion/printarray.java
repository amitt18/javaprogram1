package Recursion;
import java.util.*;
public class printarray {
    static  void  Print(int[] a,int index){
        // Base case
        if(index==a.length){
            return;
        }
        // self work of printng 0th index
        System.out.println(a[index]);
        // recursive call
        Print(a,index+1);

    }
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Print(a,0);
    }
}
