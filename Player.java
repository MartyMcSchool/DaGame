public class Player {
    private String name;
    private int highscore;
    private int numberOfRounds;
    private int wins;

    public Player(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Spelaren måste ha ett namn.");
        }
        if (name.length() < 2) {
            throw new IllegalArgumentException("Namnet måste vara minst två bokstäver");
        }
        this.name = name;
        this.highscore = 0;
        this.numberOfRounds = 0;
        this.wins = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHighscore() {
        return highscore;
    }

    public void setHighscore(int highscore) {
        this.highscore = highscore;
    }

    public int getNumberOfRounds() {
        return numberOfRounds;
    }

    public void setNumberOfRounds(int numberOfRounds) {
        this.numberOfRounds = numberOfRounds;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    
}
