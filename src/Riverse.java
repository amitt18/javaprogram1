import java.util.*;
public class Riverse {
    static void Reeveerse(int[] a){
        int n = a.length;
       int[] ans = new int[n];
        int j=0;
            for(int i=n-1;i>=0;i--){
                ans[j++] = a[i];
            }
//        for (int i=0;i<n;i++){
//            System.out.println("" +ans[i]);
//        }
        }
//    static void Swap(int[] a, int i,int j){
//        i=i+j;
//        j=i-j;
//        i=i-j;
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] ans = new int[n];
        System.out.println("enter elements of array");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
//        int[] ans=  Reeveerse(a);
        for (int i=0;i<n;i++){
            System.out.println("" +ans[i]);
        }
    }

}
