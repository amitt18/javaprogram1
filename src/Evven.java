import java.util.Scanner;
public class Evven {
    static void EvenOr(int[] a){
        int n=a.length;
        int left=0;
        int right=n-1;
        while(left<right){
            if(a[left]%2==1 && a[right]%2==0){
                Swap(a,left,right);
                left++;
                right--;
            }
            if(a[left]%2==0){
                left++;
            }
             if(a[right]%2==1){
                right--;
            }
        }
    }
    static void Swap(int[] a, int left, int right) {
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ente3r size of array");
        int n=sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter element of array");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        EvenOr(a);
        for(int i=0;i<n;i++){
            System.out.print(" " +a[i]);
        }
    }
}
