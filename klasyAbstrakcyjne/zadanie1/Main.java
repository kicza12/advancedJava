package klasyAbstrakcyjne.zadanie1;

//Stwórz klasę abstrakcyjną reprezentującą kartę SIM która posiada metodę służącą do dzwonienia przyjmującą numer telefonu oraz metodę abstrakcyjną weryfikującą poprawność numeru.
//Metoda dzwonienia po jej zawołaniu powinna wyświetlić na jaki numer próbujemy zadzwonić a następnie zawołać metodę abstrakcyjną wewnątrz siebie która sprawdzi, czy podany numer jest poprawny, tzn. czy pierwsze cyfry numeru kierunkowego się zgadzają.
// Poprawność numeru również powinna być wyświetlona przez kartę SIM.
//Stwórz następnie klasy PolskaKartaSim oraz NiemieckaKartaSim dziedziczące po klasie karty SIM z odpowiednio zaimplementowaną metodą do weryfikacji poprawności numeru kierunkowego.
public class Main {
    public static void main(String[] args) {
        // intancja klasy PolskaKartaSim
        PolskaKartaSIM pol = new PolskaKartaSIM();
        // instancja klasy NiemieckaKartaSim
        NiemieckaKartaSIM niem = new NiemieckaKartaSIM();
        // wywołujemy metodę zadzwon na obiekcie polska, metoda ta jest odziedziczona przez klasę PolskaKartaSim przez klasę Sim
        pol.zadzwon("+48 333 777 888");
// wywołanie tej samej metody ale na innym obiekcie innej klasy, logika w klasie z kartą Niemiecką nieco się różni,
// bo inne numery są akceptowane
        niem.zadzwon("+49 653 434 234");
        // dzwonimy ze złym numerem kierunkowym, rezultat to odpowiednia wiadomość w konsoli
        pol.zadzwon("+45 653 434 234");
        niem.zadzwon("+41 653 434 234");
//        PRZYKŁAD KLASY ANONIMOWEJ:
        KartaSIM belgijskaKarta = new KartaSIM() {
            @Override
            public boolean CzyNumerJestPoprawny(String numer) {
                return numer.startsWith("+32");
            }
        };
        // true - z instancji klasy PolskaKartaSim wywołujemy metodę którą odziedziczyliśmy
        // z klasy Sim dlatego wszystko wywołać możemy ze zmiennej polska
        boolean czyNumerSieZgadza = pol.CzyNumerJestPoprawny("+48 3593559");
    }
}
