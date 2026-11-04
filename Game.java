public class Game {
    Player player1;
    Player player2;
    private int numberOfRounds;

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
