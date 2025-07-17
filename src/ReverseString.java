import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";
        StringBuilder ans = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            ans.append(str.charAt(i));
        }
        System.out.println(ans+ " ");
    }
}
