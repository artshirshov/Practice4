package adapter;

public class AdapterGame implements IGame{
    Monet mot;

    public AdapterGame(Monet mot) {
        this.mot = mot;
    }

    @Override
    public int Brosok() {
        return mot.BrosokM();
    }
}
