package Recursion;
import java.util.*;
public class printallsubsquences {
    static void printssq(String s,String currans){
        if(s.length()==0){
            System.out.println(currans);
            return;
        }
        char curr = s.charAt(0);
        String rem = s.substring(1);
        printssq(rem,currans+curr);
        printssq(rem,currans);
    }
    public static void main(String[] args) {
printssq("abc","");
    }
}
