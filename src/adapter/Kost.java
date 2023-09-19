package adapter;

import java.util.Random;

public class Kost implements IGame{
    Random r;

    public Kost() {
       r = new Random();
    }


    @Override
    public int Brosok() {
        return r.nextInt(6) + 1;
    }
}
