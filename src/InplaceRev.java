import java.util.Scanner;
public class InplaceRev {
    static void swapInArray(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void inplaceRev(int[] arr){
            int n = arr.length;
           int  i = 0;
           int j = n - 1;

            while (i < j) {
                swapInArray(arr, i, j);
                i++;
                j--;
            }

        }
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        inplaceRev(arr);
        System.out.println("reverse array will be");
        printArray(arr);
    }
    }

