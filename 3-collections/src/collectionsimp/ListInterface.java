package collectionsimp;

/*
List -> Ordered collection that allows duplicate elements and provides positional access. ArrayList and LinkedList are implementations of it.
ArrayList -> Resizable array implementation of List, optimal for fast random access
LinkedList -> Doubly linked list implementation, good for frequent insertions or deletions in the middle.
*/

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Pear");

        System.out.println(fruits);

        String firstFruit = fruits.get(0);
        System.out.println(firstFruit);

        for (String fruit : fruits) {
            System.out.println("> " + fruit);
        }

        fruits.remove("Pear");
        System.out.println(fruits);
    }
}
