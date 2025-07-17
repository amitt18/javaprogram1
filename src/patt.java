import java.util.ArrayList;
import java.util.Scanner;

public class patt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<n-k+1;i++){
            int max = arr[i];
            for(int j=i;j<i+k;j++){
                if(arr[j]>max) max = arr[j];

            }
            ans.add(max);
        }
        System.out.println(ans);
    }
}

