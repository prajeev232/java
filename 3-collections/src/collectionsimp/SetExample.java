package collectionsimp;

/*
Unordered collection of unique elements. Implementations -> HashSet, LinkedHashSet and TreeSet.

HashSet -> Stores elements in hash table. O(1) time for basic operations. Doesn't guarantee any order of iteration
LinkedHashSet -> Maintains insertion order while preventing duplicates.
TreeSet -> Stores elements in sorted order by natural ordering or by comparator
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        fruits.add("Pear");
        fruits.add("Apple");
        fruits.add("Pear");

        System.out.println(fruits);

        System.out.println("Iterating over set: ");
        Iterator<String> iterator = fruits.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        if (fruits.contains("Pear")) {
            System.out.println("Pear is in the set");
        }

        fruits.remove("Pear");
        System.out.println(fruits);
    }
}
