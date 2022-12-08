package klasyAbstrakcyjne.zadanie2;

public class Lecturer extends  Person {
    private  String specjalizacja;
    private int wynagrodzenie;
    public Lecturer(String specjalizacja, int wynagrodzenie){
        this.specjalizacja = specjalizacja;
        this.wynagrodzenie = wynagrodzenie;
    }

    public String getSpecjalizacja() {
        return specjalizacja;
    }

    public void setSpecjalizacja(String specjalizacja) {
        this.specjalizacja = "programowanie";
    }

    public int getWynagrodzenie() {
        return wynagrodzenie;
    }

    public void setWynagrodzenie(int wynagrodzenie) {
        this.wynagrodzenie = 5000;
    }

    @Override
    public void showDetails() {
        System.out.println(getName());
        System.out.println(getAddress());
        System.out.println(getSpecjalizacja());
        System.out.println(getWynagrodzenie());
    }
}
