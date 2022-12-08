package vehicle;

public class Car {
    private String model;
    private int maxPredkosc;
    private double cena;

    public Car(String model, int maxPredkosc, double cena) {
        this.model = model;
        this.maxPredkosc = maxPredkosc;
        this.cena = cena;
    }

    public void otworzDrzwi() {
        System.out.println("Drzwi otwarte!");
    }
}
