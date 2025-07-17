import java.util.Scanner;
public class ReverseArray {
  static int[] reverseArray(int[] arr){
      int j=0;
      int n=arr.length;
      int[] ans = new int[n];
      for( int i=n-1;i>=0;i--){
          ans[j++] = arr[i];
      }
      return ans;
  }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " +n+ " elements");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] ans = reverseArray(arr);
        for (int i=0;i<ans.length;i++){
            System.out.print(ans[i] + " ");
        }
    }
}
