package Sorting;
import java.util.*;
public class Movvezeerotoend {
    public static void main(String[] args) {
        int[] a = {3,0,5,0,65};
        for(int i=0;i<a.length;i++){
            boolean flag = false;
            for(int j=0;j<a.length-1;j++){
                if(a[j]==0 && a[j+1]!=0){
                    int t = a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                    flag =true;
                }
            }
            if(flag==false){
                break;
            }
        }
        for(int r:a){
            System.out.println(r);
        }
    }
}
