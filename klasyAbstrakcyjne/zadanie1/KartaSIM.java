package klasyAbstrakcyjne.zadanie1;
// tworzymy klasę abstrakcyjną, nie ma konstruktora więc jest domyślny, bez argumentów/parametrów

public abstract class KartaSIM {
    // metoda w klasie abstrakcyjnej z argumentem
    public void zadzwon(String numerTelefonu) {
        System.out.println("Dzwonimy...");
        // weryfikujemy czy numer jest poprawny poprzez wywołanie metody abstrakcyjnej,
        // konkretna implementacja tej metody znajduje się w klasach dziedziczących po klasie abstrakcyjnej Sim
        boolean poprawny = this.CzyNumerJestPoprawny(numerTelefonu);
        System.out.println("Numer jest poprawny: " + poprawny);

    }

    // definicja metody abstrakcyjnej, tutaj tylko zaznaczamy,
    // że jeśli jakaś klasa dziedziczy po tej klasie (Sim) to musi mieć w sobie nadpisaną tę metodę abstrakcyjną
    public abstract boolean CzyNumerJestPoprawny(String numer);

}
