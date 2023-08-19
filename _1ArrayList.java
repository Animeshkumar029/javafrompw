import java.util.*;

public class _1ArrayList {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add(100);
        a1.add("Animesh");
        a1.add('K');
        a1.add(7.333);
        System.out.println(a1);
        System.out.println(a1.contains("Animesh"));
        a1.add(3, "animesh");
        System.out.println(a1);
        a1.ensureCapacity(10);
        System.out.println(a1);
        a1.add(4, 40);
        System.out.println(a1);
    }
}
