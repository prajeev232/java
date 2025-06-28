package abstraction;

/*
Abstraction - Hiding internal details of how something works, only exposing the essential features or behaviors that the outside world
needs to know. Focus on what the object does, not how it does it.

In Java, this is achieved through abstract classes and interfaces.
Abstract classes -> classes declared with 'abstract' keyword. An abstract class may contain abstract methods (methods w/o implementation)
and regular methods too. You can't instantiate an abstract class directl, but you can subclass it. The subclass must implement all abstract
methods, or the subclass itself will be abstract.

Interfaces -> define a contract that classes can implement. An interface in Java is a collection of method declarations (and constants).
They are used to define capabilities or roles that classes can fulfill, unrelated to their position in the class hierarchy. Unlike classes,
interfaces support a form of multiple inheritance - a class can implement multiple interfaces. Java 8+ offers default method implementations
and static methods, but interface methods are implicitly abstract if not marked as default or static.
*/

abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double area();

    public String getColor() {
        return color;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

interface Playable {
    void playSound();
}

class Guitar implements Playable {
    @Override
    public void playSound() {
        System.out.println("Guitar playSound");
    }
}

class Piano implements Playable {
    @Override
    public void playSound() {
        System.out.println("Piano playSound");
    }
}

public class AbstractClasses {
    void start(Playable instrument) {
        instrument.playSound();
    }

    public static void main(String[] args) {
        AbstractClasses abstractClasses = new AbstractClasses();
        abstractClasses.start(new Guitar());
        abstractClasses.start(new Piano());

        Circle circle = new Circle("Red", 1.5);
        System.out.println(circle.area());

        Rectangle rectangle = new Rectangle("Green", 1.5, 1.5);
        System.out.println(rectangle.area());
    }
}
