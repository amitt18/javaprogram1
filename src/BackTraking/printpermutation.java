package BackTraking;

import java.util.*;

public class printpermutation {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        String str = "abc";
        printp(str,"",l);
        System.out.println(l);
    }
    public static void printp(String str,String ans, List<String> l){
        int n = str.length();
        if(n==0){
           l.add(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            String pre = ans+str.charAt(i);
            String rem = str.substring(0,i)+str.substring(i+1);
            printp(rem,pre,l);
        }
    }

}
