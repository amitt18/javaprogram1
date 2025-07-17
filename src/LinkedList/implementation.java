package LinkedList;

import java.util.LinkedList;

public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;
        int size=0;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head==null){
                head = temp;

            }
            else{
                tail.next = temp;

            }
            tail = temp;
            size++;
        }
        void deleteat(int idx){
            Node temp = head;
            for(int i=0;i<idx-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
//        int size(){
//            int count=0;
//            Node temp = head;
//            while(temp!=null){
//                count++;
//                temp = temp.next;
//            }
//            return count;
//        }
        void insertAtBeg(int val){
            Node temp= new Node(val);
            if(head==null){
                head = temp;
                tail = temp;
            }
            else{

                temp.next = head;
                head = temp;
                size++;
            }

        }
         void insertat(int idx,int data){
            Node t= new Node(data);
            Node temp = head;
            if(idx==size){
                insertAtEnd(data);
            }
            for(int i=0;i<idx-1;i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next= t;
            size++;
        }
       void get(int idx){
            Node temp = head;
            for(int i=0;i<idx;i++){
                temp = temp.next;
            }
           System.out.println(temp.data);
       }

    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
     // ll.display();
//      //  System.out.println( ll.size());
       ll.insertAtEnd(12);
     ll.display();
       ll.insertAtBeg(9);
        System.out.println();
       ll.display();
       ll.insertAtBeg(23);
        System.out.println();
       ll.display();
        System.out.println();
        ll.insertat(3,10);
        ll.display();
        System.out.println();
        ll.get(3);
        System.out.println(ll.size);
        System.out.println();
        ll.deleteat(2);
        ll.display();
    }
}
