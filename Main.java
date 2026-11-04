import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in);) {
            Game game = setUp(input);
            game.start(input);

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

    }

    public static Game setUp(Scanner input) {
        System.out.println("Push your luck!");
        System.out.print("Spelare 1: ");
        Player player1 = new Player(input.nextLine());

        System.out.print("Spelare 2: ");
        Player player2 = new Player(input.nextLine());

        return new Game(player1, player2);
    }


    public void displayMenu() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
