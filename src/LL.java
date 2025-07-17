import java.util.*;
class node{
    int data;
    node next;
    node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LL {
    static void printinfo(node cn){
        node curr = cn;
        while(curr!=null){
            System.out.print(curr .data+" =>  ");
            curr  = curr .next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        node n1 = new node(10);
        node n2 = new node(20);
        node n3 = new node(30);
        node n4 = new node(40);
        n1.next = n2;
        n2.next=n3;
        n3.next = n4;
        printinfo(n1);
    }
}
