package kolekcje.zadanie3;

public class Car {
    private String nazwa;
    private String rodzajSamochodu;

    public Car(String nazwa, String rodzajSamochodu) {
        this.nazwa = nazwa;
        this.rodzajSamochodu = rodzajSamochodu;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getRodzajSamochodu() {
        return rodzajSamochodu;
    }

    //  NADPISYWANIE METOD:
    @Override
    public String toString() {
        return "Car nazywa się: " + nazwa ;
    }

    @Override
    public int hashCode() {
        return this.nazwa.hashCode() + this.rodzajSamochodu.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return ((Car)o).nazwa.equals(this.nazwa);
    }
}
