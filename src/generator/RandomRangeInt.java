package generator;

import java.util.concurrent.ThreadLocalRandom;

public class RandomRangeInt {
    public static int getNumber(int from, int before){
        return ThreadLocalRandom.current().nextInt(from, before);
    }
}
