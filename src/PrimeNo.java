import java.util.Scanner;
public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int n = sc.nextInt();
        int temp = 0;
        for (int i = 2; i < n/2; i++) {
            if (n % i == 0 && n > i) {
                temp++;
                break;
            }
        }
        if(temp==0 && n!=1){
            System.out.println("prime number");
        }
        else{
            System.out.println("not prime");
        }
    }
}

