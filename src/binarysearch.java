import java.util.Arrays;
import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ele = sc.nextInt();
        Arrays.sort(arr);
    bs(arr,ele,0,n);
    }
        public static void bs(int[] arr,int ele,int start,int end) {
            while (start <= end) {
                int mid = start + end / 2;
                if (arr[mid] == ele) {
                    System.out.println(mid);
                    break;
                } else if (arr[mid] > ele) {
                     end = mid-1;
                }
                else{
                   start = mid+1;
                }
            }

        }
    }

