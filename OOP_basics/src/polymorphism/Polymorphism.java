package polymorphism;

// Polymorphism -> Many forms. This means, you can treat an object of a subclass as an object of its superclass (or implementation of interface)
// and the appropritate overridden method will be called based on the actual object type at runtime. This is known as dynamic dispatch
// or virtual method invocation.

// Static - method overloading. Same method name but different param list.
// Dynamic - method overriding -

class Animal {
    public void makeSound() {
        System.out.println("Animal makeSound: Animal makeSound!");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog makeSound: Dog makeSound!");
    }

    public void eat() {
        System.out.println("Dog eat: Dog eat!");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Cat meows: Cat meows!");
    }

    public void eat() {
        System.out.println("Cat eat: Cat eat!");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();

        Animal cat = new Cat();
        cat.makeSound();
    }
}
