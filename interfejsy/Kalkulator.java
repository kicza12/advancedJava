package interfejsy;

import java.util.Scanner;

public interface Kalkulator {
    //    wszystkie metody intefejsu są abstrakcyjne
    public void readNumber(int number1, int number2);

    public int giveResult();

    //    metody defaultowe
    public default int readFromScannerAndGiveResult() {
        Scanner scan = new Scanner(System.in);
        this.readNumber(scan.nextInt(), scan.nextInt());
        return this.giveResult();
    }
}
