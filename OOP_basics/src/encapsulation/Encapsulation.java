package encapsulation;

// Encapsulation -> hide object's internal state. Can only be accessed by using methods (getters/setters). Can be achieved through
// use of access modifiers and getter/setter methods. By keeping fields private and exposing only necessary methods (using protected or public),
// you control how data can be accessed or modified from outside the class. Helps prevent unintended reference and misuse of internal state of
// an object.

/*
Access modifiers:
private -> Accessible only within same class
default -> accessible within same package. Default modifier is nothing is specified. Only classes in same package can access it.
protected - accessible within same package, just like default and also subclasses.
public - accessible from any other class w/o any restriction
*/

class Account {
    private String owner;
    private double balance;

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Account account = new Account("John", 500);
        System.out.println(account.getOwner());
        System.out.println(account.getBalance());
    }
}
