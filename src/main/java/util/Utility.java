package util;

import java.text.DecimalFormat;
import java.util.Random;

public class Utility {
    private static final Random random;

    //constructor estatico, inicializador estatico
    static {
        // semilla para el random
        long seed = System.currentTimeMillis();
        random = new Random(seed);
    }

    public static int random(int bound){
        //return (int)Math.floor(Math.random()*bound); //forma 1
        return 1+random.nextInt(bound);
    }

    public static void fill(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = random(99);
        }
    }

    public static String format(long n) {
        return new DecimalFormat("###,###,###.##").format(n);
    }
}
