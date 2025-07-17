import java.util.*;

public class MapInterface {
    public static void main(String[] args) {
     Map<Integer,String> mp = new HashMap<>();
     mp.put(3,"amit");
        mp.put(1,"anjt");
        mp.put(4,"aert");
        mp.put(6,"avit");
        mp.remove(1);
        mp.putIfAbsent(7,"KOHLI");
        System.out.println(mp);
        System.out.println(mp.containsKey(6));
        System.out.println(mp.containsValue("anit"));
    }
}
