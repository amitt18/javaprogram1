import java.util.*;
public class alter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a1 = {1,3,5,7,9};
        int[] a2 = {2,4,6,8,9};
        int m=a1.length;
        int n=a2.length;
        int[] amit = new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n) {
            if (a1[i] <= a2[j]) {
                amit[k++] = a1[i];
                i++;
            } else {
                amit[k++] = a2[j];
                j++;
            }
        }
            while(i<a1.length){
                amit[k++]=a1[i];
                i++;
            }
            while(j<a2.length){
                amit[k++]=a2[j];
                j++;
            }

        for(int num:amit){
            System.out.println(num+" ");
        }
    }
}
