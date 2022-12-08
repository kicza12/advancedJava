package dziedziczenie.zadanie3;

public class CnaF implements Conversion {
    //    °F = (°C × 1.8) + 32
    @Override
    public void convert(double a) {
        double result = (a * 1.8) + 32;
        System.out.println("Wynik = " + result + "°F");
    }
}
