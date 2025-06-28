package genericsImp;

/*
Allows creation of classes, interfaces and methods with type parameters, providing compile-time type safety and eliminating need for most
type casting. Generics enable parameterized types - for example, List<String> vs List<Integer>, allowing reuse of collection classes for any
object type while still enforcing type consistency.
*/

import java.util.ArrayList;
import java.util.List;

class Box<T> {
    private T value;

    public Box (T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

public class GenericsExample {
    public static <X> X getFirst(List<X> list) {
        if (list.isEmpty()) {
            return null;
        }

        return list.get(0);
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>(1);
        Integer integer = integerBox.getValue();
        System.out.println(integer);

        Box<String> stringBox = new Box<>("Test");
        String string = stringBox.getValue();
        System.out.println(string);

        List<String> list = new ArrayList<>();

        list.add("Test");
        list.add("Test 2");
        list.add("Test 3");

        System.out.println(getFirst(list));
    }
}
