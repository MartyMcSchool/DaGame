import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in);) {
            System.out.println("Push your luck!");
            System.out.print("Spelare 1: ");
            Player player1 = new Player(input.nextLine());

            System.out.print("Spelare 2: ");
            Player player2 = new Player(input.nextLine());

            Game game = new Game(player1, player2);

            int rollSum = 0;
            String userChoice;

            do {
                System.out.printf("Kasta %s!%n", player1.getName());
                userChoice = input.nextLine();
                player1.setHighscore(D6.roll());
                if (userChoice.equalsIgnoreCase("end")) {
                    break;
                }
                System.out.printf("Du rullade %d%n", player1.getHighscore());

                System.out.printf("Kasta %s!%n", player2.getName());
                userChoice = input.nextLine();
                player2.setHighscore(D6.roll());
                if (userChoice.equalsIgnoreCase("end")) {
                    break;
                }
                System.out.printf("Du rullade %d%n", player2.getHighscore());

                if (player1.getHighscore() > player2.getHighscore()) {
                    System.out.printf("%s vann!%n", player1.getName());
                    player1.win();
                } else if (player1.getHighscore() < player2.getHighscore()) {
                    System.out.printf("%s vann!%n", player2.getName());
                    player2.win();
                } else {
                    System.out.println("Lika!");
                }
                game.addNumberOfRounds();
                System.out.printf("Ställning efter %d ronder!%n", game.getNumberOfRounds());
                System.out.printf("%s Vinster: %d%n%s Vinster: %d%n",
                        player1.getName(), player1.getWins(), player2.getName(), player2.getWins());

            } while (true);

        } catch (IllegalArgumentException e) {
            System.err.println();
        }

    }

    public void displayMenu() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
