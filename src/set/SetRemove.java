package set;

import java.util.HashSet;
import java.util.Set;

public class SetRemove {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(7);
        set.add(5);
        set.add(2);
        System.out.println("set: " + set);
        // set: [2, 4, 5, 7]

        System.out.println("set remove 4: " + set.remove(4));
        // set remove 4: true

        System.out.println("set after remove 4: " + set);
        // set after remove 4: [2, 5, 7]

        System.out.println("set remove 3: " + set.remove(3));
        // set remove 3: false

        System.out.println("set after remove 3: " + set);
        // set after remove 3: [2, 5, 7]
    }
}
