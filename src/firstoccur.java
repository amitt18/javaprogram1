import java.util.*;

public class firstoccur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ele = sc.nextInt();
        Arrays.sort(arr);
        int s = 0;
        int e=arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]==ele &&  (mid==0 || arr[mid-1]!=ele)){
                System.out.println(mid+" ");
                break;
            }
            else if(arr[mid]>=ele){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
    }
}
