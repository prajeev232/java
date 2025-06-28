package inheritance;

// Inheritance -> Allows one class to inherit fields and methods from another class

class Animal {
    public void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barks: Woof!");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("Cat meows: Meow!");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Cat cat = new Cat();
        cat.eat();
        cat.meow();
    }
}