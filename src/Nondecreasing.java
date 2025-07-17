import java.util.Scanner;
public class Nondecreasing {
    static int[] Noondec(int[] a) {
        int n = a.length;
        int left=0;
        int right=n-1;
        int[] ans = new int[n];
        int k = 0;
        while(left<=right){
            if(Math.abs(a[left]) > Math.abs(a[right])) {
                ans[k++] = a[left]*a[left];
                left++;
            }
            else{
                ans[k++] = a[right]*a[right];
                right--;
            }
        }
        return ans;
    }
    static void reverse(int[] ans){
        int n= ans.length;
        int i=0;
        int j=n-1;
        while(i<j){
           swap(ans,i,j);
           i++;
           j--;
        }
    }
    static void swap(int[] ans,int i,int j){
        int temp=ans[i];
        ans[i] = ans[j];
        ans[j] = temp;
    }
    static void print(int[] ans){
        for(int num:ans){
            System.out.print(" " +num);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of array");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] ans = Noondec(a);
//        for(int num:ans){
//            System.out.print(num);
//        }
        reverse(ans);
        print(ans);
    }
}
