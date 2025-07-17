import java.util.*;
public class temp {
     static boolean isPowerOfThree(int n) {
        for(int i=0;i<n;i++){
            if(Math.pow(2,i)==n)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPowerOfThree(n));
    }

    }

