package typyWyliczeniowe.ezample;

import java.util.ArrayList;
import java.util.List;

//POJO
public class Zamowienie {
    private int id;
    private double cena;
    private List<Towar> towar = new ArrayList<>();

    private TypZamowienia typ;

    public Zamowienie(int id, TypZamowienia typ) {
        this.id = id;
        this.typ = typ;
    }

    public void addTowar(Towar towar) {
        this.towar.add(towar);
    }

    public double getCena() {
        double cena = 0;
        for (Towar t : this.towar) {
            cena += t.getPrice();//cena = cena + t.getPrice()
        }
        return cena;
    }

    public TypZamowienia getTyp() {
        return typ;
    }

    public void czyZamowieniePowinnoBycRealizowane() {
        if (this.typ == TypZamowienia.WOLNE) {

        } else {
            System.out.println();
        }
    }
}
