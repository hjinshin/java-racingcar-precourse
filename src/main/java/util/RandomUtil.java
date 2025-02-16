package util;

public class RandomUtil {

    private RandomUtil() {
    }

    public static int generateRandomNumber() {
        java.util.Random random = new java.util.Random();
        return random.nextInt(10);
    }
}
