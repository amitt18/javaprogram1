import java.util.Scanner;
public class ReeverseArray {
    static void swapNo(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverseArray(int[] arr,int k) {
        int n = arr.length;
        int i = k;
        int j = n -1;
        while (i < j) {
            swapNo(arr, i, j);
            i++;
            j--;
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter element");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter value of k");
        int k = sc.nextInt();
        reverseArray(arr,k);
        printArray(arr);
    }
}