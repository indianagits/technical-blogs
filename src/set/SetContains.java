package set;

import java.util.HashSet;
import java.util.Set;

public class SetContains {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(7);
        System.out.println("set: " + set);
        // set: [4, 7]

        System.out.println("set contains 4: " + set.contains(4));
        // set contains 4: true

        System.out.println("set contains 3: " + set.contains(3));
        // set contains 3: false
    }
}
