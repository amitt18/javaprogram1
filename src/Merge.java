import java.util.*;
public class Merge {
    public static void main(String args[]) {
        int[] a = {2, 5, 7, 9, 11};
        int[] b = {1, 3, 6, 8, 10, 16, 17};
        int l1 = a.length;
        int l2 = b.length;
        int[] r = new int[l1 + l2];
        int l = 0;
        int j = 0;
        int k = 0;
        while(l<l1 && j<l2) {
            if (a[l] < b[j]) {
                r[k++] = a[l];
                l++;
            } else {
                r[k++] = b[j];
                j++;
            }
        }
            while (l < a.length) {
                r[k++] = a[l];
                l++;
            }
            while (j < b.length) {
                r[k++] = b[j];
                j++;
            }
        for(int num:r){
            System.out.println(num+ " ");
        }
    }
}
