import java.util.Scanner;
public class Even {
    static int[] EvenOrOdd(int[] a){
        int n=a.length;
        int count= 0;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                ans[count++]=a[i];
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]%2!=0){
                ans[count++]=a[i];
            }
        }
        return ans;
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
        int[] ans = EvenOrOdd(a);
        for(int i=0;i<n;i++){
            System.out.println(ans[i]);
        }
    }
}
