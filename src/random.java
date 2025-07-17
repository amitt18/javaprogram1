import java.util.Scanner;


 // BEST TIME TO BUY AND SELL STOCK
public class random {
    public static int maxprofit(int[] arr){
        if(arr==null|| arr.length<2) return 0;
        int mi = arr[0];
        int mx = 0;
        for(int i=1;i < arr.length;i++){
            int profit = arr[i]-mi;
            mx  = Math.max(profit,mx);
            mi = Math.min(arr[i],mi);
        }
        return mx;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int profit = 0;

        int[] arr = {12};
        System.out.println(maxprofit(arr));


    }
}
