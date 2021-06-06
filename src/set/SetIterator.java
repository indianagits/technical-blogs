package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIterator {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(7);
        set.add(2);
        System.out.println("set: " + set);
        // set: [2, 4, 7]

        Iterator<Integer> it = set.iterator();
        it.next();
        it.remove();

        System.out.println("set after remove: " + set);
        // set after remove: [4, 7]

        System.out.println("Iterating set: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        // Iterating set: 4 7
    }
}
