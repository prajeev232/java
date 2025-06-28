package objects;

// Class -> Blueprint/template that defines the state and behavior for a category of objects
// State is implemented by fields/vars and behavior is provided through methods
// Object -> Also called instance. Concrete realization of a class.

public class Car {
    String color;
    int speed;

    void drive(int increment) {
        speed += increment;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.color = "red";
        car.speed = 5;

        car.drive(1);

        System.out.println(car);
    }
}
