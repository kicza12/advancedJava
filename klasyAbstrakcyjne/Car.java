package klasyAbstrakcyjne;

public abstract class Car {

    private String marka;
    public Car(String marka){
        this.marka = marka;
    }

    public String getMarka() {
        return marka;
    }

    public void otworzDrzwi(){
        System.out.println("Otwieram drzwi!");
    }
//    metoda abstrakcyjna nie zawiera ciała!
    public abstract void miganieSwiatlami(int dlugosc);
    public abstract int przebieg();
}
