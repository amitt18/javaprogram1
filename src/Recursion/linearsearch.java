package Recursion;
import java.util.*;
public class linearsearch {

    // THIS CODE WILL RETURN TRUE AND FALSE VALUE
    // WHETHER ELEMENT IS PRESENT OR NOT
//    static boolean ls(int[] a,int n,int tar,int ind){
//        // Base Case
//        if(ind>=n)return false;
//        // self work
//        if(a[ind]==tar)return true;
//        //recursive work
   //    return (ls(a,n,tar,ind+1));
//    }

    // THIS METHOD WIL  PRINT ALL INDEX  OF ELEMENT
    // IF NOT PRESENT JUST RETURN

    static void  ls(int[] a,int n,int tar,int ind){
        // Base Case
        if(ind>=n) {
            return ;
        }
        // self work
        if(a[ind]==tar) {
            System.out.println(ind + " ");
        }
        //recursive work
         ls(a,n,tar,ind+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1,2,3,4,5,4,4,5};
        int tar=4;
        int n = a.length;

        // THIS IS FOR BOOLEAN METHOD TO RETURN TRUE FALSE
//        if(ls(a,n,tar,0)){
//            System.out.println("yes");
//        }
//        else{
//            System.out.println("no");
//        }

        // THIS CALL IS FOR PRINTING OF INDEX AT WHICH ELEMENT IS FOUND
        ls(a,n,tar,0);
    }
}
