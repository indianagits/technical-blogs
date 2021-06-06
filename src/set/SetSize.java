package set;

import java.util.HashSet;
import java.util.Set;

public class SetSize {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(12);
        set.add(8);
        System.out.println("set: " + set);
        // set: [3, 5, 8, 12]

        System.out.println("set size: " + set.size());
        // set size: 4

        set.remove(8);

        System.out.println("set size after remove: " + set.size());
        // set size after remove: 3
    }
}
