import java.util.Scanner;

public class Leeftshift {
    static void LeftShift(int[] a,int k) {
        int n = a.length;
        reverseee(a,0,n-1); // complete reverse
        reverseee(a,0,n-k-1); // reverse from 0 to n-k-1
        reverseee(a,n-k,n-1); // reverse n-k to n-1

    }
    static void reverseee(int[] a,int i,int j){
        while(i<j){
            int n=a.length;
            int b=a[i];
            a[i] = a[j];
            a[j] = b;
            i++;
            j--;
        }
    }

    static void print(int[] a) {
        for (int num : a) {
            System.out.println(" " +num);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter k");
        int k=sc.nextInt();
        LeftShift(a,k);
        print(a);
    }
}
