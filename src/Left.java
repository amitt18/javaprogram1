import  java.util.Scanner;
public class Left {
    static void LeftShift(int[] a,int in) {
        int temp = a[0];
        for (int i = 1; i <in; i++) {
            a[i-1] = a[i];
        }
        a[in] = temp;
    }
    static void print(int[] a){
        for(int nm:a){
            System.out.println(nm);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter indexes");
        int in  =sc.nextInt();
         LeftShift(a,in);
         print(a);
    }
}
