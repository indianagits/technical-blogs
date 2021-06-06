package set;

import java.util.HashSet;
import java.util.Set;

public class SetClear {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(7);
        System.out.println("set: " + set);
        // set: [4, 7]

        set.clear();
        System.out.println("set: " + set);
        // set: []
    }
}
