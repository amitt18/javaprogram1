import java.util.Scanner;
public class Valueofindices {
    static int[] Sumofindex(int[] a, int left, int right) {
        int n = a.length;
        int sum = 0;
        for (int i = left; i <=right; i++) {
            sum = sum + a[i];
        }
        System.out.println(sum);
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter left");
        int left = sc.nextInt();
        System.out.println("enter right");
        int right = sc.nextInt();
        Sumofindex(a,left,right);
    }
}
