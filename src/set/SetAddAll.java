package set;

import java.util.HashSet;
import java.util.Set;

public class SetAddAll {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(12);
        set.add(8);
        System.out.println("set: " + set);

        Set<Integer> anotherSet = new HashSet<>();
        anotherSet.add(1);
        anotherSet.add(9);
        anotherSet.add(3);

        System.out.println("anotherSet: " + anotherSet);

        set.addAll(anotherSet);

        System.out.println("set after addAll: " + set);
    }
}
