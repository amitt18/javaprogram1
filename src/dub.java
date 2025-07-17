import java.util.ArrayList;
import java.util.Scanner;

public class dub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dec = sc.nextInt();
        StringBuilder binary = new StringBuilder();
        while(dec>0){
            int rem = dec%2;
            binary.insert(0,rem);
            dec/=2;
        }
        System.out.println(binary);
    }
}