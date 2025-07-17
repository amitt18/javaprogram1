package LinkedList;

public class DoublyLinkedList {
    public static class Node {
        int val;
        Node prev;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }
    public static void displayrev(Node head){
        while(head!=null){
            System.out.print(head.val+"-> ");
            head = head.prev;
        }
    }
    // given random node
    public static void display2(Node random){
        Node temp = random;
        while(temp.prev!=null){
            temp = temp.prev;
        }
        //print the list
        while(temp!=null){
            System.out.print(temp.val+"-> ");
            temp= temp.next;
        }
    }
    public static void display(Node head){
//        Node temp = head;
//        while(temp!=null){
//            System.out.print(temp.val+"-> ");
//            temp = temp.next;
//        }
//        System.out.println("null");
        if(head==null) return;
        System.out.print(head.val+"-> ");
         display(head.next);
    }
    public static Node insertathead(Node head,int val){
        Node t = new Node(30);
        t.next = head;
        head.prev = t;
        head = t;
        return head;
    }
    public static void insertatail(Node head,int val){
       Node temp = head;
       while(temp.next!=null){
           temp = temp.next;
       }
       Node t = new Node(val);
       temp.next = t;
       t.prev = temp;
    }
    public static void insertatidx(Node head,int idx,int val){
Node s = head;
for(int i=1;i<=idx-1;i++){
    s = s.next;
}
Node r = s.next;
Node t = new Node(val);
  s.next = t;
  t.prev = s;
  t.next = r;
  r.prev = t;
    }
    public static void main(String[] args) {
//  4 10 2 99 13
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);
        a.prev = null;
        a.next=b;
        b.prev  = a;
        b.next=c;
        c.prev = b;
        c.next=d;
        d.prev = c;
        d.next=e;
        e.prev=d;
        e.next=null;
        display(a);
        System.out.println(" ");
        insertatail(a,20);
        display(a);
        System.out.println(" ");
        insertatidx(a,3,56);
        display(a);
//        System.out.println(" ");
//        displayrev(e);
//        System.out.println(" ");
//        display2(c);
//        System.out.println(" ");
//        Node newhead = insertathead(a,35);
//        display(newhead);
    }
}
