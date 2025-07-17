package Recursion;
import java.util.*;
public class string {

    // FIRST METHOD TO REMOVE OCCURENCE OF AN ELEMNET

    static String ro(String s, int ind) {
        if (ind == s.length()) return "";
        String sa = ro(s, ind + 1);
        char curr = s.charAt(ind);
        if (curr != 'a') {
            return curr + sa;
        } else {
            return sa;
        }
    }

    // SECOND METHOD TO REMOVE OCCURENCE OF AN ELEMENT


 static String removeoccurence(String s){
     if(s.length()==0) return "";
     String smallans = removeoccurence(s.substring(1));
     char curr = s.charAt(0);
        if (curr != 'a') {
            return curr + smallans;
        } else {
            return smallans;
        }
 }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(ro(str, 0));
        System.out.println(removeoccurence(str));
    }
}
