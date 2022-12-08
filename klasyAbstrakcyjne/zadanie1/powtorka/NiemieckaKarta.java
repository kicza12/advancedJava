package klasyAbstrakcyjne.zadanie1.powtorka;

public class NiemieckaKarta extends KartaSIM {

    @Override
    public boolean czyNumerJestPoprawny(String numer) {
        return numer.startsWith("+49");

    }
}
