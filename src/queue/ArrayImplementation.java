package queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayImplementation {
    public static class queueA{
        int f = -1;
        int r = -1;
        int size=0;
        int[] arr = new int[100];
        public void add(int val){
            if(r==arr.length){
                System.out.println("full");
                return ;
            }
            if(f==-1 && r== -1) {
                f = r = 0;
                arr[++r] = val;
            }
            else{
                arr[++r] = val;
            }
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("empty");
                return -1;
            }
            f++;
            size--;
            return arr[f-1];

        }
        public int peek(){
            if(size==0){
                System.out.println("empty");
                return -1;
            }
            return arr[f];
        }
        public boolean isempty(){
            if(size==0) return true;
            return false;
        }
        public void display() {
            if (size == 0) {
                System.out.println("empty");
            } else {
                for (int i = f+1; i <= r; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
          queueA q  =new queueA();
          q.display();
          q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.remove();
        q.display();
        q.isempty();
        System.out.println(q.size);
    }
}
