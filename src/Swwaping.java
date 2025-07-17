import java.util.Scanner;
import java.util.Set;
public class Swwaping {
    static void Swapping(int a,int b){
        a = a^b;
        b=a^b;
        a=a^b;
        System.out.println("value after swapping " +a+" and "+b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first no.");
        int a = sc.nextInt();
        System.out.println("enter second no.");
        int b  =sc.nextInt();
        System.out.println("value before swapping " +a+" and  "+b);
        Swapping(a,b);
    }
}
