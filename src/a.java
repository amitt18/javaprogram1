public class a {
//    public static int sum(int n){
//        if (n==1) {
//            System.out.println(n);
//            return n;
//        }
//        sum(n-1);
//        System.out.println(n);
//        //sum(n-1);
//        return n;
//    }
//    public static int fib(int n){
//        if(n==0) return 0;
//        if(n==1)   return 1;
//        return fib(n-1)+fib(n-2);
//    }

    public static int fact(int n){
        if(n==1) return 1;
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        //sum(n);
       // fib(n);
//        for (int i=0;i<n;i++){
//            System.out.print(fib(i)+" ");
//        }
        System.out.println(fact(n));
    }
}
