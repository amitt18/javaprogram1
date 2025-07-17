import java.util.Scanner;
public class SwapNo {
    static void Swap(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("value after swapping :");
        System.out.println("value of a is : " +a);
        System.out.println("value of b is : " +b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a:");
        int a = sc.nextInt();
        System.out.println("enter value of b:");
        int b = sc.nextInt();
        System.out.println("value before swapping : ");
        System.out.println(" a : " +a);
        System.out.println(" b : " +b);
        Swap(a,b);
    }

}
