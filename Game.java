import java.util.Scanner;

public class Game {
    Player player1;
    Player player2;
    private int numberOfRounds;

    public void start(Scanner input) {
        String userChoice;

            do {
                System.out.printf("Kasta %s!%n", player1.getName());
                userChoice = input.nextLine();
                player1.setHighscore(D6.roll());
                if (userChoice.equalsIgnoreCase("end")) {
                    break;
                }
                System.out.printf("Du rullade %d%n", player1.getHighscore());
                System.out.println("---------------");

                System.out.printf("Kasta %s!%n", player2.getName());
                System.out.println("---------------");
                userChoice = input.nextLine();
                player2.setHighscore(D6.roll());
                if (userChoice.equalsIgnoreCase("end")) {
                    break;
                }
                System.out.printf("Du rullade %d%n%n", player2.getHighscore());
                System.out.println("---------------");

                if (player1.getHighscore() > player2.getHighscore()) {
                    System.out.printf("%s vann!%n", player1.getName());
                    System.out.println("----------------");
                    player1.win();
                } else if (player1.getHighscore() < player2.getHighscore()) {
                    System.out.printf("%s vann!%n", player2.getName());
                    System.out.println("---------------");
                    player2.win();
                } else {
                    System.out.println("Lika!");
                }
                addNumberOfRounds();
                System.out.printf("Ställning efter %d ronder!%n", getNumberOfRounds());
                System.out.printf("%s Vinster: %d%n%s Vinster: %d%n",
                        player1.getName(), player1.getWins(), player2.getName(), player2.getWins());
                        System.out.println("---------------");

            } while (true);
    }

    public void addNumberOfRounds() {
        numberOfRounds++;
    }

    public int getNumberOfRounds() {
        return numberOfRounds;
    }

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public int round() {
        int roundScore = 0;
        do {
            
        } while (true);
    }

    public int diceThrow() {
        int roll = D6.roll();
        if (roll == 1) {
            return 0;
        }

        return roll;
    }
}
