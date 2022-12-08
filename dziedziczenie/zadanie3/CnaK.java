package dziedziczenie.zadanie3;

public class CnaK implements Conversion {
//K = °C + 273.15

    @Override
    public void convert(double a) {
        double result = a + 273.15;
        System.out.println("Wynik = " + result + "K");
    }
}
