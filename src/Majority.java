import java.util.*;
public class Majority {
    static void MajorityElement(int[] a){
        int n = a.length;
        int rev=a[0];
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    count++;
                }
               if(count>rev){
                   rev = a[i];
               }
            }
        }
        System.out.println(rev);
    }
    public static void main(String[] args){
        int[] a = {1,1,1,2,2,2,1};
        MajorityElement(a);


    }

}
