package Strings;
import java.util.*;
public class reverseeachword {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        String[] words = input.split(" ");
//        StringBuilder result = new StringBuilder();
//        for(String word:words){
//            StringBuilder wordBuilder = new StringBuilder(word);
//            result.append(wordBuilder.reverse()).append(" ");
//        }
//        System.out.println(result.toString().trim());
        String str = "i am an online educator";
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<=str.length()-1;i++){
            char ch = str.charAt(i);
            if(ch!=' ' ){
                sb.append(ch);
            }
            else{
                sb.reverse();
                ans+=sb;
                ans+=" ";
                sb = new StringBuilder("");
            }
        }
        System.out.println(ans+sb.reverse());
    }
}
