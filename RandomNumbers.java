import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumbers {
    public static void main(String[] args) {
        int [] random = new int [10];
        for(int i =0;i<10;i++) {
            random[i] = ThreadLocalRandom.current().nextInt(0, 100);
        }
        System.out.println(Arrays.toString(random));
        }
}
