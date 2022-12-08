package dziedziczenie.zadanie3;

public class KnaC implements Conversion {
    //℃ = K – 273.15
    @Override
    public void convert(double a) {
        double result = a - 273.15;
        System.out.println("Wynik = " + result + "℃");

    }
}
