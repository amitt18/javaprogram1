import java.util.Scanner;
public class Countofunique {
    static void CountOfUnique(int[] a){
        int n=a.length;
        for(int i=0;i<=n/2;i++){
            int count=1;
            for(int j=i+1;j<n;j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
                if(count==1){
                    System.out.println(a[i]);
                }

        }

        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter elements of array");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
   CountOfUnique(a);

    }

}
