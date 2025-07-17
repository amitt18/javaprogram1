import java.util.Scanner;
public class Sumofele {
    public static void SumOfElemets(int[] a){
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println("the sum of all elements is:" +sum);
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
        SumOfElemets(a);
    }
}
