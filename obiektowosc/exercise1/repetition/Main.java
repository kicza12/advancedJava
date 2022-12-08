package obiektowosc.exercise1.repetition;

import java.util.Scanner;

//Napisz klasę Circle, która będzie zawierać infomrację taką jak:
//        - promień
//        Ukryj dostęp do pola klasy. Upublicznij mechanizm obliczania:
//        - pola koła
//        - obwodu okręgu
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj promień: ");
        int r = scan.nextInt();
        Circle circle1 = new Circle(r);
        System.out.println("Wybierz operację: (P - pole), (O - obwód)");
        char sign = scan.next().charAt(0);
        if (sign == 'P' || sign == 'p') {
            circle1.obliczPole(r);
        } else if (sign == 'O' || sign == 'o') {
            circle1.obliczObwod(r);
        } else {
            System.out.println("Błędny znak!");
        }
    }
}
