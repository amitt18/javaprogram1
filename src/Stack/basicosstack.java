package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class basicosstack {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(10);
        st.push(11);
        st.push(12);
        st.push(13);
        System.out.println(st.peek());
        while(st.size()>2){
            st.pop();
        }
        System.out.println(st.peek());
    }
}
