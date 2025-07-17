import java.util.Scanner;
public class Allzeroto {
    static  void AllZero(int[] a){
        int n= a.length;
        int count = 0;
        for(int i=0;i<a.length;i++) {

                if (a[i] != 0) {
                   a[count++] = a[i];
                }
            }
        while (count < n) {
            a[count++] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter  elements of array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        AllZero(a);
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
