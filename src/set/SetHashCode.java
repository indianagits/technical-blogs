package set;

import java.util.HashSet;
import java.util.Set;

public class SetHashCode {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(7);
        set.add(-2);
        System.out.println("set: " + set);
        // set: [-2, 4, 7]

        System.out.println("set hashCode: " + set.hashCode());
        // set hashCode: 9
    }
}
