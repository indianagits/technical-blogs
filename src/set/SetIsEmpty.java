package set;

import java.util.HashSet;
import java.util.Set;

public class SetIsEmpty {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(7);
        set.add(-2);
        System.out.println("set: " + set);
        // set: [-2, 4, 7]

        System.out.println("set isEmpty: " + set.isEmpty());
        // set isEmpty: false

        set.clear();

        System.out.println("set isEmpty after clear: " + set.isEmpty());
        // set isEmpty after clear: true
    }
}
