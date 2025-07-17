package Stack;

import java.util.Stack;

public class prefixtopstfix {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<String> st = new Stack<>();
        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            int as = (int)ch;
            if(as>=48 && as<=57){
                String a = ""+ch;
                st.push(a);
            }
            else{
                String v1 = st.pop();
                String v2 = st.pop();
                char o =  ch;
                String a = v1+v2+o;
                st.push(a);
            }
        }
        System.out.println("the required postfix expression is:"+st.peek());
    }
}
