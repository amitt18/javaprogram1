import java.util.*;
public class Paatern {
    public static void main(String[] args) {
        int n = 6;
       // int temp=1;
        for(int i=1;i<=n;i++) {
            int temp=1;
            System.out.print(i+ " ");
            for (int j = 1; j < n-i; j++) {
               // int temp=1;
                 temp=  temp* i + n+1-j;
                System.out.print(temp + " ");

            }
            System.out.println(" ");
        }
    }
}
