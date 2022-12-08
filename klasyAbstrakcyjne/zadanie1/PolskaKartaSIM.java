package klasyAbstrakcyjne.zadanie1;
// dziedziczy po klasie abstrakcyjnej Sim
public class PolskaKartaSIM extends KartaSIM {
    // nadpisujemy metodę, to znaczy ta adnotacja
    @Override
    // metoda abstrakcyjna
    // którą musimy zaimplementować bo dziedziczymy po klasie abstrakcyjnej
    public boolean CzyNumerJestPoprawny(String numer) {
        // logika metody, zwracamy czy podany parametr zaczyna się od +48 (zwracamy true/false)
        return numer.startsWith("+48");
    }
}
