import java.util.*;
public class Sumusingrecu {
    public static int sum(int n){
        if(n==1)
        {
            return 1;
        }
        return sum(n-1)+n;
    }
    public static void main(String[] args) {
        int n=5;
        int rees = sum(n);
        System.out.println(rees);
    }
}
