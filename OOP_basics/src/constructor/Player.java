package constructor;

// Special methods used to initialize new objects.
public class Player {
    String name;
    int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public Player() {
        this.name = "Anonymous Player";
        this.score = 0;
    }

    void display() {
        System.out.println("Name: " + name + " has score: " + score);
    }

    public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new Player("Test", 10);

        p1.display();
        p2.display();
    }
}
