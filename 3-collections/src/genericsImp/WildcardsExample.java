package genericsImp;

/*
Wildcards -> allow for flexibility when the exact type parameter is not known or not important in a given context. A plain ? is an
unbounded wildcard (any type).

? extends T -> upper bounded wildcard. Indicates some unknown subtype of T.
? super T -> lower bounded wildcard. Some unknown supertype of T.

Invariance -> If A is a subtype of B - C<A> and C<B> have no subtype relationship. A extends B does not imply C<A> extends C<B>.

class Fruit { }
class Apple extends Fruit { }

List<Apple> apples = new ArrayList<>();
List<Fruit> fruits = apples;   // ❌ compile-time error!

Even though Apple is a fruit, the compiler won't let you assign a List<Apple> to a List<Fruit>. That's invariance at work.

If this were allowed...

List<Apple> apples = new ArrayList<>();
List<Fruit> fruits = apples;
fruits.add(new Orange());     // Suppose you could…
Apple a = apples.get(0);       // …now you’d get an Orange out of your Apple list!


*/

import java.util.ArrayList;
import java.util.List;

public class WildcardsExample {
    public static double sumOfList(List<? extends Number> list) {
        double sum = 0.0;

        for (Number number : list) {
            sum += number.doubleValue();
        }

        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);

        List<Double> doublesList = new ArrayList<>();
        doublesList.add(1.0);
        doublesList.add(2.0);

        System.out.println(sumOfList(intList));
        System.out.println(sumOfList(doublesList));
    }
}
