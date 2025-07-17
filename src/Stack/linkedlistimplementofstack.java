package Stack;

import java.util.Scanner;

public class linkedlistimplementofstack {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class LLStack{
      private   Node head = null;
      private   int size = 0;
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        int pop(){
            if(head==null){
                System.out.println("listt is empty");
                return-1;
            }
            int x = head.val;
            head = head.next;
            return x;

        }
int peek(){
            if(head==null){
                return -1;

            }
    return head.val;
}
  void displayrec(Node h){
            if(h==null) return;
      displayrec(h.next);
      System.out.print(h.val+" ");
  }
  void display(){
            displayrec(head);
      System.out.println();
  }

void displayrev(){
         Node temp = head;
         while(temp!=null){
             System.out.print(temp.val+" ");
             temp = temp.next;
         }
    System.out.println();
}
int size(){
            return size;
}
boolean isempty(){
         if(size==0){
             return true;
         }
         return false;
}
    }

    public static void main(String[] args) {
      //  Scanner sc = new Scanner(System.in);
        LLStack st = new  LLStack();
        st.push(4);
        st.push(5);
        st.push(1);
        st.push(6);
        st.push(7);
        st.push(8);
       // st.display();
        st.pop();
        st.display();
        System.out.println(st.size());
        System.out.println(st.isempty());
        st.pop();
        st.pop();
        System.out.println(st.size());
       st.displayrev();
    }
}
