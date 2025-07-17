package Recursion;
import java.util.*;
public class Keypadcombi {
    static void combi(String dig,String[] kp,String res){
if(dig.length()==0){
    System.out.print(res+" ");
    return;
}
     int currnum=dig.charAt(0)-'0';
String currchoice = kp[currnum];
for(int i=0;i<currchoice.length();i++){
    combi(dig.substring(1),kp,res+currchoice.charAt(i));
}
    }
    public static void main(String[] args) {
        String dig = "7799";
        String[] kp = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        //             0   1   2     3    4     5     6      7      8      9
combi(dig,kp,"");
    }
}
   // KEYPAD
//   1   2      3
//      abc   def
//  4    5     6
// ghi  jkl  mno
//  7    8    9
// pqrs  tuv  wxyz