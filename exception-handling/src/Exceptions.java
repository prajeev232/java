/*
Divided into 2 categories -> Checked and unchecked exceptions
Unchecked -> derive from RuntimeException (and its subclasses) or from Error.
Checked -> All other exception classes
Checked exceptions are subject to compile-time checking - java compiler forces you to handle them with try/catch or declare them in method's throws clause.
Unchecked exceptions on the other hand do not require explicit handling.
*/

import java.util.Scanner;

public class Exceptions {
    public static float divide(int x, int y) {
        return x / y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        try {
            float result = divide(x, y);
            System.out.println(result);
        }

        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("finally");
            sc.close();
        }
    }
}
