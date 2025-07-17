package queue;

public class LLimplementation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val= val;
        }
    }
    public static class queueA{
        Node head=null;
        Node tail=null;
        int size=0;
        public void add(int x){
            Node temp = new Node(x);
              if(size==0){
               head=tail=temp;
               }
              else{
                  tail.next = temp;
                  tail = temp;
              }
              size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("empty");
                return -1;
            }
            int t = head.val;
            head = head.next;
            size--;
           return t;
        }
        public int peek(){
            if(size==0){
                System.out.println("empty");
                return -1;
            }
            return head.val;
        }
        public boolean isempty(){
            if(head==null) return true;
            return false;
        }
        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       queueA q = new queueA();
       q.add(1);
        q.add(3);
        q.add(6);
        q.display();
        System.out.println(q.peek());
        System.out.println(q.size);
        System.out.println(q.isempty());
    }
}
