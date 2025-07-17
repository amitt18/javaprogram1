import java.util.HashMap;
import java.util.Stack;

public class stackpractice {
    public static void main(String[] args) {
        int[] arr = {100,80,60,70,60,75,85};
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        st.push(arr[0]);
       map.put(arr[0],1);

        for(int i=1;i<n;i++){
            int c=1;
            while(st.peek()<arr[i]) {
                st.pop();
                c++;
            }
            st.push(arr[i]);
          map.put(arr[i],c);

        }
        System.out.println(map);
    }
}

