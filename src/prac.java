import java.util.*;

public class prac {
    static int maxprofit(int price[],int start,int end){
        if(end<=start){
            return 0;
        }
        int profit =0;
        for(int i=start;i<end;i++){
            for(int j=i+1;j<=end;j++){
                if(price[j]>price[i]){
                    int currpro = price[j]-price[i] + maxprofit(price,start,i-1) +maxprofit(price,j+1,end);
              profit = Math.max(profit,currpro);
                }


            }

        }
        return profit;
    }
    public static void main(String[] args) {
        int price[] = {100, 180, 260, 310,
                40, 535, 695};
    int n = price.length;
        System.out.println(maxprofit(price,0,n-1));
    }

}
