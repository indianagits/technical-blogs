package set;

import java.util.HashSet;
import java.util.Set;

public class SetRemoveAll {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(7);
        set.add(9);
        set.add(2);
        System.out.println("set: " + set);
        // set: [2, 4, 7, 9]

        Set<Integer> anotherSet = new HashSet<>();
        anotherSet.add(4);
        anotherSet.add(9);
        System.out.println("anotherSet: " + anotherSet);
        // anotherSet: [4, 9]

        System.out.println("set removeAll anotherSet: " + set.removeAll(anotherSet));
        // set removeAll anotherSet: true

        System.out.println("set after removeAll: " + set);
        // set after removeAll: [2, 7]

        anotherSet.add(1);

        System.out.println("set removeAll anotherSet: " + set.removeAll(anotherSet));
        // set removeAll anotherSet: false
    }
}
