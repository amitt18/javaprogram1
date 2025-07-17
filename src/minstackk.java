import java.util.Stack;

public class minstackk {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int[] arr = {7,8};
        int min = Integer.MAX_VALUE;
        Stack<Integer> gt = new Stack<>();
        for(int i=0;i<arr.length;i++){
            st.push(arr[i]);
            if(arr[i]<min) {
                gt.push(arr[i]);
                min = arr[i];
            }
            else gt.push(min);
        }
        System.out.println(gt.peek());
    }
}
