import java.util.Scanner;
public class Reeveerse {
    public  static int[] ReverseArrayy(int[] a) {
        int j=0;
        int n=a.length;
        int[] ans=new int[n];
        for(int i=n-1;i>=0;i--) {
            ans[j++] = a[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter elements of array");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
       int[] ans= ReverseArrayy(a);
        for(int i=0;i<n;i++) {
            System.out.println(ans[i]);

        }
    }
}
