import java.util.*;
public class Unique {
    static void FindUnique(int[] a){
        int n = a.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    a[i]= -1;
                    a[j] = -1;
                }
            }
        }
        int ans = -1;
        for(int i=0;i<n;i++){
            if(a[i]>0){
                ans = a[i];
                System.out.println(ans);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter elements of array");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        FindUnique(a);
    }
}
