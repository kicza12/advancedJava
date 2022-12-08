package typyWyliczeniowe.zadanie1;

public enum Continent {
    AFRYKA(30.4), AMERYKA_POLUDNIOWA(17.8), AMERYKA_POLNOCNA(24.2), ANTARKTYDA(13.2), AUSTRALIA(7.7), EUROPA(10.53), AZJA(44.58);

    private double powierzchnia;

    Continent(double powierzchnia) {
        this.powierzchnia = powierzchnia;
    }

    public double getPowierzchnia() {
        return powierzchnia;
    }

    public static Continent najmniejszyKontynent() {
        return Continent.valueOf("AUSTRALIA");
    }

    public static Continent najwiekszyKontynent() {
        return Continent.valueOf("AZJA");

    }
}
