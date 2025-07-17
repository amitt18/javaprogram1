import java.util.Scanner;
public class Asort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter elements of array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] ans = new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(a[i] == 0){
                ans[j++] = a[i];
            }
        }
        for(int i=0;i<n;i++){
            if(a[i] ==1){
                ans[j++] = a[i];
            }
        }
        for(int i=0;i<n;i++){
            System.out.print( " " +ans[i]);
        }
    }
}