package obiektowosc.exercise1;

import java.util.Scanner;

//Napisz klasę Circle, która będzie zawierać infomrację taką jak:
//        - promień
//        Ukryj dostęp do pola klasy. Upublicznij mechanizm obliczania:
//        - pola koła
//        - obwodu okręgu
public class Main {
    public static void main(String[] args) {
        System.out.print("Podaj długość promienia ");
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        Circle circle = new Circle(r);
        System.out.println("Obwód okręgu o promieniu = " + circle.getR() + " wynosi = " + circle.obliczObwod());
        System.out.println("Pole koła o promieniu = " + circle.getR() + " wynosi = " + circle.obliczPole());
    }
}
