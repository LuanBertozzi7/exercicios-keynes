import java.util.Random;

public class SimularDado {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] freq = new int[6];
        for (int i = 0; i < 100; i++) freq[rand.nextInt(6)]++;
        for (int i = 0; i < 6; i++) System.out.println((i + 1) + ": " + freq[i]);
    }
}
