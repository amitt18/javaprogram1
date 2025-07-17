import java.util.Scanner;
public class Recursion {
    public  static void print(int x){
        if(x==5){
            return;
        }
        System.out.println("hello");
        print(x+1);
    }

    public static void main(String[] args) {
        print(0);
    }
}
