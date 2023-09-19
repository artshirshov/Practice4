package adapter;

public class Program {
    public static void main(String[] args) {
        Kost kubik = new Kost();
        Gamer g1 = new Gamer("Иван");
        System.out.printf("Выпало очков %d для игрока %s", g1.SeansGame(kubik), g1);

        Monet mon = new Monet();
        IGame bmon = new AdapterGame(mon);
        System.out.printf("Монета показала %d для игрока %s", g1.SeansGame(bmon), g1);
    }
}