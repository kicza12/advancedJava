package vehicle;

public class CarSpalinowy extends Car {
    private double pojemnosc;

    public CarSpalinowy(String model, int maxPredkosc, double cena, double pojemnosc) {
        super(model, maxPredkosc, cena);

        this.pojemnosc = pojemnosc;
    }
    public void dolejPaliwa(){
        System.out.println("Paliwo dolewane!");
    }
}
