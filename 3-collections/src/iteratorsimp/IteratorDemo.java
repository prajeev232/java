package iteratorsimp;

/*
Iterator: Traditional way using Iterator interface's hasNext(), next() and remove() methods.
For-each loop ( enhanced for loop ): Introduced in Java 5, a simplified loop that hides the iterator boilerplate.
Spliterator: Introduced in Java 8, a special iterator that can split the iteration workload, primarily to support parallel processing.
This is used by streams.
*/

import java.util.*;

public class IteratorDemo {
    public static void iteratorExample() {
        List<String> list = new ArrayList<String>();

        list.add("Alpha");
        list.add("Beta");
        list.add("Gamma");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();

            System.out.println(element);

            if (element.equals("Alpha")) {
                iterator.remove();
            }
        }

        System.out.println(list);
    }

    public static void forEachExample() {
        Set<String> cities = new HashSet<String>();

        cities.add("Paris");
        cities.add("London");
        cities.add("New York");

        System.out.println("Cities");

        for (String city : cities) {
            System.out.println(city);
        }
    }

    public static void spliteratorExample() {
        List<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Delta");

        Spliterator<String> namesIterator = names.spliterator();

        Spliterator<String> namesIterator2 = namesIterator.trySplit();

        if (namesIterator2 != null) {
            System.out.println("Output from spliterator2: ");
            namesIterator2.forEachRemaining(System.out::println);
        }

        System.out.println("Spliterator 1 output: ");
        namesIterator.forEachRemaining(System.out::println);
    }

    public static void main(String[] args) {
        spliteratorExample();
    }
}
