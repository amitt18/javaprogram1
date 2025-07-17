
import java.util.Scanner;
public class Maxandmin {
    static void Max(int[] a) {
        int max = a[0];
        for (int i=0;i<a.length;i++) {
            if (a[i]> max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }

    static void Min(int[] a) {
        int min = a[0];
        for (int i=0;i<a.length;i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of aarray");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter  elements of array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Max(a);
        Min(a);
    }
}
