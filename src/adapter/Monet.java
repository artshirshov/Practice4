package adapter;

import java.util.Random;

public class Monet {
    Random r;

    public Monet() {
        r = new Random();
    }

    public int BrosokM(){
        return r.nextInt(2) + 1;
    }
}
