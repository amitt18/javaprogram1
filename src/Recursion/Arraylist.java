package Recursion;
import java.util.*;
public class Arraylist {
    static ArrayList<Integer> allindex(int[] a,int n,int tar,int ind){
        ArrayList<Integer> ans = new ArrayList<>();
  if(ind>=n){
      return ans;// it return empty list
  }
  // self work

  if(a[ind]==tar){
      ans.add(ind);
  }
   ArrayList<Integer> sans = allindex(a,n,tar,ind+1);
  ans.addAll(sans);
  return ans;
    }

    public static void main(String[] args) {
        int[] a  = {1,2,3,4,5,2,3,4,4,3,2};
        int tar = 2;
        int n = a.length;
        ArrayList<Integer> ans = allindex(a,n,tar,0);
        for(Integer num:ans){
            System.out.println(num+" ");
        }
    }
}
