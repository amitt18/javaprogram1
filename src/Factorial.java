import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.println("enter value of n");
        int n = sc.nextInt();
        for(int i=n;i>1;i--){
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
