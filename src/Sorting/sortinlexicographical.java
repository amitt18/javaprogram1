package Sorting;
import java.util.*;
public class sortinlexicographical {
    static void sortFruits(String[] fruits){
       int n = fruits.length;
       for(int i=0;i<n;i++){
           int min_ind = i;
           for(int j=i+1;j<n;j++){
               if(fruits[j].compareTo(fruits[min_ind])<0){
                   min_ind=j;
               }
           }
           //swap min ind and fruits[j];
           String temp = fruits[i];
           fruits[i] = fruits[min_ind];
           fruits[min_ind]  = temp;
       }
    }

    public static void main(String[] args) {
        String[] fruits = {"kiwi","apple","papaya","mango"};
        sortFruits(fruits);
        for(String val:fruits){
            System.out.println(val+" ");
        }
    }
}
