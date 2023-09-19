package adapter;

public class Gamer {
    public String Name;

    public Gamer(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Adapter.Gamer{" +
                "Name='" + Name + '\'' +
                '}';
    }

    public int SeansGame(IGame ig){
        return ig.Brosok();
    }
}
