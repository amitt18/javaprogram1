package OOPS.java;

import java.util.*;

public class Arraylist {
    public static class arrayList{
        int[] arr = new int[2];
        int size=0 ;
        int idx=0;
        public void add(int ele){
            if(size==arr.length){
                int[] brr = Arrays.copyOf(arr,arr.length*2);
//
                arr = brr;
            }
            arr[size]= ele;
            size++;
            idx++;

        }
        public int size(){
            return size;
        }
    }
    public static void main(String[] args) {
        arrayList arr = new arrayList();
        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(4);
        System.out.println(arr.size());
    }
}
