import java.util.Scanner;
public class RotateArray {
    static int[] rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse (arr,0,n-k-1);
        reverse (arr,n-k,n-1);
        reverse(arr,0,n-1);
//        reverse (arr,0,n-1);
//        reverse (arr,0,k-1);
//        reverse(arr,k,n-1);
        return arr;
    }
    static void reverse(int[] arr,int start,int end){
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter k");
        int k = sc.nextInt();
         rotateArray(arr,k);
        System.out.println("array after rotation ");
        printArray(arr);
    }

}
