import java.util.Scanner;
public class Sorted {
    static boolean CheckSorted(int[] a) {
        for (int i = 0; i < a.length-1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter  elements of array");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Is the  array sorted? " +CheckSorted(a));
    }
}
