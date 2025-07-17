import java.util.*;
public class Aremstrong {
    public static boolean isArmstrong(int number){
        int or = number;
        int sum=0;
        int nod = String.valueOf(number).length();
        while(number!=0){
            int dg = number%10;
            sum+= Math.pow(dg,nod);
            number/=10;
        }
        return sum==or;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
}
