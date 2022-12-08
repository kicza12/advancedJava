package dziedziczenie.polimorfizm;

public class Main {
    public static void main(String[] args) {
        Liczba1 liczba1 = new Liczba1();
        Liczba2 liczba2 = new Liczba2();

        int rezultat1 = returnGetNumber(liczba1);
        int rezultat2 = returnGetNumber(liczba2);

        liczba1.przelicz();
    }

    public static int returnGetNumber(MojInterfejs liczba) {
        return liczba.getNumber();
    }
}
