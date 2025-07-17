import java.util.*;
public class checkpallindrome {
    static boolean ispall(String str){
        char c=str.charAt(0);
        char ch = str.charAt(str.length()-1);
        for(char ce:str.toCharArray()) {
            if (c != ch) {
                return false;
            } else if (c == ch) {
                c++;
                ch--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(ispall(str)){
            System.out.println("p");
        }
        else{
            System.out.println("n");
        }
    }
}
