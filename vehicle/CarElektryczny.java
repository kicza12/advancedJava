package vehicle;

public class CarElektryczny extends Car {
    private int bateria;

    public CarElektryczny(String model, int maxPredkosc, double cena, int bateria) {
        super(model, maxPredkosc, cena);
        this.bateria = bateria;
    }

    public void ladowanieBaterii() {
        System.out.println("Ładowanie baterii!");
    }
}
