package exercise3.powtorka;

public class Main {
    public static void main(String[] args) {
        Kino kino = new Kino();
        Kino.Bilet bilet1 =  kino.kupBilet(22.80f,"American Beauty", "12:00");
        bilet1.getSala().getNumerSali();

    }
}
