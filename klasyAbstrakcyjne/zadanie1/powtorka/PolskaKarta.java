package klasyAbstrakcyjne.zadanie1.powtorka;

public class PolskaKarta extends KartaSIM {

    @Override
    public boolean czyNumerJestPoprawny(String numer) {
        return numer.startsWith("+48");
    }
}
