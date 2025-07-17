import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class sp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new ArrayDeque<>();
        Stack<Integer> st = new Stack<>();
        Stack<Integer> gt = new Stack<>();
        Stack<Integer> rt = new Stack<>();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        q.add(4);
//        q.add(5);
//        q.add(6);
//        q.add(7);
//        q.add(8);
//        q.add(9);
//        q.add(10);
        System.out.println("enter no. of elements");
        int n = sc.nextInt();
        System.out.println("enter "+n+" elements");
        for(int i=0;i<n;i++){
            q.add(sc.nextInt());
        }
        int k = q.size()/2;
        while(k>0){
            st.push(q.remove());
            k--;
        }
        while(q.size()>0){
            gt.push(q.remove());
        }
        while(st.size()>0 && gt.size()>0){
            q.add(gt.pop());
            q.add(st.pop());
        }
       while(q.size()>0){
           rt.push(q.remove());
       }
       // System.out.println(rt);
       while(rt.size()>0){
           System.out.print(rt.peek()+" ");
           rt.pop();
       }

    }
}
