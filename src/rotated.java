import java.util.Scanner;

public class rotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int s=0;
        int e=arr.length-1;
        int ans = -1;
        while (s<=e){
            int mid = s+(e-s)/2;
              if (arr[mid]<=arr[n-1]) {
                ans= mid;
                e = mid-1;
            }
              else{

                      s = mid+1;
              }
        }
        System.out.println(ans);
    }
}
