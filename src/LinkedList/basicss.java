package LinkedList;

import java.util.Scanner;

public class basicss {
    public static int length(Node a){
        int count=0;
        Node temp = a;
        if(temp==null) return 0;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        return count;
    }
    public static class Node{
        int data;
        Node next ;
        Node(int data){
            this.data=data;
        }
    }
    public static void display(Node a) {
        Node temp = a;
        while (temp != null) {
            System.out.print(temp.data+"-> ");
            temp = temp.next;
        }
    }
    public static void reverse(Node a){
        Node temp = a;
        if(temp==null) return;
        reverse(temp.next);
        System.out.print(temp.data+"-> ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter values");
        Node a = new Node(sc.nextInt());
        Node b = new Node(sc.nextInt());
        Node c = new Node(sc.nextInt());
        a.next=b;
        b.next = c;
        display(a);
        System.out.println();
        reverse(a);
        System.out.println("length");
        System.out.println();
        System.out.println( length(a));
    }
}
