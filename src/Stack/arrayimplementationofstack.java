package Stack;

import java.util.Stack;

public class arrayimplementationofstack {
    public static class Stack{
      private   int[] arr = new int[5];
      private int idx=0;
        void push(int x){
            if(isfull()){
                System.out.println("stack is full");
                return;
            }
            arr[idx]= x;
            idx++;
        }
        int peek(){
            if(idx==0) {
                System.out.println("stack is empty");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx==0){
                System.out.println("empty");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;

        }
        void display(){
            for(int i=0;i<=idx-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isempty(){
            if(idx==0){
                return true;
            }
            return false;
        }
        boolean isfull(){
            if(idx==arr.length){
                return true;
            }
            return false;
        }

    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.push(5);
        st.push(1);
        st.push(6);
        st.push(7);
        st.push(8);
       st.display(); // 4  5 1
        System.out.println(st.size()); //3
        st.pop();
        st.display();  // 4 5
    }
}
