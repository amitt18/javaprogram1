import java.util.Scanner;

public class findtarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int tar = sc.nextInt();

        System.out.println(Ft(arr,0,n-1,tar));
    }
    static int Ft(int[] arr,int s,int e,int tar) {
        int ans = 0;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == tar) {
                return mid;
            } else if (arr[mid] < arr[e]) {
                if (tar > arr[mid] && tar <= arr[e]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            } else {
                if (tar >= arr[s] && tar < arr[mid]) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
        }

return -1;
    }



}
