import java.util.Scanner;

public class abc {
    public void addall(int...amit) {
        int sum = 0;
        for (int a : amit) {
            sum += a;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        abc a = new abc();
        a.addall(10,20,30,40);
//        int n = sc.nextInt();
//       // int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        addall(arr);
    }
}
