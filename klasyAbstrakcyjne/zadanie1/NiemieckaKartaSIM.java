package klasyAbstrakcyjne.zadanie1;

public class NiemieckaKartaSIM extends KartaSIM {
    @Override
    public boolean CzyNumerJestPoprawny(String numer) {
        // tym razem logika weryfikująca numer jest inna
        // i stworzenie instancji tej klasy przyjmie tylko numer zaczynający się od +49
        return numer.startsWith("+49");
    }
}
