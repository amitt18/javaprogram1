import java.util.Scanner;
public  class Maximum{
//    public  static  void MaxElement(int[] a) {
//        int max = a[0];
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] > max) {
//                max = a[i];
//            }
//
//        }
//        System.out.println(max);
//    }
        public static void SmaxElement ( int[] a){
            int lar = Integer.MIN_VALUE;
            int slar = Integer.MIN_VALUE;
            for (int i = 0; i < a.length; i++) {
                if(a[i]>lar){
                    slar=lar;
                    lar=a[i];
                }
                else if(a[i]>slar && a[i]< lar){
                    slar = a[i];
                }

            }
            System.out.println(lar);
            System.out.println(slar);
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
       SmaxElement(a);
    }
}
