import java.util.Scanner;
public class permutwithoutrepitition {
    public static void main(String[] args) {
        String option = "abc";
        permut(option,"");
    }
    public static void permut(String option,String ans){
        if(option.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<option.length();i++){
            String newoption = option.substring(0,i)+option.substring(i+1);
            permut(newoption,ans+option.charAt(i));
        }
    }
}
