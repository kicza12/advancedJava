package klasyAbstrakcyjne;

import klasyAbstrakcyjne.Car;

public class CarSpalinowy extends Car {

    private float pojemnosc;


    public CarSpalinowy(float pojemnosc) {
        super("BMW");
        this.pojemnosc = pojemnosc;
    }

    @Override
    public void miganieSwiatlami(int dlugosc) {
        System.out.println("Migam przez czas: " + dlugosc);
    }

    @Override
    public int przebieg() {
        return (int) (Math.PI * 23);
    }
}
