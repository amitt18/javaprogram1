import java.util.Scanner;
public class Rrcursion {
//    public static int function1(int x){
//         return 2*x+10;
//    }
//    static public int function2(int x){
//        if(x>0){
//            return 4*x+90;
//        }
//        else if(x==0){
//            return 0;
//        }
//        else{
//            return x+10;
//        }
//    }
    static  void doSomething(){
        System.out.println("line 1");
        doSomethingMore();
    }
    static  void doSomethingMore(){
        System.out.println("line 2");
        doSomethingEvenMore();
    }
    static  void doSomethingEvenMore(){
        System.out.println("line 3");
        doSomethingMore();
    }
    public static void main(String[] args) {

    }
}
