import java.util.*;
public class Intersection{
    static Set<Integer> InterSection(int[] a1,int[] a2){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
            for(int num:a1){
                set1.add(num);
            }
            for(int num:a2){
                if(set1.contains(num)){
                    intersection.add(num);
                }
            }
            return intersection;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] a1 = {1,2,3};
//        int[] a2 = {2,4,5};
        System.out.println("enter size of ist  array");
        int n = sc.nextInt();
        System.out.println("enter size of second aray");
        int m = sc.nextInt();
        int[] a1 = new int[n];
        int[] a2= new int[m];
        System.out.println("enter elements of array");
        for(int i=0;i<n;i++){
            a1[i] = sc.nextInt();
        }
        System.out.println("enter elements of second array");
        for(int i=0;i<m;i++){
            a2[i] = sc.nextInt();
        }
        Set<Integer> intersection =  InterSection(a1,a2);
        System.out.println("intersection of this array is" +intersection);

    }

}
