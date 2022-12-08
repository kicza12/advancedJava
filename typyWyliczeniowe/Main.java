package typyWyliczeniowe;

public class Main {
    public static void main(String[] args) {
        int[] tablica = {2, 5, 6, 7, 8};
        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i]);
        }
        for (int i : tablica) {
            System.out.println(i);
        }
//        nie można tworzyć instancji enumów
        Auto typ = Auto.ELEKTRYCZNE;
        if (typ == Auto.SPALINOWE) {
        }
        Auto latajace = Auto.valueOf("LATAJACE");
        Auto[] autos = Auto.values();
        for (Auto enumAuto : autos) {
            System.out.println(enumAuto);
        }
        Auto.ELEKTRYCZNE.getMarka();

    }
}
