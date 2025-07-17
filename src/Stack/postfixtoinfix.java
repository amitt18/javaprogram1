package Stack;

import java.util.Stack;

public class postfixtoinfix {
    public static void main(String[] args) {
        String str = "953+4*6/-";    //  output (9-(((5+3)*4)/6))
        Stack<String> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int as = (int)ch;
            if(as>=48 && as<=57){
                String a = ""+ch;
                st.push(a);
            }
            else{
                String v2 = st.pop();
                String v1 = st.pop();
                char o =  ch;
                String a = '('+v1+o+v2+')';
                st.push(a);
            }
        }
        System.out.println(st.peek());
    }
}
