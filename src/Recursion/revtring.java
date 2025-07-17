package Recursion;
import java.util.*;
public class revtring{
    static String reverse(String s,int ind){
        if(ind==s.length()-1){
            System.out.println(s.charAt(ind));
            return "";
        }
         reverse(s,ind+1);
        System.out.println(s.charAt(ind));
        return "";
    }
    static String rev(String s){
        if(s.length()==0) return "";
        String sans= rev(s.substring(1));
        return sans+s.charAt(0);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        reverse(str,0);
        System.out.println( rev( str));

}
}