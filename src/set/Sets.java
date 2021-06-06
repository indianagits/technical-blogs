package set;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        System.out.println("Set values: " + set);

        set.remove(12);
        set.remove(5);
        System.out.println("Set values: " + set);
    }
}
