import java.util.Scanner;
public class Countofoccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter elements of array");
           for(int i=0;i<n;i++) {
               a[i] = sc.nextInt();
           }
        System.out.println("enter target");
           int t = sc.nextInt();
           for(int i=0;i<n;i++){
               if(a[i] == t){
                   count++;
               }
           }

        System.out.println("the occurence of target value is:" +count);
    }
}
