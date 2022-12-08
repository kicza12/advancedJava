package interfejsy;

public class Main {
    public static void main(String[] args) {

        Kalkulator kalkulator = new DodajLiczby();
        kalkulator.readNumber(123, 123);
        System.out.println(kalkulator.giveResult());
        int obliczone = oblicz(new PomnozLiczby(), 1, 1);
        obliczone = oblicz(new DodajLiczby(), 1, 1);
        Kalkulator kalkulator1 = new PomnozLiczby();
        kalkulator1.readFromScannerAndGiveResult();
        PomnozLiczby pomnozLiczby = new PomnozLiczby();
        pomnozLiczby.readFromScannerAndGiveResult();

    }

    public static int oblicz(Kalkulator kalkulator, int number1, int number2) {
        kalkulator.readNumber(number1, number2);
        return kalkulator.giveResult();
    }
}
