import java.util.Scanner;

public class Asort2 {
    static void Zero(int[] a) {
        int n = a.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {

            if (a[left]==1 && a[right]==0) {
                Swap(a, left, right);
                left++;
                right--;
            }
else if (a[left]==0){
         left++;
            }
else if(a[right]==1){
         right--;
            }
        }
    }

    static void Swap(int[] a, int left, int right) {
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter elements of array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Zero(a);
        for(int num:a){
            System.out.println(num);
        }
//            for (int i=0;i<n;i++) {
//                System.out.println(" " + a[i]);
//            }
        }
    }

