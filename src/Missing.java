import java.util.Scanner;
public class Missing {
    static void Misssing(int[] a){
        for(int i=0;i<a.length;i++){
            if(a[i]+1 != a[i+1]){
                System.out.println(a[i]+1);
                break;
            }
            else{
                continue;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter element");
        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Misssing(a);
    }
}
