package klasyAbstrakcyjne.zadanie1.powtorka;
//Stwórz klasę abstrakcyjną reprezentującą kartę SIM która posiada metodę służącą do dzwonienia przyjmującą numer telefonu oraz metodę abstrakcyjną weryfikującą poprawność numeru.
//Metoda dzwonienia po jej zawołaniu powinna wyświetlić na jaki numer próbujemy zadzwonić a następnie zawołać metodę abstrakcyjną wewnątrz siebie która sprawdzi, czy podany numer jest poprawny, tzn. czy pierwsze cyfry numeru kierunkowego się zgadzają.
// Poprawność numeru również powinna być wyświetlona przez kartę SIM.
//Stwórz następnie klasy PolskaKartaSim oraz NiemieckaKartaSim dziedziczące po klasie karty SIM z odpowiednio zaimplementowaną metodą do weryfikacji poprawności numeru kierunkowego.

public class Main {
    public static void main(String[] args) {
        PolskaKarta pl = new PolskaKarta();
        NiemieckaKarta gr = new NiemieckaKarta();
        pl.zadzwon("+48 345 938 243");
        pl.zadzwon("+47 345 938 243");



    }
}
