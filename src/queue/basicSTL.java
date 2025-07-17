package queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class basicSTL {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.remove(5);
        q.remove(1);
        System.out.println(q);

    }
}
