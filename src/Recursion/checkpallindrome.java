package Recursion;
import java.util.*;
public class checkpallindrome {
    static boolean chkplindrm(String str,int l,int r){
        if(l>=r) return true;
         return (str.charAt(l)==str.charAt(r) && chkplindrm(str,l+1,r-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(chkplindrm(str,0,str.length()-1));
    }
}
