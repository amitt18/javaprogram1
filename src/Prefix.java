import java.util.Scanner;
public class Prefix {
//    static void RunningSum(int[] a,int prefix) {
//        int n = a.length;
//        int sum = 0;
//        for (int i = 0; i < prefix; i++) {
//            sum = sum + a[i];
//        }
//        System.out.println(sum);
//    }
static int[] Counting ( int[] a) {
    for (int i = 1; i < a.length; i++) {
        a[i] = a[i] + a[i - 1];
    }
    return a;
}
static void print(int[] a) {
    for (int num : a) {
        System.out.print(". " + num);
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter elements of array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Counting(a);
        print(a);
//        int prefix = sc.nextInt();
//        int sum=0;
//        int k=0;
//        int[] ans = new int[n];
//        for (int i = 0; i < n; i++) {
//            sum = sum + a[i];
//            ans[k++] = sum;
//        }

//            for (int num : ans) {
//                System.out.println(num);
//            }
            // System.out.println("sum of desired prefix will be :" +sum);
        }
    }



