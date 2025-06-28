class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptions {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18");
        }

        else {
            System.out.println("Age is " + age);
        }
    }
    public static void main(String[] args) {
        try {
            checkAge(15);
        }

        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
