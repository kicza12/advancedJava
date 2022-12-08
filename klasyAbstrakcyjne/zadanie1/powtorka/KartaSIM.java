package klasyAbstrakcyjne.zadanie1.powtorka;

public abstract class KartaSIM {

    public void zadzwon(String numerTelefonu) {
        System.out.println("Dzwonimy na numer: " + numerTelefonu);
        boolean poprawny = this.czyNumerJestPoprawny(numerTelefonu);
        System.out.println("Podany numer jest poprawny: " + poprawny);
    }

    public abstract boolean czyNumerJestPoprawny(String numer);

}
