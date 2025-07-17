import java.util.*;
public class llist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ll = new LinkedList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            ll.add(sc.nextInt());
        }
        System.out.print(ll);
        System.out.println();
        Collections.sort(ll);
        System.out.print(ll);
        ll.remove(2);
        System.out.println();
        System.out.println(ll);
        ll.remove(sc.nextInt());
        System.out.println();
        System.out.println(ll);
        ll.remove(sc.nextInt());
        System.out.println();
        System.out.println(ll);
    }
}
