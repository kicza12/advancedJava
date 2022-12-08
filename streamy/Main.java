package streamy;

//co zmieniło się w Javie 8(streamy, lambda), 9(moduły), 11(aktualizacje co pół roku)? - PYTANIE REKRUTACYJNE
public class Main {
    public static void main(String[] args) {
        FunkcyjnyInterfejs fInterface = new FunkcyjnyInterfejs() {
            //klasa anonimowa!
            @Override
            public int przyjmij(String a, int i, double d) {
                System.out.println();
                return 1;
            }
        };
        fInterface.przyjmij("a", 1, 2.0);
//      TEN SAM ZAPIS CO WYŻEJ
        FunkcyjnyInterfejs fInterface1 = (a, b, c) -> 1;
        FunkcyjnyInterfejs fInterface3 = (a, b, c) -> {
            return 1;
        };
        FunkcyjnyInterfejs fInterface4 = (a, b, c) -> Main.getNumber(a, b, c);
//      TO SAMO CO WYŻEJ
        FunkcyjnyInterfejs fInterface5 = Main::getNumber;
    }

    public static int getNumber(String s, int i, double v) {
        return 10;
    }


}
