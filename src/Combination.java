import java.util.Scanner;
public class Combination {
    public static void combi(String option,String ans){
        if(ans.length()==3){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<option.length();i++){
           String no = option.substring(0,i );
           combi(no,ans+option.charAt(i));
        }
    }
    public static void main(String[] args) {
        String option = "abcdef";
        combi(option,"");
    }
}
