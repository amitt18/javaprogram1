package Stack;

import java.util.Stack;

public class displaystack {
    public static void display(Stack<Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        display(st);
        System.out.print(top+" ");
        st.push(top);
    }
    public static void displayreverse(Stack<Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        System.out.print(top+" ");
        displayreverse(st);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        display(st);
        System.out.println();
        displayreverse(st);
       // System.out.println(st);
//        Stack<Integer> rt = new Stack<>();
//        while(st.size()>0){
//            rt.push(st.pop());
//        }
//        while(rt.size()>0){
//            int x= rt.pop();
//            System.out.println(x);
//            st.push(x);
//        }
//        int n = st.size();
//        int [] arr = new int[n];
//        for(int i=n-1;i>=0;i--){
//            arr[i] = st.pop();
//        }
//        for(int g:arr){
//            System.out.println(g+" ");
//            st.push(g);
//        }

//        System.out.println(st);
    }
}
