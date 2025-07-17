import java.util.Scanner;
public class per {
    public static void findper(String option,String ans){
        if(ans.length()==3){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<option.length();i++){
            findper(option,ans+option.charAt(i));
        }
    }
    public static void main(String[] args) {
        String option = "abc";
        findper(option,"");
    }
}
