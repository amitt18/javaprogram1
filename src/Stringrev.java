import java.sql.SQLOutput;
import java.util.*;
public class Stringrev {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("welcome");
        l1.add("to");
        l1.add("physics");
        l1.add("wallah");
        System.out.println(l1);
        Collections.sort(l1);
        System.out.println(l1);
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println(l1);
        Collections.reverse(l1);
        System.out.println(l1);
    }
}
