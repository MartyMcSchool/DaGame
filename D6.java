import java.util.random.RandomGenerator;

public class D6 {
    private static RandomGenerator random = RandomGenerator.getDefault();

    private D6() {}

    public static int roll() {
        return random.nextInt(1, 7);
    }
}
