package LinkedList;
import java.util.*;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class llinked {
    Node head;
    public void insert(int data){
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node temp= head;
        while(temp.next !=null){
            temp = temp.next;
        }
        temp.next= newnode;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void delete(int data){
        if(head==null) return;
        if(head.data==data){
            head = head.next;
            return;
        }
        Node temp=head;
        Node prev = null;
        while(temp!=null && temp.data!=data) {
            prev = temp;
            temp=temp.next;
        }

        if(temp==null){
            System.out.println("not found;");
        }
        prev.next = temp.next;
    }
public void display1(){
        Node temp= head;
        if(temp==null) return;
        temp = temp.next;
    System.out.println(temp.data);
}

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        llinked ll = new llinked();
//        ll.insert(10);
//        ll.insert(20);
//        ll.insert(30);
        System.out.println("enter no.of terms in ll");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            ll.insert(sc.nextInt());
        }
        ll.display();
        System.out.println("enter key u want to delete");
        ll.delete(sc.nextInt());
        ll.display();
        ll.display1();
    }
}
