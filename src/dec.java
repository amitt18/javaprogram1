import java.util.Scanner;

public class dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int power = 1;
        while (n > 0) {
            int k = n % 10;
            ans = (k * power) + ans;
            n = n / 10;
            power *= 2;
        }
        System.out.println(ans);
    }
}
