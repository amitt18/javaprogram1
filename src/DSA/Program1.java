package DSA;
import java.util.*;
public class Program1 {
    public static void remove(String str) {
        TreeSet<Character> set = new TreeSet<>();
        for(char ch:str.toCharArray()){
            set.add(ch);
        }
        for(char ch:set){
            System.out.print(ch);
        }
       // System.out.println(set);
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    remove(str);
    }
}
