package typyWyliczeniowe.ezample;


public class Main {
    public enum Inner {
        A, B, C;
    }

    public static void main(String[] args) {
        Zamowienie zamowienie = new Zamowienie(0, TypZamowienia.WOLNE);
        System.out.println(zamowienie.getTyp());
        Towar pierogi = new Towar("pierogi", 12d);
        Towar schabowy = new Towar("schabowy", 12d);
        Towar zupa = new Towar("zupa", 12d);
        Towar pierogi1 = new Towar("pierogi", 12d);
        pierogi.equals(pierogi1);//true
        boolean takieSamo = pierogi.hashCode() != pierogi1.hashCode();//false
        Zamowienie zamowienie1 = new Zamowienie(1, TypZamowienia.WOLNE);
        System.out.println(zamowienie1.getCena());
        zamowienie1.addTowar(pierogi);
        zamowienie1.addTowar(zupa);
        System.out.println(zamowienie1.getCena());
        zamowienie1.addTowar(schabowy);
        System.out.println(zamowienie1.getCena());

    }
}
