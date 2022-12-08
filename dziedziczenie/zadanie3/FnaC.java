package dziedziczenie.zadanie3;

// (°F - 32) x 5/9 = °C
public class FnaC implements Conversion {
    @Override
    public void convert(double a) {
        double result = (a - 32) * (5 / 9);
        System.out.println("Wynik = " + result + "°C");

    }
}
