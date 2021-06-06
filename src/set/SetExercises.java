package set;

import java.util.HashSet;
import java.util.Set;

public class SetExercises {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(12);
        set.add(8);
        // System.out.println("set contains: " + set.contains("4"));
        // ???

        Set<Number> numberSet = new HashSet<>();
        Set<Integer> integerSet = new HashSet<>();
        numberSet.addAll(integerSet);
        // works
        // Set<String> stringSet = new HashSet<>();
        // numberSet.addAll(stringSet);
        // won’t work
    }
}
